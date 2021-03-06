﻿/**
 * Created by an.han on 13-12-17.
 */
window.onload = function() {
	if(!document.getElementsByClassName) {
		document.getElementsByClassName = function(cls) {
			var ret = [];
			var els = document.getElementsByTagName('*');
			for(var i = 0, len = els.length; i < len; i++) {

				if(els[i].className.indexOf(cls + ' ') >= 0 || els[i].className.indexOf(' ' + cls + ' ') >= 0 || els[i].className.indexOf(' ' + cls) >= 0) {
					ret.push(els[i]);
				}
			}
			return ret;
		}
	}

	var table = document.getElementById('cartTable'); // 购物车表格
	var selectInputs = document.getElementsByClassName('check'); // 所有勾选框
	var checkAllInputs = document.getElementsByClassName('check-all'); // 全选框
	var tr = table.children[1].rows; //行
	var selectedTotal = document.getElementById('selectedTotal'); //已选商品数目容器
	var priceTotal = document.getElementById('priceTotal'); //总计
	var deleteAll = document.getElementById('deleteAll'); // 删除全部按钮
	var selectedViewList = document.getElementById('selectedViewList'); //浮层已选商品列表容器
	var selected = document.getElementById('selected'); //已选商品
	var foot = document.getElementById('foot');

	var checkOnes = document.getElementsByClassName('check-one');
	var countInputs = document.getElementsByClassName('count-input');
	// 计算单行价格
	function getSubtotal(tr) {
		var cells = tr.cells;
		var price = cells[2]; //单价
		var subtotal = cells[4]; //小计td
		var countInput = tr.getElementsByTagName('input')[1]; //数目input
		var span = tr.getElementsByTagName('span')[1]; //-号

		var input = tr.getElementsByTagName('input')[0];

		//写入HTML
		subtotal.innerHTML = (parseInt(countInput.value) * parseFloat(price.innerHTML)).toFixed(2);
		//如果数目只有一个，把-号去掉
		if(countInput.value == 0) {
			span.innerHTML = '';

			input.checked = false;
			//input.onclick();

		} else {
			input.checked = true;
			span.innerHTML = '-';
		}
	}


	// 点击全选框
	for(var y = 0; y < checkAllInputs.length; y++) {
		checkAllInputs[y].onclick = function() {
			for(var j = 0; j < selectInputs.length; j++) {
				selectInputs[j].checked = this.checked;
			}
			if(!this.checked) {
				for(var m = 0; m < countInputs.length; m++) {
					countInputs[m].value = 0;
					getSubtotal(tr[m]);
				}
			}
			if(this.checked) {
				for(var n = 0; n < countInputs.length; n++) {
					if(countInputs[n].value == 0) {
						countInputs[n].value = 1;
					}
					getSubtotal(tr[n]);
				}
			}
			getTotal();
		}
	}

	// 显示已选商品弹层
	selected.onclick = function() {
		if(selectedTotal.innerHTML != 0) {
			foot.className = (foot.className == 'foot' ? 'foot show' : 'foot');
		}
	}

	//已选商品弹层中的取消选择按钮
	selectedViewList.onclick = function(e) {
		var e = e || window.event;
		var el = e.srcElement;
		if(el.className == 'del') {
			var input = tr[el.getAttribute('index')].getElementsByTagName('input')[0]
			input.checked = false;
			
			var countInput = tr[el.getAttribute('index')].getElementsByTagName('input')[1]; //数目input
			countInput.value = 0;
			var subtotal = tr[el.getAttribute('index')].cells[4];
			subtotal.innerHTML = 0;
			getTotal(); 
		}
	}

	
	
	//为每行元素添加事件
	for(var i = 0; i < tr.length; i++) {
		//将点击事件绑定到tr元素
		tr[i].onclick = function(e) {
			var e = e || window.event;
			var el = e.target || e.srcElement; //通过事件对象的target属性获取触发元素
			var cls = el.className; //触发元素的class
			var countInout = this.getElementsByTagName('input')[1]; // 数目input
			var value = parseInt(countInout.value); //数目

			//通过判断触发元素的class确定用户点击了哪个元素
			switch(cls) {
				case 'add': //点击了加号
					countInout.value = value + 1;
					getSubtotal(this);
					break;
				case 'reduce': //点击了减号
					if(value > 0) {
						countInout.value = value - 1;
						getSubtotal(this);
					}
					break;
				case 'delete': //点击了删除
					var conf = confirm('确定删除此商品吗？');
					if(conf) {
						this.parentNode.removeChild(this);
					}
					break;
				case 'check-one check': 
					var input = this.getElementsByTagName('input')[0];
					if(!input.checked) {
						checkAllInputs[0].checked = false;
						checkAllInputs[1].checked = false;
						countInout.value = 0;
					} else {
						countInout.value = 1;
					}
					getSubtotal(this);
					break;
			}
			getTotal();
		}
		// 给数目输入框绑定keyup事件
		tr[i].getElementsByTagName('input')[1].onkeyup = function() {
			var val = parseInt(this.value);
			if(isNaN(val) || val <= 0) {
				val = 0;
			}
			if(this.value != val) {
				this.value = val;
			}
			getSubtotal(this.parentNode.parentNode); //更新小计
			getTotal(); //更新总数
		}
	}

	// 点击全部删除
	deleteAll.onclick = function() {
		if(selectedTotal.innerHTML != 0) {
			var con = confirm('确定删除所选商品吗？'); //弹出确认框
			if(con) {
				for(var i = 0; i < tr.length; i++) {
					// 如果被选中，就删除相应的行
					if(tr[i].getElementsByTagName('input')[0].checked) {
						tr[i].parentNode.removeChild(tr[i]); // 删除相应节点
						i--; //回退下标位置
					}
				}
			}
		} else {
			alert('请选择商品！');
		}
		getTotal(); //更新总数
	}

	// 更新总数和总价格，已选浮层
	function getTotal() {
		var seleted = 0;
		var price = 0;
		var HTMLstr = '';
		for(var i = 0, len = tr.length; i < len; i++) {
			if(tr[i].getElementsByTagName('input')[0].checked) {
				tr[i].className = 'on';
				seleted += parseInt(tr[i].getElementsByTagName('input')[1].value);
				price += parseFloat(tr[i].cells[4].innerHTML);
				HTMLstr += '<div><img src="' + tr[i].getElementsByTagName('img')[0].src + '"><span class="del" index="' + i + '">取消选择</span></div>'
			} else {
				tr[i].className = '';
			}
		}

		selectedTotal.innerHTML = seleted;
		priceTotal.innerHTML = price.toFixed(2);
		selectedViewList.innerHTML = HTMLstr;

		if(seleted == 0) {
			foot.className = 'foot';
		}
	}

	checkAllInputs[0].checked = false;
	// 默认全选
	//  checkAllInputs[0].checked = true;
	//  checkAllInputs[0].onclick();
	
	var foodids = document.getElementsByClassName('foodid');
	var buybtn = document.getElementById("buy");
	
	var storeid = document.getElementsByClassName('storeid');
	
	buybtn.onclick = function() {
		var seleted = 0;
		var price = 0;

		var shoppingcart ="";
//		var shoppingcart = null;
		
//		var seleted = 0;
		var price = 0;
		for(var i = 0; i < tr.length; i++) {
			if(tr[i].getElementsByTagName('input')[0].checked) {
				tr[i].className = 'on';
//				seleted += parseInt(tr[i].getElementsByTagName('input')[1].value);
				price += parseFloat(tr[i].cells[4].innerHTML);
				
				shoppingcart =shoppingcart+foodids[i].innerHTML+"_"+countInputs[i].value+";";
				
			} else {
				tr[i].className = '';
			}
		}
		shoppingcart =price.toFixed(2)+","+storeid[0].innerHTML+","+shoppingcart;
		
		var f=document.createElement('form');
        f.style.display='none';
//      f.action='qianbaidu/buy.action?shoppingcart='+shoppingcart;
		f.action='buy.action';
        f.method='post';
        f.innerHTML='<input type="hidden" name="shoppingcart" value='+shoppingcart+'>';
        document.body.appendChild(f);
        f.submit();
        
        
//		window.location.href='qianbaidu/buy.action?shoppingcart='+shoppingcart;
	}
	
}