<%@ page language="java" contentType="text/html; charset=gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>��ѯ���</title>
</head>
<body>
	<form id="form1" action="find1">
		serialNumber��<br/>
		${requestScope.guitar.serialNumber}<br/>
		price��<br/>
		${requestScope.guitar.price}<br/>
		builder��<br/>
		${requestScope.guitar.builder}<br/>
		model��<br/>
		${requestScope.guitar.model}<br/>
		type��<br/>
		${requestScope.guitar.type}<br/>
		backWood��<br/>
		${requestScope.guitar.backWood}<br/>
		topWood��<br/>
		${requestScope.guitar.topWood}<hr/>
	</form>
</body>
</html>