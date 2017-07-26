<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>个人中心_更改密码</title>
		<link rel="stylesheet" type="text/css" href="/qianbaidu/css/user/profile/qbd.css" />
		<link rel="stylesheet" type="text/css" href="/qianbaidu/css/user/profile/qbd1.css" />
		<script type="text/javascript" src="/qianbaidu/js/jquery-3.2.1.js"></script>
		<script type="text/javascript" src="/qianbaidu/js/user/profile/profile.js">
		</script>
	</head>
	

	<body>
		<div id="shouye">
			<div id="shouye1">
				<a href="/qianbaidu/home/shop.jsp" class="logo"> <img class="logo1" src="/qianbaidu/img/home/index/logo.jpg" />
				</a>
				<a href="/qianbaidu/home/shop.jsp" class="sy"> 首页 </a>
				<a href="myorder.jsp" class="wddd"> 我的订单 </a>
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
								<a class="profile-sidebar-a" href="myorder.jsp">近三个月订单</a>
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
						</i> <a style="color: inherit;">我的资产</a>
					</h2>
						<ul class="profile-sidebar-section-ul">
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="">我的红包</a>
							</li>
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="">账户余额</a>
							</li>
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="">我的积分</a>
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
								<a class="profile-sidebar-a" href="/qianbaidu/user/profile/address.jsp">地址管理</a>
							</li>
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" href="">安全中心</a>
							</li>
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" style="color: #0089dc;" href="changepassword.jsp">修改密码</a>
							</li>
						</ul>
					</li>
					<li class="profile-sidebar"></li>
				</ul>
				<div id="profile-panel">
					<h3 class="profile-paneltitle-ng-scope">
					<span class=""> 设置密码 </span>
				</h3>
					<div id="profile-panelcontent">
						<form class="profile-changewd" id="pwform" action="/qianbaidu/changepassword.action" method="post">
							<p class="changewd-tip">饿了么提示你：使用大小写字母、数字与标点符号的组合，可以大幅提升帐号安全！
							</p>
							<div class="formfield">
								<label class="ng-binding"> 原密码 </label> <input type="password" name="password" id="password" class="formfield-npwd" placeholder="请输入原密码" />
								<div class="formfield1">
									<span class="formfield-hint-span" id="passwordspan"> <img
									src="/qianbaidu/img/user/profile/大叉.jpg" /> 原密码不能为空
								</span>
								</div>
							</div>
							<div class="formfield">
								<label class="ng-binding"> 新密码 </label> <input type="password" name="newpassword" id="newpassword" class="formfield-npwd" placeholder="请输入新密码" />
								<div class="formfield1">
									<span class="formfield-hint-span" id="newpasswordspan"> <img
									src="/qianbaidu/img/user/profile/大叉.jpg" /> 新密码不能为空
								</span>
								</div>
							</div>
							<div class="formfield">
								<label class="ng-binding"> 确认密码 </label> <input type="password" name="repassword" id="repassword" class="formfield-npwd" placeholder="请再次输入密码" />
								<div class="formfield1">
									<span class="formfield-hint-span" id="repasswordspan"> <img
									src="/qianbaidu/img/user/profile/大叉.jpg" /> 请再次输入密码
								</span>
								<span class="formfield-hint-span" id="repasswordspan2"> <img
									src="/qianbaidu/img/user/profile/大叉.jpg" /> 两次密码不同
								</span>
								</div>
							</div>
							<div class="formfield">
								<label class="ng-binding"> </label>
								<button type="button" class="formfield-button" id="pwbutton">确认</button>
							</div>
						</form>
						<div style="text-align: center;width: 620px;"><span style="color: red;">${message}</span></div>
					</div>
				</div>
			</div>
		</div>
	</body>

</html>