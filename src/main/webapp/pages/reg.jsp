<%--
  Created by IntelliJ IDEA.
  User: Nastya
  Date: 10/20/2023
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Reg</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<jsp:include page="_header.jsp"></jsp:include>--%>

<%--<div class="container">--%>
<%--    <div class="row justify-content-center">--%>
<%--        <form class="mt-5 w-50" action="/reg" method="post">--%>
<%--            <div class="mb-3">--%>
<%--                <label for="exampleInputEmail1" class="form-label">Name</label>--%>
<%--                <input type="text" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">--%>
<%--                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>--%>
<%--            </div>--%>
<%--            <div class="mb-3">--%>
<%--                <label for="exampleInputEmail2" class="form-label">Username</label>--%>
<%--                <input type="text" name="username" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp">--%>
<%--                <div id="emailHelp2" class="form-text">We'll never share your email with anyone else.</div>--%>
<%--            </div>--%>
<%--            <div class="mb-3">--%>
<%--                <label for="exampleInputPassword1" class="form-label">Password</label>--%>
<%--                <input type="password" name="password" class="form-control" id="exampleInputPassword1">--%>
<%--            </div>--%>

<%--            <select name="role" class="form-select" aria-label="Default select example">--%>
<%--                <option value="USER" selected>User</option>--%>
<%--                <option value="ADMIN">Admin</option>--%>
<%--            </select>--%>

<%--            <button type="submit" class="btn btn-primary mt-3">Submit</button>--%>
<%--        </form>--%>
<%--    </div>--%>
<%--</div>--%>


<%--</body>--%>
<%--</html>--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reg</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div class="container">
    <div class="row justify-content-center">
        <form class="mt-5 w-25" action="/reg" method="post">
            <div class="mb-3">
                <label for="1" class="form-label">Name</label>
                <input type="text" name="name" class="form-control" id="1" aria-describedby="emailHelp">
                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            </div>
            <div class="mb-3">
                <label for="2" class="form-label">Username</label>
                <input type="text" name="username" class="form-control" id="2" aria-describedby="emailHelp2">
                <div id="emailHelp2" class="form-text">We'll never share your email with anyone else.</div>
            </div>
            <div class="mb-3">
                <label for="3" class="form-label">Password</label>
                <input type="password" name="password" class="form-control" id="3">
            </div>
            <select name="role" class="form-select" aria-label="Default select example">
                <option value="USER">User</option>
                <option value="ADMIN">Administrator</option>
            </select>
            <button type="submit" class="btn btn-primary mt-5">Submit</button>
        </form>
    </div>
</div>
</body>
</html>

