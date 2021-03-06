<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript" src="/qianbaidu/js/profile/Abiaoqian.js">
	
</script>

<html>
<link rel="stylesheet" type="text/css"
	href="/qianbaidu/css/user/profile/qbd.css" />
<link rel="stylesheet" type="text/css"
	href="/qianbaidu/css/user/profile/qbd1.css" />

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心_地址管理</title>
</head>

<body>
	<div id="shouye">
		<div id="shouye1">
			<a href="/qianbaidu/home/shop.jsp" class="logo"> <img
				class="logo1" src="/qianbaidu/img/logo/千百度logo_图片.png"
				style="width: 40px; margin-top: 17px" /> <span
				style="font-size: 20px; font-weight: 800; position: relative; color: #fff; text-align: center;">千百度</span>
			</a> <a href="/qianbaidu/home/shop.jsp" class="sy"> 首页 </a> <a
				href="myorder.jsp" class="wddd"> 我的订单 </a> <a href="" class="jmhz">
				加盟合作 </a>
			<nav id="shouye2"> <a href="" class="fwzx"> <i
				class="fwzx1"> <img src="/qianbaidu/img/home/index/fwzx.jpg" />
			</i> 服务中心
			</a> <a href="" class="gzzx"> 规则中心 </a> <a href="" class="sjyy"> <i
				class="sjyy1"> <img src="/qianbaidu/img/home/index/sjyy.jpg" />
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
				<div id="dz">
					<span class="dqwz"> 当前位置: </span> <span class="dqwz1"> <a
						href="" class="dqwz1_1"> 徐汇区宜山路1388号民润大厦1号楼中软国际 </a>
					</span> <span class="dqwz1_2"> <a href="" class="dqwz1_3">
							[切换地址] </a>
					</span> <span class="transclud"> <i class="icon-arrow-right"> <img
							src="/qianbaidu/img/user/profile/右图标.jpg" />
					</i> <span class="ng-binding-span">地址管理</span>
					</span>
				</div>
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
						<li class="profile-sidebar-section-ul-li"><a
							class="profile-sidebar-a"
							href="/qianbaidu/user/profile/myorder.jsp">近三个月订单</a></li>
						<li class="profile-sidebar-section-ul-li"><a
							class="profile-sidebar-a" href="">待评价订单</a></li>
						<li class="profile-sidebar-section-ul-li"><a
							class="profile-sidebar-a" href="">退单记录</a></li>
					</ul>
				</li>
				<li class="profile-sidebar">
					<h2 class="profile-sidebar-sectiontitle">
						<i class="icon-line-home"> <img
							src="/qianbaidu/img/user/profile/我的的资产.jpg" />
						</i> <a style="color: inherit;">我的资产</a>
					</h2>
					<ul class="profile-sidebar-section-ul">
						<li class="profile-sidebar-section-ul-li"><a
							class="profile-sidebar-a" href="">我的红包</a></li>
						<li class="profile-sidebar-section-ul-li"><a
							class="profile-sidebar-a" href="">账户余额</a></li>
						<li class="profile-sidebar-section-ul-li"><a
							class="profile-sidebar-a" href="">我的积分</a></li>
					</ul>
				</li>
				<li class="profile-sidebar">
					<h2 class="profile-sidebar-sectiontitle">
						<i class="icon-line-home"> <img
							src="/qianbaidu/img/user/profile/我的资料.jpg" />
						</i> <a style="color: inherit;">我的资料</a>
					</h2>
					<ul class="profile-sidebar-section-ul">
						<li class="profile-sidebar-section-ul-li"><a
							class="profile-sidebar-a" href="">个人资料</a></li>
						<li class="profile-sidebar-section-ul-li"><a
							class="profile-sidebar-a" style="color: #0089dc;" href="">地址管理</a>
						</li>
						<li class="profile-sidebar-section-ul-li"><a
							class="profile-sidebar-a" href="">安全中心</a></li>
						<li class="profile-sidebar-section-ul-li"><a
							class="profile-sidebar-a"
							href="/qianbaidu/user/profile/changepassword.jsp">修改密码</a></li>
					</ul>
				</li>
				<li class="profile-sidebar"></li>
			</ul>
			<div id="profile-panel">
				<h3 class="profile-paneltitle-ng-scope">
					<span class=""> 地址管理 </span>
				</h3>
				<div class="profile-panelcontent">
					<div class="desk-top">
						<div class="desktop-addresslist">
							<c:forEach var="address" items="${addresslist}">
								<div class="desktop-addressblock">
									<div class="desktop-addressblock-buttons">

										<button class="desktop-addressblock-botton"
											id="update${address.id}">修改</button>
										<button class="desktop-addressblock-botton"
											id="delete${address.id}">删除</button>
									</div>
									<div class="desktop-addressblock-name">
										${user.username} <span
											class="desktop-addressblock-name-binding"></span>
									</div>
									<div class="desktop-addressblock-address" style="height: 50px">

										<textarea rows="2" cols="30" name="address"
											form="address${address.id}" readonly="readonly"
											id="text${address.id}">${address.address}</textarea>
										<form class="" id="address${address.id}"
											action="updateaddress.action" method="post">
											<input type="text" style="display: none"
												value="${address.id}" name="id">
											<!-- <input type="text" style="height:25px;width:200px;z-index:100" value="上海市徐汇区宜山路1388号1号楼中软国际"> -->
											<input type="submit" class="desktop-addressblock-botton"
												style="float: right; display: none" id="submit${address.id}">
										</form>

									</div>
									<%-- 
									<div class="desktop-addressblock-mobile">
									${user.phone}
									</div>
									 --%>
								</div>

								<script type="text/javascript">
									var update = document
											.getElementById('update${address.id}');
									update.onclick = function() {
										var text = document
												.getElementById('text${address.id}');
										text.readOnly = "";
										text.style.backgroundColor = "#ffff66";
										var submit = document
												.getElementById('submit${address.id}');
										submit.style.display = "block";
									}

									var deletebtn = document
											.getElementById('delete${address.id}');
									deletebtn.onclick = function() {
										var conf = confirm('确定删除吗？');
										if (conf) {
											var f = document
													.createElement('form');
											f.style.display = 'none';
											f.action = 'deleteaddress.action';
											f.method = 'post';
											f.innerHTML = '<input type="hidden" name="id" value='+${address.id}+'>';
											document.body.appendChild(f);
											f.submit();
										}
									}
								</script>
							</c:forEach>
							<div class="desktop-addressblock" id="newaddress"
								style="display: none;">
								<div class="desktop-addressblock-buttons">

									<%-- <button class="desktop-addressblock-botton" id="update${address.id}">
											修改
										</button> 
										<button class="desktop-addressblock-botton" id="delete${address.id}">
											删除
										</button> --%>
								</div>
								<div class="desktop-addressblock-name">
									${user.username} <span
										class="desktop-addressblock-name-binding"></span>
								</div>
								<div class="desktop-addressblock-address" style="height: 50px">

									<textarea rows="2" cols="30" name="address" form="address"
										id="text" placeholder="请输入新地址"  style="background-color: rgb(255,255,255); "></textarea>
									<form class="" id="address" action="addaddress.action"
										method="post">
										<input type="text" style="display: none" value="" name="id">
										<!-- <input type="text" style="height:25px;width:200px;z-index:100" value="上海市徐汇区宜山路1388号1号楼中软国际"> -->
										<input type="submit" class="desktop-addressblock-botton"
											style="float: right;" id="submit">
									</form>
								</div>
							</div>
							<button class="desktop-addressblock2" ondblclick=""
								id="addbutton">
								<i class="icon-plus"> <img
									src="/qianbaidu/img/user/profile/加号.jpg"> 添加新地址
								</i>
							</button>

							<script type="text/javascript">
								var add = document.getElementById('addbutton');
								add.onclick = function() {
									var text = document.getElementById('text');
									text.readOnly = "";
									text.style.backgroundColor = "#ffff66";
									var div = document
											.getElementById('newaddress');
									div.style.display = "inline-block";
									add.style.display = "none";
								}
							</script>


						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>