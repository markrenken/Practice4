<%-- 
    Document   : index
    Created on : Jan 24, 2018, 9:42:52 AM
    Author     : fssco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
        <title>Employee Lists</title>
    </head>

    <body>
        <header>Employee Data Company</header>
        <main>
            <h1 class="centered">Employee List - All</h1>
            </br>
            </br>

            <table>
                <tr>
                    <th>First Name</th>
                    <th>Middle Name</th>
                    <th>Last Name</th>
                    <th>Employee ID</th>
                    <th>Birth Date</th>
                    <th>Hire Date</th>
                </tr>
                <c:forEach var="person" items="${persons}">
                    <tr>
                        <td>${person.firstName}</td>
                        <td>${person.middleName}</td>
                        <td>${person.lastName}</td>
                        <td>${person.employeeID}</td>
                        <td>${person.birthDate}</td>
                        <td>${person.hireDate}</td>
                    </tr>
                </c:forEach>
            </table>
            </br>
            </br>
            <form action="controller" method="get">
                <input type="hidden" name="actionWanted" value="search">
                <input type="submit" value="Search by Hire date" class="button1">
            </form>
        </main>

        <footer>
            Employee Data Company - 5555 West Northwest Street - Lincoln, NE 68516 - 402-555-5555
        </footer>
    </body>
</html>
