package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Models.PizzaModel;
import Controllers.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"pt-BR\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("        <title>La Pizza</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        ");

            List<PizzaModel> listPizzas = PizzaController.getAllPizzas();
            request.setAttribute("listPizzas", listPizzas);
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <header class=\"header-bg\">\r\n");
      out.write("            <div class=\"header container\">\r\n");
      out.write("                <h2 class=\"logo\">La pizza</h2>\r\n");
      out.write("\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul class=\"menu-lista\">\r\n");
      out.write("                        <li><a id=\"create\" href=\"createpizza.jsp\">Criar Pizza</a></li>\r\n");
      out.write("                        <li><a id=\"show\" href=\"showpizzas.jsp\">Mostrar Pizzas</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <main class=\"introducao-bg\">\r\n");
      out.write("            <div class=\"introducao container\">\r\n");
      out.write("                <h1 class=\"titulo-introducao\">La P<span class=\"cor-yellow\">i</span><span class=\"cor-red\">z</span><span class=\"cor-green\">z</span>a</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"vendidos-bg\">\r\n");
      out.write("            <div class=\"vendidos container\">\r\n");
      out.write("                <h1 class=\"titulo-vendidos\">Mais Vendidos</h1>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"listaVendidos\">\r\n");
      out.write("                    <li class=\"item-pizza\">\r\n");
      out.write("                        <img src=\"img/pizza1.svg\" alt=\"Pizza\">\r\n");
      out.write("                        <h3 class=\"nomePizza\">La Cuma</h3>\r\n");
      out.write("                        <p class=\"ingredientes cor-gray\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                        <h2 class=\"precoPizza\">R$ 23</h2>\r\n");
      out.write("                        <button class=\"btnComprar\" type=\"button\">Comprar Agora</button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"item-pizza\">\r\n");
      out.write("                        <img src=\"img/pizza2.svg\" alt=\"Pizza\">\r\n");
      out.write("                        <h3 class=\"nomePizza\">La Cuma</h3>\r\n");
      out.write("                        <p class=\"ingredientes cor-gray\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                        <h2 class=\"precoPizza\">R$ 23</h2>\r\n");
      out.write("                        <button class=\"btnComprar\" type=\"button\">Comprar Agora</button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"item-pizza\">\r\n");
      out.write("                        <img src=\"img/pizza3.svg\" alt=\"Pizza\">\r\n");
      out.write("                        <h3 class=\"nomePizza\">La Cuma</h3>\r\n");
      out.write("                        <p class=\"ingredientes cor-gray\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                        <h2 class=\"precoPizza\">R$ 23</h2>\r\n");
      out.write("                        <button class=\"btnComprar\" type=\"button\">Comprar Agora</button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"item-pizza\">\r\n");
      out.write("                        <img src=\"img/pizza4.svg\" alt=\"Pizza\">\r\n");
      out.write("                        <h3 class=\"nomePizza\">La Cuma</h3>\r\n");
      out.write("                        <p class=\"ingredientes cor-gray\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                        <h2 class=\"precoPizza\">R$ 23</h2>\r\n");
      out.write("                        <button class=\"btnComprar\" type=\"button\">Comprar Agora</button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"item-pizza\">\r\n");
      out.write("                        <img src=\"img/pizza1.svg\" alt=\"Pizza\">\r\n");
      out.write("                        <h3 class=\"nomePizza\">La Cuma</h3>\r\n");
      out.write("                        <p class=\"ingredientes cor-gray\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                        <h2 class=\"precoPizza\">R$ 23</h2>\r\n");
      out.write("                        <button class=\"btnComprar\" type=\"button\">Comprar Agora</button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"item-pizza\">\r\n");
      out.write("                        <img src=\"img/pizza2.svg\" alt=\"Pizza\">\r\n");
      out.write("                        <h3 class=\"nomePizza\">La Cuma</h3>\r\n");
      out.write("                        <p class=\"ingredientes cor-gray\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                        <h2 class=\"precoPizza\">R$ 23</h2>\r\n");
      out.write("                        <button class=\"btnComprar\" type=\"button\">Comprar Agora</button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"item-pizza\">\r\n");
      out.write("                        <img src=\"img/pizza3.svg\" alt=\"Pizza\">\r\n");
      out.write("                        <h3 class=\"nomePizza\">La Cuma</h3>\r\n");
      out.write("                        <p class=\"ingredientes cor-gray\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                        <h2 class=\"precoPizza\">R$ 23</h2>\r\n");
      out.write("                        <button class=\"btnComprar\" type=\"button\">Comprar Agora</button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"item-pizza\">\r\n");
      out.write("                        <img src=\"img/pizza4.svg\" alt=\"Pizza\">\r\n");
      out.write("                        <h3 class=\"nomePizza\">La Cuma</h3>\r\n");
      out.write("                        <p class=\"ingredientes cor-gray\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                        <h2 class=\"precoPizza\">R$ 23</h2>\r\n");
      out.write("                        <button class=\"btnComprar\" type=\"button\">Comprar Agora</button>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPizzas}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("Pizza");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                        <li class=\"item-pizza\">\r\n");
            out.write("                            ");
 
                                out.write("<img src='img/pizza1.svg'" );
 
                            
            out.write("\r\n");
            out.write("                            <h3 class=\"nomePizza\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Pizza.getNomePizza()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</h3>\r\n");
            out.write("                            <p class=\"ingredientes cor-gray\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Pizza.getIngredientesPizza()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("                            <h2 class=\"precoPizza\">R$ ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Pizza.getPrecoPizza()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</h2>\r\n");
            out.write("                            <button class=\"btnComprar\" type=\"button\">Comprar Agora</button>\r\n");
            out.write("                        </li>\r\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"sobre-bg\">\r\n");
      out.write("            <div class=\"sobre container\">\r\n");
      out.write("                <img src=\"img/restaurante.png\" alt=\"Restaurante\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"sobreLaPizza\">\r\n");
      out.write("                    <h1 class=\"sobre-titulo\">Sobre a La Pizza</h1>\r\n");
      out.write("                    <p class=\"sobre-paragrafo\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce quis justo sem. Donec consequat, nunc a dapibus dapibus, justo dolor tristique tortor, sit amet tincidunt lorem nisl at ex. Cras dolor purus, varius in euismod pretium, finibus nec mi. Curabitur aliquam pharetra lectus in pharetra. Nullam viverra elementum neque quis fermentum. </p>\r\n");
      out.write("                    <a id=\"leiaMais\" href=\"/\">Leia Mais</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <footer class=\"footer-bg\">\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                <p>Feito por Dudu</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
