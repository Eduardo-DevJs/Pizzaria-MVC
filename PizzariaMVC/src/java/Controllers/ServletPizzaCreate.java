/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import Models.PizzaModel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andre
 */
@WebServlet(name = "ServletPizzaCreate", urlPatterns = {"/ServletPizzaCreate"})
public class ServletPizzaCreate extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String imgPizza = request.getParameter("imgPizza");
        String ingredientes = request.getParameter("ingredientes");
        int precoPizza = Integer.parseInt(request.getParameter("precoPizza"));
// Crie um objeto UserModel com os dados recebidos
        PizzaModel pizza = new PizzaModel();
        pizza.setNomePizza(nome);
        pizza.setImagemPizza(imgPizza);
        pizza.setIngredientesPizza(ingredientes);
        pizza.setPrecoPizza(precoPizza);
// Chame o método no UserController para salvar o usuário no banco de dados
        PizzaController.createPizza(pizza);
// Redirecione para uma página de sucesso ou exiba uma mensagem de sucesso
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
