<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>店铺首页</title>
		<link rel="stylesheet" type="text/css" href="/qianbaidu/css/shop/index.css" />
		<link rel="stylesheet" type="text/css" href="/qianbaidu/css/shop/shoppingcart.css" />
		<!--	<script type="text/javascript">
			document.write("<script type='text/javascript' src='/qianbaidu/js/jquery-3.2.1.js?'" + Math.random() + ">" + "</scr" + "ipt>");
		</script>-->
		<link rel="stylesheet" type="text/css" href="/qianbaidu/css/Hui-iconfont/1.0.8/iconfont.css">
		<script type="text/javascript" src="/qianbaidu/js/jquery-3.2.1.js"></script>
		<script type="text/javascript" src="/qianbaidu/js/shop/index.js"></script>
		<script type="text/javascript" src="/qianbaidu/js/shop/shoppingcart.js"></script>
	</head>

	<body>
		<div id="head-div">
			<div id="head-bar">
				<div id="head-bar-center">
					<ul id="head-bar-ul">
						<li id="logo">
							<img id="img-logo" src="../img/logo/千百度logo_图片.png" />
							<span id="font-logo">千百度</span>
						</li>
						<li>
							首页
						</li>
						<li>
							我的订单
						</li>
						<li>
							加盟合作
						</li>
					</ul>
					<nav>
						<a><i style="font-size: 20px; margin-right: 2px" class="Hui-iconfont Hui-iconfont-kefu"></i>服务中心</a>
						<a>规则中心</a>
						<a><i style="font-size: 21px; margin-right: 2px;" class="Hui-iconfont Hui-iconfont-phone"></i>手机应用</a>
						<a style="margin-right: 0; color: white;" id="lr"><i style="font-size: 21px; margin-right: 10px;color: white;" class="Hui-iconfont Hui-iconfont-user"></i>登录/注册</a>
					</nav>
				</div>
			</div>
			<div id="nav-left">
				<ul>
					<li>
						<a href="#">热销</a>
					</li>
					<li>
						<a href="#">优惠</a>
					</li>
					<li>
						<a href="#">免费领红包</a>
					</li>
					<li>
						<a href="#">免费领红包</a>
					</li>
					<li>
						<a href="#">一折特价菜</a>
					</li>
					<li>
						<a href="#">热销商品5折</a>
					</li>
					<li>
						<a href="#">下午茶半价</a>
					</li>
					<li>
						<a href="#">满额赠饮</a>
					</li>
				</ul>
			</div>
			<div id="div-center">
				<div id="shop-title">
					<div id="shop-title-all">
						<img id="shop-face" src="/qianbaidu/img/shop/index/shop-face.png" />
						<div id="shop-introduce">
							<span id="shop-name">我是一只鸡(漕河泾店)</span>
							<span id="shop-details">(1515) 月售2307单</span>
						</div>
						<div>
							<ul id="shop-title-ul">
								<li>
									<div>
										<h1>4.6</h1> 综合评价 高于周边商家 52.0%
									</div>
									<div>
										服务态度 4.7分 菜品评价 4.4分
									</div>
								</li>
								<li>
									分店“挺多”，有时嘴馋了就会去坐坐。菜单里粥粉面饭和甜品“各占一半”，主食味道“挺不错”，甜品还“不错”。双皮奶“每次必点”，奶香“浓郁”，”；招牌西米露倒是“蛮清爽”，值得一试。”，价格“挺便宜”。
								</li>
								<li>
									商家地址： 上海市闵行区东兰路288号4号楼4-123室 营业时间： 10:00-20:30
								</li>
								<li>
									由甜蜜蜜港式茶餐厅（东兰路店）提供配送服务
								</li>
							</ul>
						</div>

					</div>
				</div>
				<div id="shop-info">
					<span class="info-title">
						起送价
					</span>
					<span class="info-title">
						配送费
					</span>
					<span class="info-title">
						平均送达速度
					</span>
					<span class="info-content">
						20元
					</span>
					<span class="info-content">
						配送费￥5
					</span>
					<span class="info-content">
						34分钟
					</span>
				</div>
				<a href="#" id="ilike">
					<i id="ilikestar" class="Hui-iconfont Hui-iconfont-star-o"></i>
					<span id="ilikespan">收藏</span>
				</a>

			</div>
		</div>
		<div id="sort-bar">
			<div id="sort-bar-center">
				<div id="sort-bar-left">
					<a class="nav-bar-a" href="#">所有商品</a>
					<span class="nav-bar-span">|</span>
					<a class="nav-bar-a" href="#">评价</a>
					<span class="nav-bar-span">|</span>
					<a class="nav-bar-a" href="#">商家资质</a>
				</div>
				<div id="sort-bar-right">
					<a class="nav-bar-b" href="#">默认排序</a>
					<span class="nav-bar-span">|</span>
					<a class="nav-bar-b" href="#">评分 &nbsp;<i class="Hui-iconfont Hui-iconfont-arrow1-bottom"></i></a>
					<span class="nav-bar-span">|</span>
					<a class="nav-bar-b" href="#">销量 &nbsp;<i class="Hui-iconfont Hui-iconfont-arrow1-bottom"></i></a>
					<span class="nav-bar-span">|</span>
					<a class="nav-bar-b" href="#">价格 &nbsp;<i class="Hui-iconfont Hui-iconfont-arrow1-bottom"></i></a>
				</div>
				<div id="search-bar">
					<input type="text" id="search-box" placeholder="搜索美食..." />
					<i id="search-btn" class="Hui-iconfont Hui-iconfont-search1" onclick="alert('hello')"> </i>
				</div>
			</div>
		</div>

		<div id="content">
			<div id="content-center">
				<div id="content-center-right">
					<div id="shop-notice">
						<h3 id="notice-title">商家公告</h3>
						<div id="notice-content">
							感谢亲选择蜀地冒菜，本店属于公司旗下品牌直营店 为了确保亲能够及时收到餐品 请您务必在高峰时段提前下单 并尽可能地完善您的送餐地址及联系方式！高峰时间段建议提前订餐，遇到暴雨大雪等恶劣天气送餐有所延误请亲耐心等候！感谢亲的理解与支持！祝您用餐愉快^-^
						</div>
						<div id="deliver-say">
							<label id="deliver-say-title">配送说明：</label>
							<label id="deliver-say-content">配送费￥4</label>
						</div>
						<div id="file-a-complaint">
							<a href="#">举报商家</a>
						</div>
					</div>

				</div>
				<div id="content-center-left">
					<div id="head-catalog">
						<a href="#" class="catalog">热销</a>
						<a href="#" class="catalog">优惠</a>
						<a href="#" class="catalog">免费领红包</a>
						<a href="#" class="catalog">一折特价菜</a>
						<a href="#" class="catalog">热销商品5折</a>
						<a href="#" class="catalog">下午茶半价</a>
						<a href="#" class="catalog">满额赠饮</a>
					</div>
					<div class="catbox">

						<table id="cartTable">
							<thead>
								<tr>
									<th><label><input class="check-all check" type="checkbox"/>&nbsp;全选</label></th>
									<th>商品</th>
									<th>单价</th>
									<th>数量</th>
									<th>小计</th>
									<th style="display: none;">操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="food" items="${foodlist}">
								<tr>
									<td class="checkbox"><input class="check-one check" type="checkbox" /></td>
									<td class="goods"><img src="${food.photo}"/><span>${food.foodname}<br/>${food.foodinfo}</span></td>
									<td class="price">${food.price}</td>
									<td class="count"><span class="reduce"></span><input class="count-input" type="text" value="0" /><span class="add">+</span></td>
									<td class="subtotal">0.00</td>
									<td class="operation" style="display: none;"><span class="delete">删除</span></td>
								</tr>
								</c:forEach>
							</tbody>
						</table>

						<div class="foot" id="foot">
							<label class="fl select-all"><input type="checkbox" class="check-all check"/>&nbsp;全选</label>
							<a class="fl delete" id="deleteAll" href="javascript:;" style="display: none;">删除</a>
							<div class="fr closing">结 算</div>
							<div class="fr total">合计：￥<span id="priceTotal">0.00</span></div>
							<div class="fr selected" id="selected">已选商品<span id="selectedTotal">0</span>件<span class="arrow up">︽</span><span class="arrow down">︾</span></div>
							<div class="selected-view">
								<div id="selectedViewList" class="clearfix">
									<div><img src="images/1.jpg"><span>取消选择</span></div>
								</div>
								<span class="arrow">◆<span>◆</span></span>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
		<div id="cart">
			<div id="bottom-bar">
				<i id="img-cart" class="Hui-iconfont Hui-iconfont-cart-kong"> </i>
				<span id="rmb">￥</span>
				<span id="total-price">20</span>
				<span id="deliver-price">|&nbsp;&nbsp;配送费￥5</span>
			</div>
			<div id="cart-content">
				<ul id="cart-content-ul">
					<li class="cart-content-li" id="cart-content-title">
						<span>购物车</span>
						<a id="clearall" href="#">[清空]</a>
						<a id="add-cart" href="#">
							<i id="add-cart" class="Hui-iconfont Hui-iconfont-cart-kong">
							</i>
							<span class="Hui-iconfont Hui-iconfont-add"></span>
						</a>
					</li>
					<li class="cart-content-li" id="cart-content-li-">
						<span>苏州汤包</span>
						<div id="nubmer-btn-group">
							<button style="position:relative;left: 5px;" class="number-btn" ondblclick="reduce(foodid)">-</button>
							<input type="number" id="foodid-number" />
							<button style="position:relative;left: -5px;" class="number-btn" ondblclick="add(foodid)">+</button>
						</div>
						<span style="color: #f17530;position:absolute; right: 15px;">¥14</span>
					</li>
					<li class="cart-content-li">
						<span>肯德基汉堡</span>
						<div id="nubmer-btn-group">
							<button style="position:relative;left: 5px;" class="number-btn" ondblclick="reduce(foodid)">-</button>
							<input type="number" id="foodid-number" />
							<button style="position:relative;left: -5px;" class="number-btn" ondblclick="add(foodid)">+</button>
						</div>
						<span style="color: #f17530;position:absolute; right: 15px;">¥14</span>
					</li>
				</ul>
				<div class="clearfloat"></div>
			</div>

		</div>

	</body>

</html>