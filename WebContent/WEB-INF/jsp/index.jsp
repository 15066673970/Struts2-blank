<%@page import="com.jinan.www.entity.User"%>
<%@ page language="java" contentType="text/html; charset=  utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<%  
                //这里要指定一下编码，否则会乱码
                request.setCharacterEncoding("utf-8");

        %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title><s:text name="LoginSuccess.message"/></title>
</head>


<body>
<h2><s:property value="message"/></h2>
<h2><%=request.getAttribute("loginMsg") %></h2>

</body>
</html>