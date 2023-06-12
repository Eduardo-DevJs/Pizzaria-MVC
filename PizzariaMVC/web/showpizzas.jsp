<%@page import="java.util.List"%>
<%@page import="Models.PizzaModel"%>
<%@page import="Controllers.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/tabela.css.css"/>
    </head>
    <body> 
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <%
            List<PizzaModel> listPizzas = PizzaController.getAllPizzas();
            request.setAttribute("listPizzas", listPizzas);
        %>

        <table>
            <tr>
                <th>ID</th>
                <th>Nome da Pizza</th>
                <th>Descricao Pizza</th>
                <th>Preço Pizza</th>
                <th>Ações</th>
            </tr>
            <c:forEach items="${listPizzas}" var="Pizza">
                <tr>
                    <td>${Pizza.getIdPizza()}</td>
                    <td>${Pizza.getNomePizza()}</td>
                    <td>${Pizza.getIngredientesPizza()}</td>
                    <td>${Pizza.getPrecoPizza()}</td>

                    <td class="acoes">
                      <a class="edit" href="editpizza.jsp?id=${Pizza.getIdPizza()} ">EDIT</a>
                      <a class="delete" href="deletepizza.jsp?id=${Pizza.getIdPizza()} ">DELETE</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <a class="createUser" href="createpizza.jsp">Criar novo Usuário</a>
    </body>
</html>

