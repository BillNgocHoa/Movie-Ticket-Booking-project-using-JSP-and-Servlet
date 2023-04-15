<%-- 
    Document   : adminpanel
    Created on : Mar 15, 2023, 4:03:49 PM
    Author     : nnbil
--%>


<%@page import="cn.techtutorial.ctb.admin.model.Admin"%>
<%@page import="cn.techtutorial.ctb.connection.ConnectionDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% ConnectionDB db = new ConnectionDB(); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Admin Panel</h1>
        
        <% Admin admin = (Admin) session.getAttribute("loggedAdmin");%>
        <%= admin.getName() %>  <!-- print out the Name of admin -->
    </body>
</html>
