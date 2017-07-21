<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link rel="stylesheet" type="text/css" href="/qianbaidu/css/home/qbd.css" />
	<link rel="stylesheet" type="text/css" href="/qianbaidu/css/home/qbd1.css" />

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>饿了么网上订餐</title>
	</head>

	<body>
		<div id="shouye">
			<div id="shouye1">
				<a href="/qianbaidu/home/shop.jsp" class="logo"> <img class="logo1" src="/qianbaidu/img/home/index/logo.jpg" />
				</a>
				<a href="/qianbaidu/home/shop.jsp" class="sy"> 首页 </a>
				<a href="/qianbaidu/user/profile/myorde.jsp" class="wddd">
					我的订单 </a>
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
						<span class="dlzc1"> <img src="/qianbaidu/img/home/index//dlzc.jpg" />
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
				<form action="" method="post">
					<div id="ss">
						<input type="text" class="ss1_1" placeholder="搜索商家,美食..." /> <input type="submit" class="ss1" name="" value="" />
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
					<a href="/qianbaidu/home/shop.jsp" class="sjfl_2"> 全部商家 </a>
					<a href="#" class="sjfl_2"> 美食 </a>
					<a href="" class="sjfl_2"> 快餐便当 </a>
					<a href="" class="sjfl_2">
						特色菜系 </a>
					<a href="" class="sjfl_2"> 异国料理 </a>
					<a href="" class="sjfl_2"> 小吃夜宵 </a>
					<a href="" class="sjfl_2"> 甜品饮品 </a>
					<a href="" class="sjfl_2"> 果蔬生菜 </a>
					<a href="" class="sjfl_2">
						鲜花蛋糕 </a>
					<a href="" class="sjfl_2"> 商店超市 </a>
					<a href="" class="sjfl_2"> 早餐 </a>
					<a href="" class="sjfl_2"> 午餐 </a>
					<a href="" class="sjfl_2"> 下午茶 </a>
					<a href="" class="sjfl_2"> 晚餐
					</a>
					<a href="" class="sjfl_2"> 夜宵 </a>
				</div>
				<div id="qbdp">
					<div id="clearfix">
						<c:forEach var="store" items="${storelist}">
						<a href="" class="sjpp">
							<div id="rstblock-logo">
								<img src="${store.photo}" width="70" height="70"/>
								<span id="rstblock-span">25分钟</span>
							</div>
							<div id="rstblock-content">
								<div id="rstblock-title">${store.storename}(${store.address})</div>
								<img src="/qianbaidu/img/home/index/星星.jpg" /> <span id="rstblock-monthsales">
								${store.info} </span> <span id="rstblock-cost"> 配送费￥0 </span>
								<div id="rstblock-activity">
									<i class="rstblock-activity">保</i> <i class="rstblock-activity">票</i>
								</div>
							</div>
						</a>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</body>

</html>