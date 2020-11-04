
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2> ${message}</h2>

    <a href="${pageContext.request.contextPath}/showForm">Form</a>

    <br><br>

    <a href="${pageContext.request.contextPath}/student/showForm">Student Form</a>

    <br><br>

    <a href="${pageContext.request.contextPath}/customer/showForm">Customer Form</a>

</body>
</html>
