<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	helloJsp
	${hello}
	<form action="">
		<table>
			<tr><td>姓名：</td><td><input /></td></tr>			
			<tr><td>年龄：</td><td><input /></td></tr>			
			<tr><td>性别：</td><td><input /></td></tr>			
			<tr><td><input id="input" type="submit" value="提交"/></td><td><input id="input" type="button" value="重置"/></td></tr>			
	</table>
	</form>

	
</body>
</html>

