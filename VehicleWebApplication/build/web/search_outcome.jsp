<%-- 
    Document   : search_outcome
    Created on : 04 May 2026, 8:02:25 PM
    Author     : PC
--%>

<%@page import="za.ac.tut.entity.Vehicles"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search JSP Page</title>
    </head>
    <body>
        <h1>Search Outcome</h1>
        <%
            Vehicles car=(Vehicles)request.getAttribute("vehicle");
            Long numPlate=car.getId();
            Integer price=car.getPrice();
            String name=car.getName();
            String color=car.getColor();
            String type=car.getType();
        %>
        
        <table >
                <tr>
                    <td>Number Plate:</td>
                    <td><%=numPlate%></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><%=price%></td>
                </tr>
                <tr>
                    <td>Vehicle Name:</td>
                    <td><%=name%></td>
                </tr>
                <tr>
                    <td>Vehicle Color:</td>
                    <td><%=color%></td>
                </tr>
                <tr>
                    <td>Vehicle Type:</td>
                    <td><%=type%></td>
                </tr>
            
        </table>
                <ul>
            <li>
                <a href="index.html">Home</a>
            </li>
            <li>
                <a href="menu.html">Menu</a>
            </li>
        
                <li>
                <a href="logoutServlet">Logout</a>
            </li>
                </ul>
    </body>
</html>
