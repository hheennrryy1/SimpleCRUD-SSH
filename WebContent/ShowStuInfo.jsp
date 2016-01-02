<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表</title>
<style type="text/css">
	body {
		text-align: center;
	}
	#table {
		margin: 0px auto;
		text-align: center;
	}
</style>
</head>
<body>
	${ message }
	
	<h3>你要查询的数据表中有<c:out value="${size}"/>人</h3>
	<table border="soild 5px" id="table">
		<tr>
			<th>记录条数</th>
			<th>学号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>年龄</th>
			<th>体重</th>
		</tr>
				<c:forEach items="${ stuInfos }" var="stu" varStatus="sta">
				<tr>
					<td>
						<c:out value="${ sta.count }"></c:out>
					</td>
					<td>	
						${ stu.id }
					</td>
					<td>	
						${ stu.name }
					</td>
					<td>	
						${ stu.sex }
					</td>
					<td>	
						${ stu.age }
					</td>
					<td>	
						${ stu.weight }
					</td>
				</tr>
				</c:forEach>
	</table>
	<a href="Hello.jsp">返回主页</a>
</body>
</html>