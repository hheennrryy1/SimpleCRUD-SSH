<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除学生信息</title>
<style type="text/css">
	body {
		text-align: center;
	}
</style>
</head>
<body>
	<center>
	<h1>删除学生信息</h1>
	<s:form action="findStuInfoDel" method="post" namespace="/">
		<s:textfield name="stuInfo.id" label="请输入要删除的学生的学号" maxLength="16"></s:textfield>
		<s:submit value="提交" />
	</s:form>
	<br />
	<a href="Hello.jsp">返回主页</a>
	</center>
</body>
</html>