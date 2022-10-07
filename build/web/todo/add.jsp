
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add</title>
    </head>
    <body>
        <%
        int n=0;%>
        <%
            System.out.println(n);
            String postback = request.getParameter("postback"), option = "";
            int n1 = 0, n2 = 0, result = 0;
            boolean ispostback;
            if (postback == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            System.out.println(ispostback);

            if (ispostback) {
                n1 = Integer.parseInt(request.getParameter("n1"));
                n2 = Integer.parseInt(request.getParameter("n2"));
                option = request.getParameter("option");
                System.out.println(option);
                if (option.equals("Add")) {
                    result = n1 + n2;
                }
                if (option.equals("Sub")) {
                    result = n1 - n2;
                }
                if (option.equals("Mul")) {
                    result = n1 * n2;
                }
                if (option.equals("Div")) {
                    result = n1 / n2;
                }
                if (option.equals("Mod")) {
                    result = n1 % n2;
                }
                if (option.equals("max")) {
                    if (n1 > n2) {
                        System.out.print(n1);
                    } else if (n1 < n2) {
                        System.out.print(n2);
                    }
                }
            }
        %>
        <h2>Result = <%=result%></h2>
        <form method="get">
            <input type="hidden" name="postback" value="1">
            N1 <input value="<%=n1%>" step="10" max="" min="0" type="number" name="n1">
            <br>
            N2 <input value="<%=n2%>" step="10" max="" min="0" type="number" name="n2">
            <br>
            <input type="submit" name="option" value="Add"/>
            <input type="submit" name="option" value="Sub"/>
            <input type="submit" name="option" value="Mul"/>
            <input type="submit" name="option" value="Div"/>
            <input type="submit" name="option" value="Mod"/>
        </form>

        <form method="post">
            <input type="hidden" name="postback" value="1">
            N1 <input value="<%=n1%>" step="10" max="100" min="0" type="number" name="n1">
            <br>
            N2 <input value="<%=n2%>" step="10" max="100" min="0" type="number" name="n2">
            <br>
            <input type="submit" value="Add"/>
        </form>
        <!--
        Get                         Post
        Data in url                 Data not visible
        No warning on refresh       Warning on refresh
        Files cannot be submitted   File can be submitted
        Data length is limited      Data length is more
        
        -->
    </body>
</html>
