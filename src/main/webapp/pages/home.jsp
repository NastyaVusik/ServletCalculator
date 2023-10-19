<%--
  Created by IntelliJ IDEA.
  User: Nastya
  Date: 10/19/2023
  Time: 2:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>

<body>
<div class="container">

    <c:forEach items="${users}" var="user">

        <div class="col-sm-3">

            <div class="card">
                <img src="..." class="card-img-top" >
                <div class="card-body">
                    <h5 class="card-title">${user}</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>


    </c:forEach>
    </div>

</div>



<h3>Hello, ${name} !</h3>


    <c:if test="${flag}">
    <ul>
        <li>Hello1</li>
        <li>Hello2</li>
        <li>Hello3</li>
    </ul>
    </c:if>

<%--<ul>--%>
<%--    <c:forEach items="${users}" var="user">--%>
<%--<li>${user}</li>--%>

<%--    </c:forEach>--%>
<%--</ul>--%>







<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>