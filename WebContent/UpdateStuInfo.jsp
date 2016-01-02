<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="updateStuInfo" method="post">
		  <table align="center" width="30%" border="5">
		    <tr>
		    <td>
		    	<s:hidden name="stuInfo.id" value="%{stuInfo.id}"/>
		    </td>
		    
			<td>
				<s:textfield name="stuInfo.name" label="姓名" maxLength="16" value="%{stuInfo.name}"/>
			</td>
			
			<td>
				<s:select name="stuInfo.sex" label="性别" list="{'男','女'}" value="%{stuInfo.sex}"/>
			</td>
			<td>
				<s:textfield name="stuInfo.age" label="年龄" value="%{stuInfo.age}"/>
			</td>
			<td><s:textfield name="stuInfo.weight" label="体重" value="%{stuInfo.weight}"/></td>
			<td colspan="2">
				<s:submit value="提交" />
				<s:reset value="清除" />
			</td>
	        </tr>
	     </table>
      </s:form>
      <center>
	      <a href="Hello.jsp">返回主页</a>
      </center>
</body>
</html>