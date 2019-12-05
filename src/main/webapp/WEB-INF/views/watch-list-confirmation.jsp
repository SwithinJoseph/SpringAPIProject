<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Watchlist</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
	<h1>${message }</h1><br>
	<a href="/show-watchlist" class="btn btn-primary">Show watchlist</a><br>
	<a href="/show-movie-details?id=${id }" class="btn btn-primary">Return to movie page</a>
</body>
</html>