<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bar.jsp</title>

<c:if test="${false}">
	<link rel="stylesheet" href="../css/bootstrap.css" data-th-remove="all">
	<link rel="stylesheet" href="../css/animate.css" data-th-remove="all">
</c:if>

</head>

<body>
	<h1 align="center" class="animated bounce">BAR CHART</h1>
	<hr>
		<h2>${depts[0].deptno}, ${depts[0].dname} </h2>
		<canvas id="dept01" class="animated fadeInRight"></canvas>
	<hr>
		<h2>${depts[1].deptno}, ${depts[1].dname}</h2>
		<canvas id="dept02" class="animated fadeInUp"></canvas>
	<hr>
		<h2>${depts[2].deptno}, ${depts[2].dname}</h2>
		<canvas id="dept03" class="animated fadeInDown"></canvas>
	<hr>
		<h2>${depts[3].deptno}, ${depts[3].dname}</h2>
		<canvas id="dept04" class="animated fadeInLeft"></canvas>
	<hr>
	<hr>

	<script type="text/javascript">
		var data01 = ${bars[0].toJson()};
		var ctx = document.getElementById("dept01").getContext("2d"); 
		new Chart(ctx, data01);
		
		var data02 = ${bars[1].toJson()};
		var ctx = document.getElementById("dept02").getContext("2d"); 
		new Chart(ctx, data02);
		
		var data03 = ${bars[2].toJson()};
		var ctx = document.getElementById("dept03").getContext("2d"); 
		new Chart(ctx, data03);
		
		var data04 = ${bars[3].toJson()};
		var ctx = document.getElementById("dept04").getContext("2d"); 
		new Chart(ctx, data04);
	</script>



</body>
</html>