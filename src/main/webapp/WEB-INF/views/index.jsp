<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.4.1/litera/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-pLgJ8jZ4aoPja/9zBSujjzs7QbkTKvKw1+zfKuumQF9U+TH3xv09UUsRI52fS+A6"
	crossorigin="anonymous"> -->

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
	<div id="grad1"></div>
	<form action="/find-movie">
		<div class="wrap">
			<h1>CMDb!</h1>
			<h3>The Cooler, Movie Database</h3>
			<div class="search">
				<input type="text" class="searchTerm" name="title"
					placeholder="Title">
				<button type="submit" class="searchButton">
					<i class="fa fa-search"></i>
				</button>
			</div>

			<div class="search">

				<input type="text" class="searchTerm" name="year"
					placeholder="Release Year">
				<button type="submit" class="searchButton">
					<i class="fa fa-search"></i>
				</button>
				
			</div>
			<br>
			<a class="btn btn-primary" href="show-watchlist">View watchlist</a>
			
		</div>
	</form>
</body>
</html>