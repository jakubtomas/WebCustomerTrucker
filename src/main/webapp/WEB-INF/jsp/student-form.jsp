<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

<h2>student-form.jsp</h2>
<form:form action="processForm" modelAttribute="student">
    First name:
    <form:input path="firstName"/>

    <br><br>

    Last name:
    <form:input path="lastName"/>

    <br><br>
    Country:

    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>

    <br><br>

    Fav Language:

    PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    Javascript <form:radiobutton path="favoriteLanguage" value="Javascript"/>
    C++ <form:radiobutton path="favoriteLanguage" value="C++"/>

    <br><br>
    MacOS X: <form:checkbox path="operatingSystems" value="MacOSX"/>
    Linux: <form:checkbox path="operatingSystems" value="Linux"/>
    Windows: <form:checkbox path="operatingSystems" value="Windows"/>
    <br><br>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
