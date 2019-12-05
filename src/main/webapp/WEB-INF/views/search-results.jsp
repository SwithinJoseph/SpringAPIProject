<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.4.1/litera/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-pLgJ8jZ4aoPja/9zBSujjzs7QbkTKvKw1+zfKuumQF9U+TH3xv09UUsRI52fS+A6"
	crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>


			<h1>CMDb!</h1>
			<h3>The Cooler, Movie Database</h3>
	<div class="container">

		<h4>Search Results</h4>

		<table class="table">
			<tr>
				<th>Title</th>
				<th>Year of Release</th>

			</tr>
			<c:forEach var="r" items="${results.results }">
				<tr>
					<td><a href="show-movie-details?id=${r.id }">${r.title }</a></td>
					<td>${r.release_date }</td>
				</tr>
			</c:forEach>
		</table>
		
</body>
</html>