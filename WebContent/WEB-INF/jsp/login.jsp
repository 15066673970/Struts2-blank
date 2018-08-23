<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
</head>
<%
	//String errorMsg= request.getAttribute("errorMsg").toString();
%>
<body> 
	<form action="login/LoginActionMethod1.action" method="post">
		<div>
			用户名：<input type="text"  name="user.username"></br> 密
			&nbsp;码：<input type="text"  name="student.studentAge"></br>
			<input type="submit" value="提交"> <input type="reset"
				value="重置"><a href="register.jsp"><input type="button" value="注册"></a>
		</div>
	</form>
	 
	 <!--- 
<s:form action="login/LoginActionMethod1.action">
    <s:textfield key="username"/>  
    <s:password key="password" />  
    <s:submit/>
    </s:form>
     --->
</body>
</html>