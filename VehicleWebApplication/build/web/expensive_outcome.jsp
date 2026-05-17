<%-- 
    Document   : expensive_outcome
    Created on : 04 May 2026, 8:17:16 PM
    Author     : PC
--%>

<%@page import="za.ac.tut.entity.Vehicles"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expensive Outcome JSP Page</title>
    </head>
    <body>
        <h1>Expensive Outcome</h1>
        <p>
            Here are the most expensive vehicle details:
        </p>
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
