<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript"
	src="/resources/js/jquery-easyui-1.3.6/jquery.min.js"></script>
<!--引入CSS-->
<link rel="stylesheet" type="text/css"
	href="/resources/js/webuploader/webuploader.css">

<!--引入JS-->
<script type="text/javascript"
	src="/resources/js/webuploader/webuploader.js"></script>
<title>文件上传</title>
</head>
<body>
	<div id="uploader" class="wu-example">
		<!--用来存放文件信息-->
		<div id="thelist" class="uploader-list"></div>
		<div class="btns">
			<div id="picker">选择文件</div>
			<button id="ctlBtn" class="btn btn-default">开始上传</button>
		</div>
	</div>
	<script type="text/javascript">
		var uploader = WebUploader.create({

			// swf文件路径
			swf : "/resources/js/webuploader/Uploader.swf",

			// 文件接收服务端。
			server : '/fileUpload/upload',

			// 选择文件的按钮。可选。
			// 内部根据当前运行是创建，可能是input元素，也可能是flash.
			pick : '#picker',

			// 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！
			resize : false
		});
		
		$(function(){
			$("#ctlBtn").bind("click",function(){
				uploader.upload();
			})
		})
	</script>
</body>
</html>