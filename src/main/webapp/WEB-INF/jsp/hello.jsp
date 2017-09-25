<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="/webjars/animate.css/3.5.2/animate.css">
<title>hello-jsp</title>
</head>
<body>
<h1>hello jsp!!!</h1>
<a href="http://www.google.com" class="btn btn-primary">google</a>
<hr>
<img class="animated bounce" alt="xxx" src="http://www.placehold.it/100x200">
<hr>
<p>${deptVO}</p>
<hr>
<ul>
	<li>${deptVO.deptno}</li>
	<li>${deptVO.dname}</li>
	<li>${deptVO.loc}</li>
</ul>
</body>
</html>