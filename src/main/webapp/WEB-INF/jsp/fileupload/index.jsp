<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="/resources/js/bootstrap-3.3.5-dist/css/bootstrap.min.css" />
<script type="text/javascript"
	src="/resources/js/jquery-easyui-1.3.6/jquery.min.js"></script>
<!--引入CSS-->
<link rel="stylesheet" type="text/css"
	href="/resources/js/webuploader/webuploader.css">

<!--引入JS-->
<script type="text/javascript"
	src="/resources/js/webuploader/webuploader.js"></script>
<!--引入JS-->
<script type="text/javascript" src="/resources/js/custom/fileupload.js"></script>
<title>文件上传</title>
</head>
<body class="container">
	<div id="uploader" class="wu-example">
		<!--用来存放文件信息-->
		<div id="thelist" class="uploader-list"></div>
		<div class="btns">
			<div id="picker">选择文件</div>
			<button id="ctlBtn" class="btn btn-default">开始上传</button>
		</div>
		<div class="progress">
			<div class="progress-bar" role="progressbar" aria-valuenow="0"
				aria-valuemin="0" aria-valuemax="100" style="width:0%">
				<span class="sr-only">70% Complete</span>
			</div>
		</div>
		<!-- <div id="filed" style="height:100px;weight:100px;background-color: red;"></div> -->
	</div>
	<script type="text/javascript">
		$(function() {
			var uploader = new FileUpload({
				server : "/fileUpload/upload",
				pick : "#picker",
				upload : "#ctlBtn",

			//dnd:"#filed"
			});
			uploader.init();
		});
	</script>
</body>
</html>