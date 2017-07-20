<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>饿了么收银台</title>
		<link href="../css/zhifu/cashdesk.css" rel="stylesheet">
	</head>

	<body>
		<img src="../img/zhifu/cashdesk/收银台logo.jpg" style="position: absolute;">
		<header id="header"><i class="eleme-icon logo"><h1 class="title"></h1></i></header>
		<main id="main">
			<main data-reactid=".0">
				<section class="container order" data-reactid=".0.0">
					<h3 class="text-muted" data-reactid=".0.0.0">订单详情</h3>
					<div class="order-detail clearfix" data-reactid=".0.0.1">
						<div class="pull-left" data-reactid=".0.0.1.0">
							<p class="text-muted" data-reactid=".0.0.1.0.0">${store.storename}外卖订单</p>
							<p class="hidden" data-reactid=".0.0.1.0.1"><span class="text-muted text-ellipsis order-desc" data-reactid=".0.0.1.0.1.0">
								${user.username} 先生 ${user.phone} 
								${address.address}
								-
								${foodname} x${order.number}
</span>
								<a class="text-primary show-detail text-link" data-reactid=".0.0.1.0.1.1"><span data-reactid=".0.0.1.0.1.1.0">查看详情</span><span class="triangle triangle-down" data-reactid=".0.0.1.0.1.1.1"></span></a>
							</p>
							<div class="order-detail text-muted" data-reactid=".0.0.1.0.2">
								<p data-reactid=".0.0.1.0.2.0">${user.username} ${user.phone} ${address.address}<br>${foodname} x${order.number}
								</p>
							</div>
						</div>
						<p class="pull-right" data-reactid=".0.0.1.1"><span data-reactid=".0.0.1.1.0"><span data-reactid=".0.0.1.1.0.0">支付金额：</span><strong class="text-lg text-highlight" data-reactid=".0.0.1.1.0.1"><span data-reactid=".0.0.1.1.0.1.0">¥</span><span data-reactid=".0.0.1.1.0.1.1">${orderList.total_price}</span></strong></span>
						</p>
					</div>
				</section>
				<section class="container paymethods" data-reactid=".0.1">
					<header data-reactid=".0.1.0">
						<h3 data-reactid=".0.1.0.0">请选择支付方式</h3>
						<p class="text-muted" data-reactid=".0.1.0.1"><span data-reactid=".0.1.0.1.0">请尽快支付</span><span class="text-highlight" data-reactid=".0.1.0.1.1"></span><span data-reactid=".0.1.0.1.2">，逾期订单将自动取消</span></p>
					</header>
					<section class="native-payment-list clearfix hidden" data-reactid=".0.1.1">
						<p class="title text-muted" data-reactid=".0.1.1.0"><span data-reactid=".0.1.1.0.0">饿了么钱包支付</span><span class="text-highlight text-money" data-reactid=".0.1.1.0.1"></span></p>
						<div class="pull-left" data-reactid=".0.1.1.1">
							<p class="text-error" data-reactid=".0.1.1.1.1"></p>
						</div>
						<p class="pull-left show-third text-primary" data-reactid=".0.1.1.2"><span class="show-third-payment hidden" data-reactid=".0.1.1.2.0"><span data-reactid=".0.1.1.2.0.0">查看其他支付方式</span><span class="iconfont icon-arrow" data-reactid=".0.1.1.2.0.1"></span></span>
						</p>
					</section>
					<section class="third-payment" data-reactid=".0.1.2">
						<div data-reactid=".0.1.2.0">
							<p class="title text-muted" data-reactid=".0.1.2.0.0"><span data-reactid=".0.1.2.0.0.0">第三方支付 </span><span class="text-highlight text-money" data-reactid=".0.1.2.0.0.1"> ¥ ${orderList.total_price}</span></p>
							<ul class="third-payment-list clearfix" data-reactid=".0.1.2.0.1">
								<li class="alipay" data-reactid=".0.1.2.0.1.$0">
									<div class="payment-lsit-item-content" data-reactid=".0.1.2.0.1.$0.0">
										<h4 data-reactid=".0.1.2.0.1.$0.0.0">支付宝</h4><small class="text-muted" data-reactid=".0.1.2.0.1.$0.0.2"></small></div>
								</li>
								<li class="weixin" data-reactid=".0.1.2.0.1.$1">
									<div class="payment-lsit-item-content" data-reactid=".0.1.2.0.1.$1.0">
										<h4 data-reactid=".0.1.2.0.1.$1.0.0">微信支付</h4><small class="text-muted" data-reactid=".0.1.2.0.1.$1.0.2"></small></div>
								</li>
							</ul>
						</div>
					</section>
					<footer class="paypassword" data-reactid=".0.1.3">
						<form class="hide" name="password" data-reactid=".0.1.3.1">
							<div class="title" data-reactid=".0.1.3.1.0">
								<p data-reactid=".0.1.3.1.0.0"><span data-reactid=".0.1.3.1.0.0.0">为保障您的钱包资金安全, 请输入</span><strong data-reactid=".0.1.3.1.0.0.1">支付密码</strong></p>
							</div>
							<section class="form-group" data-reactid=".0.1.3.1.1"><input placeholder="请输入6位支付密码" class="" type="password" value="" data-reactid=".0.1.3.1.1.0"><span class="text-muted" data-reactid=".0.1.3.1.1.1">如您忘记密码, 请前往商家版手机端修改</span>
								<a class="text-primary text-link" data-reactid=".0.1.3.1.1.2">忘记密码?</a>
							</section>
							<p class="hidden" data-reactid=".0.1.3.1.2"></p>
						</form>
						<section class="messagebox-backdrop" style="display:none;" data-reactid=".0.1.3.2">
							<div class="messagebox " data-reactid=".0.1.3.2.0"></div>
						</section>
						<section class="modal-backdrop" style="display:none;" data-reactid=".0.1.3.3">
							<div class="modal" data-reactid=".0.1.3.3.0">
								<section class="timeout clearfix" data-reactid=".0.1.3.3.0.0">
									<header class="clearfix" data-reactid=".0.1.3.3.0.0.0"><span class="icon-close pull-right text-muted" data-reactid=".0.1.3.3.0.0.0.0">x</span></header><i class="eleme-icon icon-error pull-left" data-reactid=".0.1.3.3.0.0.1"></i>
									<div class="pull-left clearfix" data-reactid=".0.1.3.3.0.0.2"><strong data-reactid=".0.1.3.3.0.0.2.0"></strong>
										<p class="text-muted" data-reactid=".0.1.3.3.0.0.2.1"></p>
										<footer data-reactid=".0.1.3.3.0.0.2.2"><button class="btn btn-lg btn-primary" data-reactid=".0.1.3.3.0.0.2.2.0"></button><button style="display:none;" class="btn btn-default btn-lg" data-reactid=".0.1.3.3.0.0.2.2.1"></button></footer>
									</div>
								</section>
							</div>
						</section><button type="button" class="btn btn-success btn-lg" data-reactid=".0.1.3.4" onclick="location.href='/qianbaidu/pay.action?orderListid=${orderList.id}&userid=${user.id}'">确认支付</button></footer>
				</section>
				<section class="messagebox-backdrop" style="display:none;" data-reactid=".0.2">
					<div class="messagebox " data-reactid=".0.2.0"></div>
				</section>
			</main>
		</main>
	</body>

</html>