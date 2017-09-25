<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>list.jsp</title>
<c:if test="${true}">
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="/webjars/animate.css/3.5.2/animate.css">
</c:if>

<c:if test="${false}">
<link rel="stylesheet" href="../css/bootstrap.css" data-th-remove="all">
<link rel="stylesheet" href="../css/animate.css" data-th-remove="all">
</c:if>
</head>
<body>
<h1>Dept List</h1>
${depts}
<table class="table table-hover animated bounce">
	<thead>
		<tr>
			<th>deptno</th><th>dname</th><th>loc</th>
		</tr>	
	</thead>
	<tfoot>
	</tfoot>
	<tbody>
		<c:forEach var="d" items="${depts}">
		<tr>
			<td>${d.deptno}</td><td>${d.dname}</td><td>${d.loc}</td>
		</tr>	
		</c:forEach>
	</tbody>
</table>
<hr>
<c:set var="xxx" value="${depts}"></c:set>
<ul class="list-group animated fadeInDown">
	<li class="list-group">${xxx}</li>
</ul>
</body>
</html>