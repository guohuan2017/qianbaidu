<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>确认订单</title>
		<link rel="stylesheet" href="/qianbaidu/css/zhifu/confirm.css" />
		<link rel="stylesheet" type="text/css" href="/qianbaidu/css/Hui-iconfont/1.0.8/iconfont.css" />
	</head>

	<body>
		<div id="head-bar">
			<div id="head-menu">
				<span class="carttopbar-nav-path">
					当前位置:
					<a class="carttopbar-nav-path2" href="">徐汇民润大厦(宜山路北50米)</a>
					<i class="Hui-iconfont">&#xe6d7;</i>
					<a class="carttopbar-nav-path2" href="">${store.storename}</a>
					<i class="Hui-iconfont">&#xe6d7;</i>
					订单信息
				</span>
				<div id="dlzc">
					<span class="dlzc1"> 
				</span> <span> <a class="dlzc2">欢迎:${user.username}</a>
				</span>
				</div>
			</div>
		</div>
		<div id="head-div">
			<div id="head-info">
			
				<!--img class="checkout" src="/qianbaidu/img/home/index/logo.jpg" /  -->
				<span class="checkoutguide">
				订单信息
				</span>
				<div class="checkoutpt">
					<img src="/qianbaidu/img/zhifu/confirm/deskout.jpg" />
				</div>
			</div>

		</div>

		<div id="content-center">
			<div id="order-details">
				<div id="order-details-container">
					<div class="checkoutcart-title">
						<h2 class="title-h2">订单详情</h2>
						<a class="title1" href="">
							< 返回商家修改 </a>
					</div>
					<div class="checkoutcart-tablerow-tablehead">
						<div class="cell-itemname">
							商品
						</div>
						<div class="cell-itemquantity1">
							份数
						</div>
						<div class="cell-itemtotal">
							小计（元）
						</div>
					</div>
					<dl>
						<dt class="checkoutcart-grouptitle-binding">
							购物车
							</dt>
						<c:forEach var="food" items="${foodlist}">
						<dd>
							<div class="checkoutcart-tablerow">
								<div class="foodid" id="foodid${food.id}" style="display:none">
									${food.id}
								</div>
								<div class="cell-binding">
									${food.foodname}
								</div>
								<div class="cell-itemquantity">
									<!--  -->
									<%-- <button style="position: relative; left: 5px;" class="number-btn" id="minusbtn${food.id}"
										ondblclick="reduce(foodid) ">-</button> --%>
									<button style="position: relative; left: 5px;" class="number-btn" id="minusbtn${food.id}">-</button>	
									<input type="text" id="foodidnumber${food.id}" class="food-number" style="width:40px" value="${food.number}" readonly="readonly"/>
									<button style="position: relative; left: -5px; " class="number-btn" id="addbtn${food.id}">+</button>
									<%-- <button style="position: relative; left: -5px; " class="number-btn" id="addbtn${food.id}"
										ondblclick="add(foodid)">+</button> --%>
									<!--  -->
								</div>
								<div class="cell-binding1" id="price${food.id}">
									
								</div>
								<span style="display:none" id="foodprice${food.id}">${food.price}</span>
							</div>
						</dd>
						<script type="text/javascript">
						 	var minus = document.getElementById('minusbtn${food.id}');
						 	var add = document.getElementById('addbtn${food.id}');
						 	
							minus.onclick = function() {
								var num = document.getElementById('foodidnumber${food.id}');
								var value = parseInt(num.value);
					
								if(value>0){
									num.value = value - 1;
								}
								
								var lineprice = document.getElementById('price${food.id}');
								
								var price = document.getElementById('foodprice${food.id}');
								var pricevalue = parseFloat(price.innerHTML);
								
								var cheng = pricevalue * num.value;
								lineprice.innerHTML = cheng;
							}
							add.onclick = function() {
								var num = document.getElementById('foodidnumber${food.id}');
								var value = parseInt(num.value);
								num.value = value + 1;
								
								var lineprice = document.getElementById('price${food.id}');
								
								var price = document.getElementById('foodprice${food.id}');
								var pricevalue = parseFloat(price.innerHTML);
								
								var cheng = pricevalue * num.value;
								lineprice.innerHTML = cheng;
							}							
						</script>
						<script type="text/javascript">
								/* var nums = document.getElementsByClassName('food-number');
								var prices = document.getElementsByClassName('cell-binding1'); */
								var lineprice = document.getElementById('price${food.id}');
								
								var price = document.getElementById('foodprice${food.id}');
								var pricevalue = parseFloat(price.innerHTML);
								
								var num = document.getElementById('foodidnumber${food.id}');
								var numvalue = parseInt(num.value);
								
								var cheng = pricevalue * numvalue;
								lineprice.innerHTML = cheng;
						</script>
						</c:forEach>
						
					</dl>
						
					<!-- 
					<ul>
						<div class="checkoutcart-tablerow2">
							<div class="cell-binding">
								餐盒
							</div>
							<div class="cell-itemquantity2">

							</div>
							<div class="cell-binding2">
								¥3
							</div>
						</div>
						<div class="checkoutcart-tablerow2">
							<div class="cell-binding">
								配送费
							</div>
							<div class="cell-itemquantity2">

							</div>
							<div class="cell-binding2">
								¥5
							</div>
						</div>
					</ul>
					  -->
					<div class="cell-jiesuan">
						￥
						<span class="cell-jine" id="totalprice">
								${total}
							</span>
					</div>
					<div class="cell-jiesuan2">
						共
						<span class="cell-jine2" id="totalnumber">
								${num}
							</span> 份商品
					</div>
				</div>
				
				<script type="text/javascript">
				var div = document.getElementById('order-details-container');
				div.onclick = function() {
					var total = document.getElementById('totalprice');
					var number = document.getElementById('totalnumber');
					
					var nums = document.getElementsByClassName('food-number');
					var prices = document.getElementsByClassName('cell-binding1');
					
					total.value = 0;
					number.value = 0;
					
					for(var i = 0; i < nums.length; i++) {
						var price = parseFloat(prices[i].innerHTML);
						var num = parseInt(nums[i].value);
						
						total.value += price;
						number.value += num;
						
					}
					total.innerHTML = total.value;
					number.innerHTML = number.value;
				}
				</script>
			</div>
			
			
			
			<div id="other-info">
				<div class="checkout-shdz">
					<h2 class="checkout-fkfs-title">收获地址
						<a class="checkout-tjdz" href="">添加新地址</a>
						</h2>
					<ul>
						<li class="checkout-tjdz-bk">
							<i class="Hui-iconfont" style="vertical-align: middle;width: 63px;height: 42px; display: table-cell; border-right: 1px solid #eee;font-size: 30px;text-align: center;color: #999999;">&#xe6c9;</i>
							<div class="checkout-tjdz-address">
								<p>
								<select style="width:120px; height: 40px;padding: 5px;" name="addressid" id="addressid">
									<c:forEach var="address" items="${addresslist}">
									<option value="${address.id}">${address.address}</option>
									</c:forEach>
								</select>
								</p>
							</div>
						</li>
					</ul>
				</div>
				<div class="checkout-fkfs">
					<h2 class="checkout-fkfs-title">付款方式
						<span class="checkout-fkfs-title1" >推荐使用在线支付，不用找零，优惠更多</span>
					</h2>
					<ul>
						<li class="checkout-fkfs-pay">
							<p class="pay-ng-binding">在线支付</p>
							<p class="pay-ng-binding2">支持微信、支付宝、QQ钱包及大部分银行卡</p>
						</li>
						<li class="checkout-fkfs-pay2">
							<p class="pay-ng-binding">货到付款</p>
							<p class="pay-ng-binding2">送货上门后再付款</p>
						</li>
					</ul>
				</div>
				<div class="checkout-xzyh">
					<h2 class="checkout-fkfs-title">选择优惠
					</h2>
					<p class="xzyh-ng-binding">
						<span class="xzyh-ng-span">使用红包</span>
						<span style="color: #999999;">无可用红包</span>
					</p>
					<p class="xzyh-ng-binding">
						<span class="xzyh-ng-span">使用优惠券</span>
						<span style="color: #999999;">网站不支持
						<em style="color: red;font-style: normal;">（仅手机客户端可用）</em>
						</span>
					</p>
				</div>
				<div class="checkout-qtxx">
					<h2 class="checkout-fkfs-title">其他信息
					</h2>
					<p class="xzyh-ng-binding">
						<span class="xzyh-ng-span">配送方式</span>
						<span>本订单由 
						<a style="color:#0089dc;font-style: normal">[蜂鸟专送]</a>
						 提供配送</span>
					</p>
					<p class="xzyh-ng-binding">
						<span class="xzyh-ng-span">送达时间</span>
						<select style="width:120px; height: 40px;padding: 5px;">
							<option>立即送达</option>
							<option>9:00-10:00</option>
							<option>10:00-11:00</option>
							<option>11:00-12:00</option>
							<option>12:00-13:00</option>
							<option>13:00-14:00</option>
							<option>14:00-15:00</option>
						</select>
					</p>
					<p class="xzyh-ng-binding">
						<span class="xzyh-ng-span">订单备注</span>
						<input class="qtxx-ng-input" type="text" name="" id="" value="" />
					</p>
				</div>
				<div class="">
					<button class="qrxd-button" id="xiadan">确认下单</button>
				</div>
				<script type="text/javascript">
				var xiadan = document.getElementById('xiadan');
				xiadan.onclick = function() {
					var total = document.getElementById('totalprice');
					var number = document.getElementById('totalnumber');
					
					var nums = document.getElementsByClassName('food-number');
					var prices = document.getElementsByClassName('cell-binding1');
					
					var foodids = document.getElementsByClassName('foodid');
					
					var order ="";
					
					total.value = 0;
					number.value = 0;
					
					for(var i = 0; i < nums.length; i++) {
						var price = parseFloat(prices[i].innerHTML);
						var num = parseInt(nums[i].value);
						//console.log(nums[i].value);
						//console.log(num);
						if(num > 0){
							total.value += price;
							number.value += num;
							order =order+parseInt(foodids[i].innerHTML)+"_"+num+";";
						}
					}
					
					total.innerHTML = total.value;
					number.innerHTML = number.value;
					
					var select = document.getElementById('addressid'); //定位id
					var index = select.selectedIndex; // 选中索引
					//var text = select.options[index].text; // 选中文本
					var addressid = select.options[index].value; // 选中值
					
					order = total.value+","+${store.id}+","+addressid+","+order;
					//console.log(order);
					
					var f=document.createElement('form');
			        f.style.display='none';
					f.action='order.action';
			        f.method='post';
			        f.innerHTML='<input type="hidden" name="order" value='+order+'>';
			        document.body.appendChild(f);
			        f.submit();
				}
				</script>
			</div>
		</div>
	</body>

</html>