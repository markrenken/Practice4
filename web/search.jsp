<%-- 
    Document   : index
    Created on : Jan 24, 2018, 9:42:52 AM
    Author     : fssco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="styles/main.css" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>

    <body>
        <header>Employee Data Company</header>
        <main>
            <h1 class="centered">Search by Hire Dates</h1>
            <h3 class="centered2">Please enter a date and select the button that indicates if you want the search to be before or after the date entered.</h3>
            <form action="controller" method="get">
                <input type="hidden" name="actionWanted" value="searchDate">
                <label for="date">Search Date: </label>
                <input type="date" name="date" value="${dateWanted}"><p class="message">&nbsp;&nbsp;&nbsp;&nbsp;${message1}</p></br></br>
                <input type="radio" name="range" value="Before"> Before</br>
                <input type="radio" name="range" value="After"> After&nbsp;&nbsp;&nbsp;&nbsp;<p class="message">   ${message2}</p></br>
                </br>
                <input type="submit" value="Search" class="button1">
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
