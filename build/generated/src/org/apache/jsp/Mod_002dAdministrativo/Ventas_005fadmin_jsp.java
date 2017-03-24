package org.apache.jsp.Mod_002dAdministrativo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ventas_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Mod-Administrativo/../headerModulos.jspf");
    _jspx_dependants.add("/Mod-Administrativo/../footer.jspf");
  }

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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("            <!-- El logotipo y el icono que despliega el menú se agrupan\r\n");
      out.write("                 para mostrarlos mejor en los dispositivos móviles -->\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("                        data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Desplegar navegación</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <img src=\"img/logolj.png\" width=\"50px\" style=\"vertical-align: middle; float: left;\" alt=\"\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">LA JUGOSA</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Agrupar los enlaces de navegación, los formularios y cualquier\r\n");
      out.write("                 otro elemento que se pueda ocultar al minimizar la barra -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-briefcase\"></span>Administrativo<span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"MOD-ADMINISTRATIVO/Administrativo_Autorizaciones.html\">Autorizaciones</a></li>\r\n");
      out.write("          <li><a href=\"MOD-ADMINISTRATIVO/Administrativo_Ventas.html\">Informe de ventas</a></li>\r\n");
      out.write("          <li><a href=\"MOD-ADMINISTRATIVO/Administrativo_Insumos.html\">Informe de Insumos</a></li>\r\n");
      out.write("          <li><a href=\"MOD-ADMINISTRATIVO/Administatrivo_InformeEmpleados.html\">Informe de empleados</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-apple\">Insumos<span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"../Mod-Insumos/VerlistadeInsumos.jsp\">Ver lista de insumos</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Insumos/SolicitarInsumo.jsp\">Solicitar Insumo</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Insumos/RegistrarInsumo.jsp\">Registrar insumos</a></li>\r\n");
      out.write("          <li><a href=\"#\">Inicio</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-shopping-cart\">Ventas<span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"../Mod-Ventas/RegistrarVentas.jsp\">Registrar ventas</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Ventas/ListarVentas.jsp\">Listar ventas</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Ventas/InforVentas.jsp\">Realizar infrome de ventas</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-Ventas/FacturaVentas.jsp\">Generar factura de ventas</a></li>\r\n");
      out.write("         \r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("     \r\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Recursos humanos<span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"../Mod-RecursosHumanos/RegistrarEmpleados.jsp\">Registrar empleados</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-RecursosHumanos/ListarEmpleados.jsp\">Listar empleados</a></li>\r\n");
      out.write("          <li><a href=\"../Mod-RecursosHumanos/Novedades.jsp\">Novedades</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("      \r\n");
      out.write("         <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Clientes<span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"#\">Registrar clientes</a></li>\r\n");
      out.write("          <li><a href=\"#\">Listar clientes</a></li>\r\n");
      out.write("          <li><a href=\"#\">Solicitar domicilio</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("        <li><a href=\"#\">Cerrar sesión</a></li>\r\n");
      out.write("      \r\n");
      out.write("   \r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </ul>\r\n");
      out.write("   <!--  <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a href=\"#\">Cerrar sesión</a></li> >\r\n");
      out.write("    </ul> -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <section class=\"main container-fluid\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <select name=\"ver_info_ventas\" id=\"info_ventas\">\n");
      out.write("                        <option value=\"\">por sede</option>\n");
      out.write("                        <option value=\"\">al dia</option>\n");
      out.write("                        <option value=\"\">en general</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h2 style=\"text-align: center;\">Informe de ventas</h2>\n");
      out.write("                    <p style=\"text-align: center;\">Consulte aqui el informe de ventas por sede.</p>\n");
      out.write("                    <table class=\"table table-bordered table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Sede</th>\n");
      out.write("                                <th>Tipo de informe</th>\n");
      out.write("                                <th>Detalle</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Envigado</td>\n");
      out.write("                                <td>por sede</td>\n");
      out.write("                                <td><a data-toggle=\"modal\" href=\"#myModal\"><span class=\"glyphicon glyphicon-inbox\"></span></a>\n");
      out.write("                                    <!-- Modal -->\n");
      out.write("                                    <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("                                        <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                                            <!-- Modal content-->\n");
      out.write("                                            <div class=\"modal-content\">\n");
      out.write("                                                <div class=\"modal-header\">\n");
      out.write("                                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                                    <h4 class=\"modal-title\">Modal Header</h4>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"modal-body\">\n");
      out.write("                                                    <p>Some text in the modal.</p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"modal-footer\">\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Itagui</td>\n");
      out.write("                                <td>por sede</td>\n");
      out.write("                                <td><a href=\"#\"><span class=\"glyphicon glyphicon-inbox\"></span></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Poblado</td>\n");
      out.write("                                <td>por sede</td>\n");
      out.write("                                <td><a href=\"#\"><span class=\"glyphicon glyphicon-inbox\"></span></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Carrera 80</td>\n");
      out.write("                                <td>por sede</td>\n");
      out.write("                                <td><a href=\"#\"><span class=\"glyphicon glyphicon-inbox\"></span></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Los Sauces</td>\n");
      out.write("                                <td>por sede</td>\n");
      out.write("                                <td><a href=\"#\"><span class=\"glyphicon glyphicon-inbox\"></span></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Laureles</td>\n");
      out.write("                                <td>por sede</td>\n");
      out.write("                                <td><a href=\"#\"><span class=\"glyphicon glyphicon-inbox\"></span></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Avenida Oriental</td>\n");
      out.write("                                <td>por sede</td>\n");
      out.write("                                <td><a href=\"#\"><span class=\"glyphicon glyphicon-inbox\"></span></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Bello</td>\n");
      out.write("                                <td>por sede</td>\n");
      out.write("                                <td><a href=\"#\"><span class=\"glyphicon glyphicon-inbox\"></span></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Belen</td>\n");
      out.write("                                <td>por sede</td>\n");
      out.write("                                <td><span class=\"glyphicon glyphicon-inbox\"></span></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">VOLVER</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"container navbar-fixed-bottom\">\r\n");
      out.write("        <div class=\" text-center pie\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-xs-12\">\r\n");
      out.write("                    <p>La Jugosa &copy; </p>\r\n");
      out.write("                    <p>Todos los derechos reservados</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\n");
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