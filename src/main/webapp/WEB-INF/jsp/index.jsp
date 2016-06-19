<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="/resources/js/bootstrap-3.3.5-dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="/resources/js/jquery-easyui-1.3.6/themes/default/easyui.css" />
<script type="text/javascript"
	src="/resources/js/jquery-easyui-1.3.6/jquery.min.js"></script>
<script type="text/javascript"
	src="/resources/js/jquery-easyui-1.3.6/jquery.easyui.min.js"></script>
<title>users</title>
</head>
<body>
	<table id="tt"></table>
	<script>
		$(function() {
			$('#tt').datagrid({
				url : '/user/userList',
				columns : [ [ {
					checkbox : true,
					title : 'ck',
					width : 100
				}, {
					field : 'id',
					title : 'id',
					width : 100
				}, {
					field : 'userName',
					title : 'userName',
					width : 100
				}, {
					field : 'userAge',
					title : 'userAge',
					width : 100,

				}, {
					field : 'userAddress',
					title : 'userAddress',
					width : 100,

				}, {
					field : "操作",
					title : '操作',
					width : 100,
					formatter : function(value, rowData, rowIndex) {
						var html = '<a href="http://www.baidu.com">删除</a>';
						return html;
					},
				} ] ]
			/* columns : [ [ {
				field : 'itemid',
				title : 'Item ID',
				rowspan : 2,
				width : 80,
				sortable : true
			}, {
				field : 'productid',
				title : 'Product ID',
				rowspan : 2,
				width : 80,
				sortable : true
			}, {
				title : 'Item Details',
				colspan : 4
			} ], [ {
				field : 'listprice',
				title : 'List Price',
				width : 80,
				align : 'right',
				sortable : true
			}, {
				field : 'unitcost',
				title : 'Unit Cost',
				width : 80,
				align : 'right',
				sortable : true
			}, {
				field : 'attr1',
				title : 'Attribute',
				width : 100
			}, {
				field : 'status',
				title : 'Status',
				width : 60
			} ] ] */
			});
		});
	</script>

</body>
</html>