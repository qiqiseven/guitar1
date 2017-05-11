<%@ page language="java" contentType="text/html; charset=gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>²éÑ¯½á¹û</title>
</head>
<body>
	<form id="form1" action="find1">
		serialNumber£º<br/>
		${requestScope.guitar.serialNumber}<br/>
		price£º<br/>
		${requestScope.guitar.price}<br/>
		builder£º<br/>
		${requestScope.guitar.builder}<br/>
		model£º<br/>
		${requestScope.guitar.model}<br/>
		type£º<br/>
		${requestScope.guitar.type}<br/>
		backWood£º<br/>
		${requestScope.guitar.backWood}<br/>
		topWood£º<br/>
		${requestScope.guitar.topWood}<hr/>
	</form>
</body>
</html>