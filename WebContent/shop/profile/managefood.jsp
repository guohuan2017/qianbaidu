<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>我的商铺_管理菜品</title>
		<link rel="stylesheet" type="text/css" href="/qianbaidu/css/shop/profile/qbd.css" />
		<link rel="stylesheet" type="text/css" href="/qianbaidu/css/shop/profile/qbd1.css" />
		<script type="text/javascript" src="/qianbaidu/js/jquery-3.2.1.js"></script>
		<script type="text/javascript" src="/qianbaidu/js/profile/profile.js">
		</script>
	</head>
	

	<body>
		<div id="shouye">
			<div id="shouye1">
				<a href="/qianbaidu/home/shop.jsp" class="logo" style="font-family: '幼圆 ';font-size: 18px;font-weight: 700;color: white;">
					<img style="width:40px; position:relative;top:15px" class="logo1" src="/qianbaidu/img/logo/千百度logo_图片.png" /> 千百度
				</a>
				<a href="/qianbaidu/home/shop.jsp" class="sy"> 首页 </a>
				<a href="myorde.jsp" class="wddd"> 我的订单 </a>
				<a href="" class="jmhz">
					加盟合作 </a>
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
				</span> <span> <a class="dlzc2">欢迎:${user.username}</a>
				</span>
					</div>
				</nav>
			</div>
		</div>
		<div id="quanbu">
			<div id="quanbu-1">
				<div id="dzss">
					<!--<div id="dz">
						<span class="dqwz"> 当前位置: </span> <span class="dqwz1"> <a
						href="" class="dqwz1_1"> 徐汇区宜山路1388号民润大厦1号楼中软国际 </a>
					</span> <span class="dqwz1_2"> <a href="" class="dqwz1_3">
							[切换地址] </a>
					</span> <span class="transclud"> <i class="icon-arrow-right"> <img
							src="/qianbaidu/img/user/profile/右图标.jpg" />
					</i> <span class="ng-binding-span">菜品管理</span>
						</span>
					</div>-->
				</div>
				<ul id="profile-sidebar">
					<li class="profile-sidebar">
						<h2 class="profile-sidebar-sectiontitle">
						<i class="icon-line-home"> <img
							src="/qianbaidu/img/user/profile/个人中心.jpg" />
						</i> <a href="" style="color: inherit;">个人中心</a>
					</h2>
					</li>
					<li class="profile-sidebar">
						<h2 class="profile-sidebar-sectiontitle">
						<i class="icon-line-home"> <img
							src="/qianbaidu/img/user/profile/我的订单.jpg" />
						</i> <a style="color: inherit;">我的订单</a>
					</h2>
						<ul class="profile-sidebar-section-ul">
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="/qianbaidu/shop/profile/myorder.jsp">近三个月订单</a>
							</li>
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="">待评价订单</a>
							</li>
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="">退单记录</a>
							</li>
						</ul>
					</li>
					<li class="profile-sidebar">
						<h2 class="profile-sidebar-sectiontitle">
						<i class="icon-line-home"> <img
							src="/qianbaidu/img/user/profile/我的的资产.jpg" />
						</i> <a style="color: inherit;">我的商铺</a>
					</h2>
						<ul class="profile-sidebar-section-ul">
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="/qianbaidu/shop/profile/newfood.jsp">新增菜品</a>
							</li>
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" style="color: #0089dc;" href="/qianbaidu/managefood.action">管理菜品</a>
							</li>
						</ul>
					</li>
					<li class="profile-sidebar">
						<h2 class="profile-sidebar-sectiontitle">
						<i class="icon-line-home"> <img
							src="/qianbaidu/img/user/profile/我的资料.jpg" />
						</i> <a style="color: inherit;">我的资料</a>
					</h2>
						<ul class="profile-sidebar-section-ul">
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="">个人资料</a>
							</li>
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="address.jsp">地址管理</a>
							</li>
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="">安全中心</a>
							</li>
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="changepassword.jsp">修改密码</a>
							</li>
						</ul>
					</li>
					<li class="profile-sidebar"></li>
				</ul>
				<div id="profile-panel">
					<h3 class="profile-paneltitle-ng-scope">
						<span class="">
							菜品列表
						</span>
					</h3>
					<table class="profile-order-list">
						<thead>
							<tr>
								<th>添加时间</th>
								<th style="text-align: left;padding-left: 26px;">菜品内容</th>
								<th style="width: 373px;"></th>
								<th style="width: 100px;">单价(元)</th>
								<th style="width: 146px;">销量(份)</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<tr></tr>
							<c:forEach items="${foodlist}" var="food">
								<tr>
								<td class="ordertimeline-time">
									<p class="ordertimeline-title">07-24</p>
									<p>11:32</p>
									<i style="font-size: 12px;color: #ccc;right: -7px;position: absolute;line-height: 22px;background-color: #fff;top: 39%;" class="Hui-iconfont">&#xe601;</i>
								</td>
								<td class="ordertimeline-avatar">
									<a href="">
										<img src="/qianbaidu/img/home/index/周大虾.JPG"/>
									</a>
								</td>
								<td class="ordertimeline-info">
									<h3 class="ordertimeline-title">
										<a href="">${food.foodname}</a>
									</h3>
									<p class="ordertimeline-info-food">
										<a href="">
											<span>${food.foodinfo}</span>
										</a>
									</p>
								</td>
								<td class="ordertimeline-amount">
									<h3 class="ordertimeline-title">${food.price}</h3>
								</td>
								<td class="ordertimeline-status">
									<h3 class="ordertimeline-title">${salesvolume}</h3>
								</td>
								<td class="ordertimeline-handle">
									<a class="ordertimeline-handle-detail" href="editfood?foodid=${food.id}">修改菜品</a>
									<a class="deletefood" href="deletefood?foodid=${food.id}">删除菜品</a>
								</td>
							</tr>
							</c:forEach>
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</body>

</html>