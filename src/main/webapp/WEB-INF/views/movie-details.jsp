<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${details.title }</title>
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

	<h4>${details.title }</h4>

	<b>Date of Release:</b> ${date }
	<br>
	<br>

	<b>${genreTitle }</b>
	<div>
		<c:forEach var="genre" items="${genres }">
		${genre}<br>
		</c:forEach>
		<br>
	</div>


	<div>
		<b>Overview:</b> ${details.overview } <br>
	</div>
	<br>

	<div>
		<b>Languages:</b><br>
		<c:forEach var="lang" items="${details.spoken_languages }">
		${lang.name}<br>
		</c:forEach>
	</div>
	<br>

	<img src="https://image.tmdb.org/t/p/w500/${details.poster_path }"
		height="400">

	<div>

		<a class="btn btn-primary" href="/add-to-watchlist?id=${details.id }">Add
			To Watch List</a>
	</div>

</body>
</html>