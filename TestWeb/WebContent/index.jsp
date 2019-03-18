<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello</title>
</head>
<body>
<form action="<%request.getContextPath();%>/query.udo" method="post">
<table>
<tr>
<td>姓名：</td><td><input type="text" name="studentname"></td>
</tr>
<tr>
<td>年龄：</td><td><input type="number" name="studentage"></td>
</tr>
<tr>
<td></td><td><input type="submit" value="查询学生"></td>
</tr>
</table></form>
</body>
</html>