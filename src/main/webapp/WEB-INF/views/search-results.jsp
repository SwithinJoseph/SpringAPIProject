<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/slate/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-FBPbZPVh+7ks5JJ70RJmIaqyGnvMbeJ5JQfEbW0Ac6ErfvEg9yG56JQJuMNptWsH"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		
		<h1>Search Results</h1>
		
		<table class="table">
			<tr>
				<th>Title</th>
				<th>Year of Release</th>

			</tr>
			<c:forEach var="r" items="${results.results }">
			<tr>
				<td>
				<a href="show-movie-details?id=${r.id }">${r.title }</a>
				</td>
				<td>${r.release_date }</td>
			</tr>
			</c:forEach>
		</table>

</body>
</html>