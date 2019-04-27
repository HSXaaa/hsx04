<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<a href="hello?name=Struts2" target="_blank">默认转发_dispatcher（转发能看到Struts2，重定向不能）</a><br/>
<a href="hello!r?name=Struts2" target="_blank">重定向_redirect（转发能看到Struts2，重定向不能）</a><br/>
<!-- !r是动态方法调用，调用r方法 -->
<a href="hello!c?name=Struts2" target="_blank">链条_chain</a><br/>
<a href="hello!ra?name=Struts2" target="_blank">重定向到Action_redirectAction</a><br/>
<a href="hello" target="_blank">全局result配置</a><br/>
<a href="hello3?name3=Struts2" target="_blank">拦截器_interceptor</a><br/>
</body>
</html>