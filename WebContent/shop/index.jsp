<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>店铺首页</title>
		<link rel="stylesheet" type="text/css" href="../css/shop/index.css" />
		<!--	<script type="text/javascript">
			document.write("<script type='text/javascript' src='../js/jquery-3.2.1.js?'" + Math.random() + ">" + "</scr" + "ipt>");
		</script>-->
		<link rel="stylesheet" type="text/css" href="../css/Hui-iconfont/1.0.8/iconfont.css">
	</head>

	<body>
		<div id="head-div">
			<div id="head-bar">
				<div id="head-bar-center">
					<ul id="head-bar-ul">
						<li id="logo">

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
						<a>服务中心</a>
						<a>规则中心</a>
						<a>手机应用</a>
						<a id="lr">登录/注册</a>
					</nav>
				</div>
			</div>
			<div id="div-center">
				<div id="shop-title">
					<div id="shop-title-all">
						<img id="shop-face" src="../img/shop/index/shop-face.png" />
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
				<i id="ilike" class="Hui-iconfont Hui-iconfont-star-o"></i>
			</div>
		</div>
		<div id="sort-bar">
			<div id="sort-bar-center">
				<div id="sort-bar-left">
					<a class="nav-bar-a" href="#">所有商品</a>
					<span class="nav-bar-span">|</span>
					<a class="nav-bar-a"  href="#">评价</a>
					<span class="nav-bar-span">|</span>
					<a class="nav-bar-a"  href="#">商家资质</a>
				</div>
				<div id="sort-bar-right">
					<a class="nav-bar-b" href="#">默认排序</a>
					<span class="nav-bar-span">|</span>
					<a class="nav-bar-b"  href="#">评分 &nbsp;<i class="Hui-iconfont Hui-iconfont-arrow1-bottom"></i></a>
					<span class="nav-bar-span">|</span>
					<a class="nav-bar-b"  href="#">销量 &nbsp;<i class="Hui-iconfont Hui-iconfont-arrow1-bottom"></i></a>
					<span class="nav-bar-span">|</span>
					<a class="nav-bar-b"  href="#">价格 &nbsp;<i class="Hui-iconfont Hui-iconfont-arrow1-bottom"></i></a>
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

					</div>
				</div>
				<div id="content-center-left">
					<div id="head-catalog">
						<a href="#" class="catalog">热销</a>
						<a href="#" class="catalog">优惠</a>
						<a href="#" class="catalog">免费领红包</a>
						<a href="#" class="catalog">一折特价菜</a>
						<a href="#" class="catalog">热销商品5折</a>
					</div>
					<div class="goods-display">
						<div class="title">
							<h3>热销</h3>
							<span class="catalog-introduce">大家喜欢吃，才叫真好吃。</span>
						</div>
						<div class="good-display">
							<img class="food-img" src="../img/shop/index/food.jpeg"/>
							<P>good-display-left</P>
						</div>
						<div class="good-display">
							<P>good-display-right</P>
						</div>
					</div>
				</div>

			</div>
		</div>

	</body>

</html>