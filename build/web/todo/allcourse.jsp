<%@page import="java.sql.ResultSet"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Courses</title>
    </head>
    <body>
    <center>
        <h1>All Courses</h1>
        <%
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from courses order by coursename");
            ResultSet rs = ps.executeQuery();
        %>
        <table border="1">
            <tr><th>Course Name</th><th>Show Students</th></tr>



            <%
                while (rs.next()) {
                    String courseno = "" + rs.getObject("courseno");
                    String coursename = "" + rs.getObject("coursename");
            %>
            <tr><td><%=coursename%></td><td><a href=".jsp?courseno=<%=courseno%>" target="students">Show</a></td></tr>

            <%
                }
            %>
        </table>
    </center>
</body>
</html>