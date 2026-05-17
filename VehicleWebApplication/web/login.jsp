<%-- 
    Document   : login
    Created on : 04 May 2026, 8:20:33 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login JSP Page</title>
    </head>
    <body>
        <h1>Login </h1>
        <p>
            please enter the log in info
        </p>
        
        <form action="j_security_check" method="POST">
            <table >
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="j_username" required="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="text" name="j_password" required=""/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
