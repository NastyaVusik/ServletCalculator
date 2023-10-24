<%--
  Created by IntelliJ IDEA.
  User: Nastya
  Date: 10/20/2023
  Time: 11:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Log In</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<jsp:include page="_header.jsp"></jsp:include>--%>

<%--<div class="container">--%>
<%--    <div class="row justify-content-center">--%>
<%--        <form class="mt-5 w-50" action="/login" method="post">--%>
<%--            <div class="mb-3">--%>
<%--                <label for="exampleInputEmail2" class="form-label">Username</label>--%>
<%--                <input type="text" name="username" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp">--%>
<%--                <div id="emailHelp2" class="form-text">We'll never share your email with anyone else.</div>--%>
<%--            </div>--%>
<%--            <div class="mb-3">--%>
<%--                <label for="exampleInputPassword1" class="form-label">Password</label>--%>
<%--                <input type="password" name="password" class="form-control" id="exampleInputPassword1">--%>
<%--            </div>--%>

<%--            <button type="submit" class="btn btn-primary">Submit</button>--%>
<%--            --%>
<%--            <c:if test="${message != null}">--%>
<%--                <div class="alert alert-warning mt-5" role="alert">--%>
<%--                        ${message}--%>
<%--                </div>--%>
<%--            </c:if>--%>

<%--        </form>--%>
<%--    </div>--%>
<%--</div>--%>


<%--</body>--%>
<%--</html>--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Log In</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div class="container">
    <div class="row justify-content-center">
        <form class="mt-5 w-25" action="/login" method="post">
            <div class="mb-3">
                <label for="exampleInputEmail2" class="form-label">Username</label>
                <input type="text" name="username" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp2">
                <div id="emailHelp2" class="form-text">We'll never share your email with anyone else.</div>
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Password</label>
                <input type="password" name="password" class="form-control" id="exampleInputPassword1">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
            <c:if test="${message != null}">
                <div class="alert alert-warning mt-5" role="alert">
                        ${message}
<%--                    <c:redirect url="/"/>--%>
                        <%--                    <c:redirect url="/"/>--%>
                </div>
            </c:if>
        </form>
    </div>
</div>
</body>
</html>