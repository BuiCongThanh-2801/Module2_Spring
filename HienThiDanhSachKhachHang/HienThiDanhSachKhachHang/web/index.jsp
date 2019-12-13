<%@ page import="model.Customer" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/28/2019
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
  F4 add javax.servlet:jstl:1.2
  add file jstl-1.2.jar download dc vao WEF-INF/lib va tomcat/lib
  https://stackoverflow.com/questions/31043869/intellij-and-jsp-jstl-cannot-resolve-taglib-for-jstl-in-tomcat7
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table>
    <for>
    <td>name</td>
    <td>birthday</td>
    <td>address</td>
    <td>avatar</td>
    </for>

    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td><c:out value="${customer.getName()}"></c:out></td>
            <td><c:out value="${customer.getBirthday()}"></c:out></td>
            <td><c:out value="${customer.getAddress()}"></c:out></td>
            <td><img src="<c:url value="${pageContext.servletContext.contextPath}'/'{customer.getAvatar()}"/>"></td>
        </tr>
    </c:forEach>

<%--<%--%>
<%--    request.setAttribute("list", Customer.getListCustomer());--%>
<%--%>--%>
<%--    <c:forEach var="customer" items="${list}">--%>
<%--        <tr>--%>
<%--            <td><c:out value="${customer.getName()}"></c:out></td>--%>
<%--            <td><c:out value="${customer.getBirthday()}"></c:out></td>--%>
<%--            <td><c:out value="${customer.getAddress()}"></c:out></td>--%>
<%--            <td><img src="<c:url value="${pageContext.servletContext.contextPath}/{customer.getAvatar()}"/>"></td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
</table>
</body>
</html>
