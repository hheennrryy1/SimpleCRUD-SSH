<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生信息</title>
</head>
<style>
	body {
		text-align: center;
	}
</style>
<body>
		<center><font color="red" size="6">添加学生信息</font></center>
		<s:form action="addStuInfo" method="post" namespace="/">
		  <table align="center" width="30%" border="5">
		    <tr>
			<td>
				<s:textfield name="stuInfo.id" label="学号" maxLength="16"></s:textfield>
			</td>
			
			<td>
				<s:textfield name="stuInfo.name" label="姓名" maxLength="16" />
			</td>
			
			<td>
				<s:select name="stuInfo.sex" label="性别" list="{'男','女'}" />
			</td>
			<td>
				<s:textfield name="stuInfo.age" label="年龄" value=""/>
			</td>
			<td><s:textfield name="stuInfo.weight" label="体重"/></td>
			<td colspan="2">
				<s:submit value="提交" />
				<s:reset value="清除" />
			</td>
	        </tr>
	     </table>
      </s:form>
      <a href="Hello.jsp">返回主页</a>
</body>
</html>