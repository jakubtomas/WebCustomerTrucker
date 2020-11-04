
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer registration form</title>

    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <form:form action="processForm" modelAttribute="customer">
        <p>First name: <form:input path="firstName"/></p>
        <p>Last name: <form:input path="lastName"/><form:errors path="lastName" cssClass="error"/> </p>
        <p>Free passes: <form:input path="freePasses"/><form:errors path="freePasses" cssClass="error"/> </p>
        <p>Postal code: <form:input path="postalCode"/><form:errors path="postalCode" cssClass="error"/> </p>
        <p>Course code: <form:input path="courseCode"/><form:errors path="courseCode" cssClass="error"/> </p>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
