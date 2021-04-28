<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Page</title>
    <link rel="stylesheet" type="text/css" href="css/css.css">
    </head>
<body>
<h1>
    All films: <br>
    <c:forEach items="${all}" var="a">
        <c:out value="${a.cinemaTitle}"/>: <c:forEach items="${a.charactersFromCinema}" var="b">
        <font color="#fa8e47"> <c:out value="${b.charactersName}"/> </font>
    </c:forEach>
    </c:forEach>

    Character which doesnt play in any films: <c:forEach items="${withoutRole}" var="character">
    <font color="#fa8e47"> <c:out value="${character.charactersName}"/>, </font>
</c:forEach> <br>

    Characters which play with Tom Hardy: <c:forEach items="${playWith}" var="actor">
    <font color="#fa8e47"> <c:out value="${actor.charactersName}"/>, </font>
</c:forEach>
    <br>
    Film with the biggest quantity of actors: <font color="#fa8e47"> ${muchMore}</font>
</h1>

<a class="run" href="ControllerServlet">Run</a>

</body>
</html>