<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>开店申请</title>
		<link rel="stylesheet" href="/qianbaidu/css/shop/apply.css" />
		<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=kUAyHUuiEwHVmWdyfap31YWSUBTWjAnE"></script>
		<script type="text/javascript" src="/qianbaidu/js/shop/applyaddress.js"></script>
		<script type="text/javascript">
			function uploadform(){
				var applyform = document.getElementById("applyform");
			var outtel = document.getElementById("outtel").value;
			var storename = document.getElementById("shopname").value;
			console.log(outtel);
			applyform.action="/qianbaidu/store/apply.action?outtel=" + outtel + "&storename=" + storename;
			console.log(applyform.action);
			applyform.submit();
			}
			
		</script>
	</head>

	<body>
		<div id="header-bar">
			<div id="header-bar-center">
				<span class="whitecolor" id="businesscenterspan">饿了么商户中心 </span>
				<a href="#" class="whitecolor" id="integrity-book">点击查看《廉正告知书》</a>
				<a class="whitecolor" id="pleasecontact">如开店过程遇到问题，可以拨打客服电话：xxx-xxxxxxx</a>
			</div>
		</div>
		<div id="guider-bar">
			<div id="guider-bar-center">
				<ul>
					<li><i class="number-this">1</i> 门店信息 -----</li>
					<li><i class="number-other">2</i> 资质信息 -----</li>
					<li><i class="number-other">3</i> 合作方案 -----</li>
					<li><i class="number-other">4</i> 配送方案 -----</li>
					<li><i class="number-other">5</i> 结算信息 -----</li>
					<li><i class="number-other">6</i> 商品内容 -----</li>
					<li><i class="number-other">7</i> 活动信息</li>
				</ul>
			</div>

		</div>
		<form action="/qianbaidu/store/apply.action" method="post" enctype="multipart/form-data" id="applyform">
			<div id="content">
				<div id="content-center">
					<div class="single-line">
						<label class="title-head">门店绑定手机号:${user.phone}</label>
					</div>
					<div class="single-line">
						<label class="title"><span class="title-span">*</span>门店名称</label>
						<input type="text" name="shopname" id="shopname" class="input-box" />
					</div>
					<div class="single-line">
						<label class="title"><span class="title-span">*</span>外卖电话</label>
						<input type="text" name="outtel" id="outtel" class="input-box" />
					</div>
					<div class="single-line">
						<label class="title"><span class="title-span">*</span>联系人姓名</label>
						<input type="text" name="contactname" id="contactname" class="input-box" />
					</div>

					<div class="single-line">
						<label class="title"><span class="title-span">*</span>门店分类</label>
						<input type="text" name="shopcatalog" id="shopcatalog" class="input-box" />
					</div>

					<div class="single-line">
						<label class="title"><span class="title-span">*</span>营业时间</label>
						<input type="radio" name="opentime" id="opentime" value="24h" /><span class="radiospan">24小时</span> <input type="radio" name="opentime" value="custmize" /><span class="radiospan">自定义</span> <span class="timespan">从</span> <input type="time" name="fromtime" id="fromtime" class="time" /> <span class="timespan">到</span> <input type="time" name="totime" id="totime" class="time" />
					</div>

					<div class="single-line">
						<label class="title"><span class="title-span">*</span>城市</label>
						<!--<select name="province" class="address" id="province">-->
						<!--<option value="安徽省">安徽省</option>
						<option value="河北省">河北省</option>
					</select> <select name="city" class="address">
						<option value="合肥市">合肥市</option>
						<option value="安庆市">安庆市</option>
					</select> <select name="county" class="address">
						<option value="包河区">包河区</option>
						<option value="蜀山区">蜀山区</option>
					</select>-->
						<div style="width: 550px;margin-left: 110px;margin-top: -25px;">
							<select id="Select1" name="province" class="address" ></select>
							<select id="Select2" name="city" class="address" ></select>
							<select id="Select3" name="county" class="address" ></select>
							<script type="text/javascript">
								addressInit('Select1', 'Select2', 'Select3');
							</script>
						</div>
							
					</div>

					<div class="single-line">
						<label class="title"><span class="title-span">*</span>详细地址</label>
						<input type="text" name="detailaddress" id="detailaddress" class="input-box" />
						<button type="button" class="" id="locate">去定位</button>

					</div>

					<div id="map">
						<div id="allmap"></div>
					</div>

					<div class="photo">
						<label class="title"><span class="title-span">*</span>门店照片</label>
						<div class="box" id="upbox">
							<input type="file" name="photoout" id="facephote" value="门脸照" accept="image/gif, image/jpeg, image/png, image/bmp" />
						</div>
						<div class="box" id="downbox">
							<input type="file" name="photoin" id="instorephoto" value="店内照片" accept="image/gif, image/jpeg, image/png, image/bmp" />
						</div>
					</div>
					<div class="photo">
						<label class="title"><span class="title-span">*</span>门店Logo</label>
						<div class="box" id="logobox">
							<input type="file" name="shoplogo" value="选择Logo" accept="image/gif, image/jpeg, image/png, image/bmp" />
						</div>
					</div>
					<div class="single-line" style="margin-top:25px">
						<label class="title"><span class="title-span">*</span>店铺描述</label>
						<input type="text" name="info" id="info" class="input-box" />
					</div>
					<div id="otherplatform">
						<label id="otherlinktitle" class="title">其他平台开店链接</label> <input type="text" name="otherlink" id="otherlink" class="input-box" />
					</div>
				</div>
				<div id="btn-group">
					<input type="reset" id="stepback" class="stepbtn" value="返回上一步" />
					<input type="button" id="stepforward" class="stepbtn" value="提交并进入下一步" onclick="uploadform()" />
				</div>
				<span id="message">${message}</span>

			</div>
		</form>

	</body>

</html>
<script type="text/javascript">
	// 百度地图API功能
	var map = new BMap.Map("allmap"); // 创建Map实例
	map.centerAndZoom(new BMap.Point(121.402789, 31.176562), 20); // 初始化地图,设置中心点坐标和地图级别
	map.addControl(new BMap.MapTypeControl()); //添加地图类型控件
	map.setCurrentCity("上海"); // 设置地图显示的城市 此项是必须设置的
	map.enableScrollWheelZoom(true); //开启鼠标滚轮缩放
</script>