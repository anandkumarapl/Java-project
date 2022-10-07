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
String receiptno = "", dateofpurchase = "", TotalAmount="",SupplierName="",SupplierAddress="",SupplierPhones="",SupplierEmail="",amountpaid="",amountpending="",remarks="",result = "";        System.out.println(ispostback);
       
        if(ispostback)
        {
            try
            {
             receiptno = request.getParameter("receiptno");
                    dateofpurchase = request.getParameter("dateofpurchase");
                    TotalAmount = request.getParameter("totalamount");
                    SupplierName = request.getParameter("suppliername");
                    SupplierAddress = request.getParameter("supplieraddress");
                    SupplierPhones = request.getParameter("supplierphones");
                    SupplierEmail = request.getParameter("supplieremail");
                    amountpaid = request.getParameter("amountpaid");
                    amountpending = request.getParameter("amountpending");
                    remarks = request.getParameter("remarks");
            PreparedStatement ps=DbConnect.connect().prepareStatement("insert into purchase values(?,?,?,?,?,?,?,?,?,?)");
          //  ps.setString(1,Sno);
                    ps.setString(1, receiptno);
                    ps.setString(2, dateofpurchase);
                    ps.setString(3, TotalAmount);
                    ps.setString(4, SupplierName);
                    ps.setString(5, SupplierAddress);
                    ps.setString(6, SupplierPhones);
                    ps.setString(7, SupplierEmail);
                     ps.setString(8, amountpaid);
                    ps.setString(9, amountpending);
                     ps.setString(10, remarks);
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
            receiptno<input value="<%=receiptno%>" name="receiptno" type="number" placeholder="ReceiptNo"min="0"><br>
            dateofpurchase<input value="<%=dateofpurchase%>" name="dateofpurchase" type="text" placeholder="DateOfPurchase"><br>
            TotalAmount<input value="<%=TotalAmount%>"name="totalamount" type="number" placeholder="TotalAmount"><br>
            SupplierName<input value="<%=SupplierName%>"name="suppliername" type="text" placeholder="SupplierName"><br>
            SupplierAddress<input value="<%=SupplierAddress%>"name="supplieraddress" type="text" placeholder="SupplierAddress"><br>
            SupplierPhones<input value="<%=SupplierPhones%>"name="supplierphones" type="number" placeholder="SupplierPhones"><br>
            SupplierEmail<input value="<%=SupplierEmail%>"name="supplieremail" type="text" placeholder="SupplierEmail"><br>
            amountpaid<input value="<%=amountpaid%>"name="amountpaid" type="number" placeholder="amountpaid"><br>
            amountpending<input value="<%=amountpending%>"name="amountpending" type="number" placeholder="amountpending"><br>
            remarks   <input value="<%=remarks%>"name="remarks" type="text" placeholder="remarks"><br>
        <br>
        <br>
        <input type="submit">
        </center>
    </body>
        </form>
</html>