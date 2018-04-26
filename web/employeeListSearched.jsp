<%-- 
    Document   : employeeList
    Created on : Apr 12, 2018, 3:28:32 PM
    Author     : Mark
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
        <title>Employee List - Searched</title>
    </head>



    <body>
        <header>Employee Data Company</header>
        <main>
            <h1 class="centered">Employee List</h1>
            <h2 class="centered">Searched ${range} ${dateWanted}</h2>
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
                <input type="hidden" name="actionWanted" value="again">
                <input type="submit" name="home" value="Search Again" class="button1">
            </form>        

            <form action="controller" method="get">
                <input type="hidden" name="actionWanted" value="home">
                <input type="submit" name="home" value="Employee List - All" class="button1">
            </form>
        </main>
        <footer>
            Employee Data Company - 5555 West Northwest Street - Lincoln, NE 68516 - 402-555-5555
        </footer>
    </body>
</html>
