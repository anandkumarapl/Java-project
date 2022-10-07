package org.apache.jsp.todo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        int n=0;
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <h2>Result = ");
      out.print(result);
      out.write("</h2>\n");
      out.write("        <form method=\"get\">\n");
      out.write("            <input type=\"hidden\" name=\"postback\" value=\"1\">\n");
      out.write("            N1 <input value=\"");
      out.print(n1);
      out.write("\" step=\"10\" max=\"\" min=\"0\" type=\"number\" name=\"n1\">\n");
      out.write("            <br>\n");
      out.write("            N2 <input value=\"");
      out.print(n2);
      out.write("\" step=\"10\" max=\"\" min=\"0\" type=\"number\" name=\"n2\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" name=\"option\" value=\"Add\"/>\n");
      out.write("            <input type=\"submit\" name=\"option\" value=\"Sub\"/>\n");
      out.write("            <input type=\"submit\" name=\"option\" value=\"Mul\"/>\n");
      out.write("            <input type=\"submit\" name=\"option\" value=\"Div\"/>\n");
      out.write("            <input type=\"submit\" name=\"option\" value=\"Mod\"/>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"postback\" value=\"1\">\n");
      out.write("            N1 <input value=\"");
      out.print(n1);
      out.write("\" step=\"10\" max=\"100\" min=\"0\" type=\"number\" name=\"n1\">\n");
      out.write("            <br>\n");
      out.write("            N2 <input value=\"");
      out.print(n2);
      out.write("\" step=\"10\" max=\"100\" min=\"0\" type=\"number\" name=\"n2\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Add\"/>\n");
      out.write("        </form>\n");
      out.write("        <!--\n");
      out.write("        Get                         Post\n");
      out.write("        Data in url                 Data not visible\n");
      out.write("        No warning on refresh       Warning on refresh\n");
      out.write("        Files cannot be submitted   File can be submitted\n");
      out.write("        Data length is limited      Data length is more\n");
      out.write("        \n");
      out.write("        -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
