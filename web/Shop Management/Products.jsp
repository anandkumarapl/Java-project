<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <center><title>To Do App: Insert</title>
    </head>
    <body>
        <%
        String check=request.getParameter("check");
        boolean ispostback;
        if(check==null)
        ispostback=false;
        else
        ispostback=true;
        String productid="",productname="",price="",description="",discount="",unitofmeasurement="",productcategory="",result="";
        System.out.println(ispostback);
       
        if(ispostback)
        {
            try
            {
            productid=request.getParameter("productid");
            productname=request.getParameter("productname");
             price=request.getParameter("price");
              description=request.getParameter("description");
              discount=request.getParameter("discount");
              unitofmeasurement=request.getParameter("unitofmeasurement");
              productcategory=request.getParameter("productcategory");
            PreparedStatement ps=DbConnect.connect().prepareStatement("insert into products values(?,?,?,?,?,?,?)");
          //  ps.setString(1,Sno);
            ps.setString(1, productid);
             ps.setString(2, productname);
               ps.setString(3, price);
                ps.setString(4, description);
                 ps.setString(5, discount);
                  ps.setString(6, unitofmeasurement);
                   ps.setString(7, productcategory);
                    int n=ps.executeUpdate();
                    result="Inserted " + n + " records";
            }
            catch(Exception ex)
            {
                System.out.println(ex);
                result=ex.getMessage();
            }
        }
   
        %>
       
       <center>
        <h1>Shop Management</h1>
        <form>
            <h3><%=result%></h3>
            <input type="hidden" name="check" value="1">
          Productid<input value="<%=productid%>" name="productid" type="number"><br>
            productname<input name="productname" value="<%=productname%>" type="text"><br>
            price<input name="price" value="<%=price%>" type="number"><br>
            description<input name="description" value="<%=description%>" type="text"><br>
            discount<input name="discount" value="<%=discount%>" type="text"><br>
            unitofmeasurement<input name="unitofmeasurement" value="<%=unitofmeasurement%>" type="text"><br>
            productcategory<input name="productcategory" value="<%=productcategory%>" type="text"><br>
        <br>
        <br>
        <input type="submit">
        </center>
    </body>
        </form>
</html>