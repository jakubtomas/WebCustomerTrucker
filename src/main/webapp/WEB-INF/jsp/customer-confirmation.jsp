
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Confirmed</title>
</head>
<body>
<h1>customer confirmation.jsp</h1>

    <p>Customer Confirmed: ${customer.firstName} ${customer.lastName}</p>

    <br>
    <p>Customer's Free passes: ${customer.freePasses}</p>

    <br>
    <p>Customer's Postal Code: ${customer.postalCode}</p>
    <p>Customer's Course Code: ${customer.courseCode}</p>
</body>
</html>
