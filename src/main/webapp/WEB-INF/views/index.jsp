<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <!-- <link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/slate/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-FBPbZPVh+7ks5JJ70RJmIaqyGnvMbeJ5JQfEbW0Ac6ErfvEg9yG56JQJuMNptWsH"
	crossorigin="anonymous"> -->

<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
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
		</div>
	</form>

</body>
</html>