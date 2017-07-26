<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>个人中心-我的订单</title>

		<link rel="stylesheet" type="text/css" href="/qianbaidu/css/user/profile/qbd.css" />
		<link rel="stylesheet" type="text/css" href="/qianbaidu/css/user/profile/qbd1.css" />
		<link rel="stylesheet" type="text/css" href="/qianbaidu/css/Hui-iconfont/1.0.8/iconfont.css"/>
	</head>

	<body>
		<div id="shouye">
			<div id="shouye1">
				<a href="/qianbaidu/home/shop.jsp" class="logo"> <img class="logo1" src="/qianbaidu/img/home/index/logo.jpg" />
				</a>
				<a href="/qianbaidu/home/shop.jsp" class="sy"> 首页 </a>
				<a href="/qianbaidu/profile/myorder.jsp" class="wddd">
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
				</span> <span> <a class="dlzc2">欢迎:${user.username }</a>
				</span>
					</div>
				</nav>
			</div>
		</div>
		<div id="quanbu">
			<div id="quanbu-1">
				<div id="dzss">
					<div id="dz">
						<span class="dqwz"> 当前位置: </span>
						<span class="dqwz1"> 
						<a href="" class="dqwz1_1"> 徐汇区宜山路1388号民润大厦1号楼中软国际 </a>
				</span>
						<span class="dqwz1_2"> 
						<a href="" class="dqwz1_3">
						[切换地址] 
						</a>
				</span>
						<span class="transclud">
					<i class="icon-arrow-right">
						<img src="/qianbaidu/img/user/profile/右图标.jpg"/>
					</i>
					<span class="ng-binding-span">近三个月订单</span>
						</span>
					</div>
				</div>
				<ul id="profile-sidebar">
					<li class="profile-sidebar">
						<h2 class="profile-sidebar-sectiontitle">
							<i class="icon-line-home">
								<img src="/qianbaidu/img/user/profile/个人中心.jpg"/>
							</i>
							<a href="" style=" color: inherit;;">个人中心</a>
						</h2>
					</li>
					<li class="profile-sidebar">
						<h2 class="profile-sidebar-sectiontitle">
							<i class="icon-line-home">
								<img src="/qianbaidu/img/user/profile/我的订单.jpg"/>
							</i>
							<a  style=" color: inherit;;">我的订单</a>
						</h2>
						<ul class="profile-sidebar-section-ul">
							<li class="profile-sidebar-section-ul-li">
								<a class="profile-sidebar-a" style="color: #0089dc;" href="myorder.jsp">近三个月订单</a>
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
							<i class="icon-line-home">
								<img src="/qianbaidu/img/user/profile/我的的资产.jpg"/>
							</i>
							<a  style=" color: inherit;;">我的资产</a>
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
							<i class="icon-line-home">
								<img src="/qianbaidu/img/user/profile/我的资料.jpg"/>
							</i>
							<a  style=" color: inherit;;">我的资料</a>
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
							近三个月订单
						</span>
					</h3>
					<table class="profile-order-list">
						<thead>
							<tr>
								<th>下单时间</th>
								<th style="text-align: left;padding-left: 26px;">订单内容</th>
								<th style="width: 373px;"></th>
								<th style="width: 100px;">支付金额(元)</th>
								<th style="width: 146px;">状态</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<tr></tr>
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
										<a href="">阿三生煎（东兰路）</a>
									</h3>
									<p class="ordertimeline-info-food">
										<a href="">
											<span>牛肉粉丝汤2份</span>
											<span class="ordertimeline-info-productnum">2</span>
											<span>个菜品</span>
										</a>
									</p>
									<p class="ordertimeline-info-food">
										订单号:
										<a href="">3009359670719533300</a>
									</p>
								</td>
								<td class="ordertimeline-amount">
									<h3 class="ordertimeline-title">37.00</h3>
									<p>在线支付</p>
								</td>
								<td class="ordertimeline-status">
									<h3 class="ordertimeline-title">订单已完成</h3>
								</td>
								<td class="ordertimeline-handle">
									<a class="ordertimeline-handle-detail" href="">订单详情</a>
									<a href="">再来一单</a>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</body>

</html>