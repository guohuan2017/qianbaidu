<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
				<a href="/qianbaidu/home/shop.jsp" class="logo"> <img class="logo1" src="/qianbaidu/img/home/index/logo.jpg" />
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
					<div id="dz">
						<span class="dqwz"> 当前位置: </span> <span class="dqwz1"> <a
						href="" class="dqwz1_1"> 徐汇区宜山路1388号民润大厦1号楼中软国际 </a>
					</span> <span class="dqwz1_2"> <a href="" class="dqwz1_3">
							[切换地址] </a>
					</span> <span class="transclud"> <i class="icon-arrow-right"> <img
							src="/qianbaidu/img/user/profile/右图标.jpg" />
					</i> <span class="ng-binding-span">设置密码</span>
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
								<a class="profile-sidebar-a" style="color: #0089dc;" href="/qianbaidu/shop/profile/managefood.jsp">管理菜品</a>
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
					<span class="">修改菜品</span>
				</h3>
					<div id="profile-panelcontent">
						<form class="profile-changewd" id="pwform" action="" method="post" enctype="multipart/form-data">
							<div class="formfield">
								<label class="ng-binding">菜品名称</label> <input value="" type="text" name="foodname" id="foodname" class="formfield-npwd" placeholder="请输入菜品名称" />
								<div class="formfield1">
									<span class="formfield-hint-span" id="passwordspan"> <img
									src="/qianbaidu/img/user/profile/大叉.jpg" />菜品名称不能为空
								</span>
								</div>
							</div>
							<div class="formfield">
								<label class="ng-binding">菜品单价</label> <input min="0" value="" type="number" step="0.01" name="foodprice" id="foodprice" class="formfield-npwd" placeholder="请输入菜品单价" />
								<div class="formfield1">
									<span class="formfield-hint-span" id="newpasswordspan"><img
									src="/qianbaidu/img/user/profile/大叉.jpg" />菜品单价不能为空
								</span>
								</div>
							</div>
							<div class="formfield">
								<label class="ng-binding">选择菜品种类</label>
								<select id="foodtype" name="foodtype" style="width:120px; height: 40px;padding: 5px;">
									<option value="快餐">快餐</option>
									<option value="小吃" selected="selected">小吃</option>
									<option value="饮料">饮料</option>
								</select>
								<label class="ng-binding2">或输入菜品种类</label>
								<input type="text" name="foodtype" class="formfield-npwd" placeholder="请输入菜品种类" />
								<div class="formfield1">
									<span class="formfield-hint-span" id="repasswordspan">
										<img src="/qianbaidu/img/user/profile/大叉.jpg" />请选择菜品种类或输入新增菜品种类
									</span>
								</div>
							</div>
							<div class="formfield">
								<label class="ng-binding">菜品介绍</label>
								<input value="" type="text" name="foodinfo" id="foodinfo" class="formfield-npwd" placeholder="请输入菜品介绍" />
							</div>
							<div class="formfield">
								<label class="ng-binding">上传菜品照片</label>
								<input type="file" name="foodphoto" id="foodphoto" class="formfield-npwd" value="请选择照片" />
								<img style="height: 130px; width: 130px; position: absolute; left: 510px; top: -81px;" src="../../img/home/index/轰咖喱饭_看图王.jpg"/>
							</div>
							<div class="formfield">
								<label class="ng-binding"></label>
								<button type="button" class="formfield-button" id="pwbutton">确认修改</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>

</html>