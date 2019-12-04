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
	<h1>Watchlist:</h1>
	<table>
		<tr>
			<th>Title</th>
			<th>Release year</th>
			<th>Overview</th>
		</tr>
		<c:forEach var="movie" items="${watchlist }">
			<tr>
				<td><a href="/show-movie-details?id=${movie.movie_id}">${movie.title}</a></td>
				<td>${movie.year }</td>
				<td>${movie.overview }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>