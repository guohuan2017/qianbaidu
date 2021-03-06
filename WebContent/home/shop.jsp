<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>千百度网上订餐</title>
		<link rel="stylesheet" type="text/css" href="../css/home/qbd.css" />
		<link rel="stylesheet" type="text/css" href="../css/home/qbd1.css" />
		<link rel="stylesheet" type="text/css" href="../css/Hui-iconfont/1.0.8/iconfont.css" />
		<script type="text/javascript" src="../js/jquery-3.2.1.js"></script>
		<script type="text/javascript" src="../js/home/shop.js"></script>
	</head>

	<body>

		<script type="text/javascript">
			function GetQueryString(name) //这个方法去获得get参数
			{
				var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
				var r = window.location.search.substr(1).match(reg);
				if(r != null)
					return unescape(r[2]);
				return null;
			}

			function load() {
				document.getElementById((GetQueryString("fl"))).focus();
			}

			window.onload = function() {
				load();

			}
		</script>

		<div id="shouye">
			<div id="shouye1">
				<a href="/qianbaidu/home/shop.jsp" class="logo"> <img class="logo1" src="/qianbaidu/img/logo/千百度logo_图片.png" style="width:40px;margin-top:13px" />
				<span style="font-size: 20px;font-weight: 800;position: relative;color: #fff;text-align: center;">千百度</span>
				</a>
				<a href="/qianbaidu/home/shop.jsp" class="sy"> 首页 </a>
				<a href="/qianbaidu/user/profile/myorder.jsp" class="wddd"> 我的订单 </a>
				<a href="" class="jmhz"> 加盟合作 </a>
				<nav id="shouye2">
					<a href="" class="fwzx"> <i class="fwzx1"> <img src="/qianbaidu/img/home/index/fwzx.jpg" />
			</i> 服务中心
					</a>
					<a href="" class="gzzx"> 规则中心 </a>
					<a href="" class="sjyy"> <i class="sjyy1"> <img src="/qianbaidu/img/home/index/sjyy.jpg" />
			</i> 手机应用
					</a>
					<div id="dlzc">
						<span class="dlzc1"> <img
					src="/qianbaidu/img/home/index//dlzc.jpg" />
				</span> <span> <a href="/qianbaidu/user/login.jsp" class="dlzc2">登陆/注册</a>
				</span>
					</div>
				</nav>
			</div>
		</div>
		<div id="quanbu">
			<div id="dzss">
				<div id="dz">
					<span class="dqwz"> 当前位置: </span> <span class="dqwz1"> <a
					href="" class="dqwz1_1"> 徐汇区宜山路1388号民润大厦1号楼中软国际 </a>
				</span> <span class="dqwz1_2"> <a href="" class="dqwz1_3">
						[切换地址] </a>
				</span>
				</div>
				<form action="searchshop.action" method="post">
					<div id="ss">
						<input type="text" class="ss1_1" name="info" placeholder="搜索商家,美食..." />
						<input type="submit" class="ss1" name="" value="" />
					</div>
				</form>
			</div>
			<div id="sqnwm">
				<div id="sqnwm1">
					<img class="takeout" src="/qianbaidu/img/home/index/takeout.408a87.png" />
				</div>
			</div>
			<div id="qbsj">
				<div id="sjfl">
					<span class="sjfl_1"> 商家分类: </span>
					<a href="/qianbaidu/allshopjsp.action?fl=fl1" class="sjfl_2" id="fl1">
						全部商家 </a>
					<a href="/qianbaidu/subtype.action?type=美食&fl=fl2" class="sjfl_2" id="fl2"> 美食 </a>
					<a href="/qianbaidu/subtype.action?type=快餐便当&fl=fl3" class="sjfl_2" id="fl3"> 快餐便当 </a>
					<a href="/qianbaidu/subtype.action?type=特色菜系&fl=fl4" class="sjfl_2" id="fl4"> 特色菜系 </a>
					<a href="/qianbaidu/subtype.action?type=异国料理&fl=fl5" class="sjfl_2" id="fl5"> 异国料理 </a>
					<a href="/qianbaidu/subtype.action?type=小吃夜宵&fl=fl6" class="sjfl_2" id="fl6"> 小吃夜宵 </a>
					<a href="/qianbaidu/subtype.action?type=甜品饮品&fl=fl7" class="sjfl_2" id="fl7"> 甜品饮品 </a>
					<a href="/qianbaidu/subtype.action?type=果蔬生菜&fl=fl8" class="sjfl_2" id="fl8"> 果蔬生菜 </a>
					<a href="/qianbaidu/subtype.action?type=鲜花蛋糕&fl=fl9" class="sjfl_2" id="fl9"> 鲜花蛋糕 </a>
					<a href="/qianbaidu/subtype.action?type=商店超市&fl=fl10" class="sjfl_2" id="fl10"> 商店超市 </a>
					<a href="/qianbaidu/subtype.action?type=早餐&fl=fl11" class="sjfl_2" id="fl11"> 早餐 </a>
					<a href="/qianbaidu/subtype.action?type=午餐&fl=fl12" class="sjfl_2" id="fl12"> 午餐 </a>
					<a href="/qianbaidu/subtype.action?type=下午茶&fl=fl13" class="sjfl_2" id="fl13"> 下午茶 </a>
					<a href="/qianbaidu/subtype.action?type=晚餐&fl=fl14" class="sjfl_2" id="fl14"> 晚餐 </a>
					<a href="/qianbaidu/subtype.action?type=夜宵&fl=fl15" class="sjfl_2" id="fl15"> 夜宵 </a>
				</div>
				<div id="qbdp">
					<div id="clearfix">
						<c:forEach var="store" items="${storelist}">
							<a href="" class="sjpp">
								<div id="rstblock-logo">
									<img src="${store.photo}" width="70" height="70" /> <span id="rstblock-span">25分钟</span>
									<a href="" /qianbaidu/shopfood.action?id=${store.id } " class="sjpp ">
									<div id="rstblock-logo ">
										<img src="${store.photo} " width="70 " height="70 " /> <span
											id="rstblock-span ">25分钟</span>
									</div>
									<div id="rstblock-content ">
										<div id="rstblock-title ">${store.storename}(${store.address})</div>
										<img src="/qianbaidu/img/home/index/星星.jpg " /> <span
											id="rstblock-monthsales "> ${store.info} </span> <span
											id="rstblock-cost "> 配送费￥0 </span>
										<div id="rstblock-activity ">
											<i class="rstblock-activity ">保</i> <i
												class="rstblock-activity ">票</i>
										</div>
										<div id="rstblock-content ">
											<div id="rstblock-title ">${store.storename}(${store.address})</div>
											<img src="/qianbaidu/img/home/index/星星.jpg " /> <span
												id="rstblock-monthsales "> ${store.info} </span> <span
												id="rstblock-cost "> 配送费￥0 </span>
											<div id="rstblock-activity ">
												<i class="rstblock-activity ">保</i> <i
													class="rstblock-activity ">票</i>
											</div>
										</div>
								</a>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
	<div id="side-bar">
		<div id="side-menu">
			<a id="go-to-order" href="#"><i class="Hui-iconfont">&#xe627;</i></a>
			<a id="go-to-cart" href="#"><i
				style="display: block; font-size: 22px; " class="Hui-iconfont">&#xe6b9;</i>购<br>物<br>车</a>
			<a id="go-to-mail" href="#"><i class="Hui-iconfont">&#xe63b;</i></a>
			<a id="appqr"><i class="Hui-iconfont">&#xe6cb;</i></a>
		</div>
		<div id="title">
			<a href="#">购物车</a> <a style="position: absolute; right: 10px; "
				href="#"><i class="Hui-iconfont">&#xe6d7;</i></a>
		</div>

		<div class="cart">
			<dl class="cart-dl">
				<dt class="cart-dt">
					<span>1号购物车</span> <a href="#">[清空]</a>
				</dt>
				<dd class="cart-dd">
					<span class="food-name">农家小炒肉</span>
					<div id="nubmer-btn-group">
						<button class="number-btn"
							ondblclick="reduce(foodid)">-</button>
						<input type="number" min="0" id="foodid-number" class="food-number" />
						<button class="number-btn"
							ondblclick="add(foodid)">+</button>
					</div>
					<span class="price-sum">100</span>
				</dd>
			</dl>
		</div>
		
		<div class="cart">
			<dl class="cart-dl">
				<dt class="cart-dt">
					<span>1号购物车</span> <a href="#">[清空]</a>
				</dt>
				<dd class="cart-dd">
					<span class="food-name">农家小炒肉</span>
					<div id="nubmer-btn-group">
						<button class="number-btn"
							ondblclick="reduce(foodid)">-</button>
						<input type="number" min="0" id="foodid-number" class="food-number" />
						<button class="number-btn"
							ondblclick="add(foodid)">+</button>
					</div>
					<span class="price-sum">100</span>
				</dd>
				<dd class="cart-dd">
					<span class="food-name">农家小炒肉</span>
					<div id="nubmer-btn-group">
						<button class="number-btn"
							ondblclick="reduce(foodid)">-</button>
						<input type="number" min="0" id="foodid-number" class="food-number" />
						<button class="number-btn"
							ondblclick="add(foodid)">+</button>
					</div>
					<span class="price-sum">100</span>
				</dd>
			</dl>
		</div>

		<div id="go-to-confirm-div">
			<p>
				共&nbsp;<span>5</span>&nbsp;份，总计&nbsp;<span>140</span>
			</p>
			<button id="go-to-confirm-btn">去结算</button>
		</div>
	</div>
</body>
</html>