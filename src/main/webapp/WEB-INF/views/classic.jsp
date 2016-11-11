<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title><tiles:getAsString name="title"></tiles:getAsString></title>

</head>
<body>

	<!-- Footer -->
	<div class="container">
		<tiles:insertAttribute name="page-header"></tiles:insertAttribute>
	</div>
	
	<!-- Footer -->
	<div class="container">
		<tiles:insertAttribute name="page-body"></tiles:insertAttribute>
	</div>
	
	<!-- Footer -->
	<div class="container">
		<tiles:insertAttribute name="page-footer"></tiles:insertAttribute>
	</div>

</body>

</html>