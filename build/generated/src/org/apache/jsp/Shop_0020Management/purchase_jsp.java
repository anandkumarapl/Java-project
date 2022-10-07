package org.apache.jsp.Shop_0020Management;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.DbConnect;
import java.sql.PreparedStatement;

public final class purchase_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <center><title>To Do App: Insert</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
   
        
      out.write("\n");
      out.write("       \n");
      out.write("       <center>\n");
      out.write("        <h1>Shop Management</h1>\n");
      out.write("        <form>\n");
      out.write("            <h3>");
      out.print(result);
      out.write("</h3>\n");
      out.write("           <input type=\"hidden\" name=\"check\" value=\"1\">\n");
      out.write("            receiptno<input value=\"");
      out.print(receiptno);
      out.write("\" name=\"receiptno\" type=\"number\" placeholder=\"ReceiptNo\"min=\"0\"><br>\n");
      out.write("            dateofpurchase<input value=\"");
      out.print(dateofpurchase);
      out.write("\" name=\"dateofpurchase\" type=\"text\" placeholder=\"DateOfPurchase\"><br>\n");
      out.write("            TotalAmount<input value=\"");
      out.print(TotalAmount);
      out.write("\"name=\"totalamount\" type=\"number\" placeholder=\"TotalAmount\"><br>\n");
      out.write("            SupplierName<input value=\"");
      out.print(SupplierName);
      out.write("\"name=\"suppliername\" type=\"text\" placeholder=\"SupplierName\"><br>\n");
      out.write("            SupplierAddress<input value=\"");
      out.print(SupplierAddress);
      out.write("\"name=\"supplieraddress\" type=\"text\" placeholder=\"SupplierAddress\"><br>\n");
      out.write("            SupplierPhones<input value=\"");
      out.print(SupplierPhones);
      out.write("\"name=\"supplierphones\" type=\"number\" placeholder=\"SupplierPhones\"><br>\n");
      out.write("            SupplierEmail<input value=\"");
      out.print(SupplierEmail);
      out.write("\"name=\"supplieremail\" type=\"text\" placeholder=\"SupplierEmail\"><br>\n");
      out.write("            amountpaid<input value=\"");
      out.print(amountpaid);
      out.write("\"name=\"amountpaid\" type=\"number\" placeholder=\"amountpaid\"><br>\n");
      out.write("            amountpending<input value=\"");
      out.print(amountpending);
      out.write("\"name=\"amountpending\" type=\"number\" placeholder=\"amountpending\"><br>\n");
      out.write("            remarks   <input value=\"");
      out.print(remarks);
      out.write("\"name=\"remarks\" type=\"text\" placeholder=\"remarks\"><br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <input type=\"submit\">\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("        </form>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
