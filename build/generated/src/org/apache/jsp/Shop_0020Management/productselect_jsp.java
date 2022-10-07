package org.apache.jsp.Shop_0020Management;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import database.DbConnect;

public final class productselect_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Select</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <h1>Product Select</h1>\n");
      out.write("  ");

            PreparedStatement statement = DbConnect.connect().prepareStatement("select productid,productname from products  order by productname");
            ResultSet rs = statement.executeQuery();
        
      out.write("\n");
      out.write("        \n");
      out.write("            <input type=\"hidden\" name=\"check\">\n");
      out.write("            ");
                String check = "",result="";
                check = request.getParameter("check");
                boolean ispostback = true;
                if (check == null) {
                    ispostback = false;
                }
            
      out.write("\n");
      out.write("            <select name=\"product\">\n");
      out.write("                <option>Select</option>\n");
      out.write("                ");
                while (rs.next()) {
                        String productid = "" + rs.getObject("productid");
                        String productname = "" + rs.getObject("productname");
                
      out.write("\n");
      out.write("                <option value=\"");
      out.print(productid);
      out.write('"');
      out.write('>');
      out.print(productname);
      out.write("</option>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                Quantity<input name=\"quantity\" value=\"1\" type=\"number\" min=\"1\">\n");
      out.write("                <input type=\"submit\" value=\"Submit\">\n");
      out.write("            </select>\n");
      out.write("                ");

                if(ispostback)
                {
                    try{                      
                 
                    String productid=request.getParameter("product");
                    String quantity=request.getParameter("quantity");
                    PreparedStatement ps=DbConnect.connect().prepareStatement("insert into productlist values(?,?)");
                    ps.setString(1, productid);
                    ps.setString(2, quantity);
                    ps.executeUpdate();
                    int n=ps.executeUpdate();
                    result="Inserted " + n + " records";
                    }
                    catch(Exception ex)
                    {
                System.out.println(ex);
              result= ex.getMessage();
                }
                }
               
      out.write("\n");
      out.write("               `            \n");
      out.write("        </center>\n");
      out.write("    </body>\n");
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
