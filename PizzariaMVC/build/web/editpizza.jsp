<%@page import="Models.PizzaModel"%>
<%@page import="Controllers.PizzaController" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Pizza</title>
    </head>
    <body>
        <h1>Editar Pizza</h1>

        <%
            String id = request.getParameter("id");
            PizzaModel pizza = PizzaController.getPizzaById(Integer.parseInt(id));
        %>
        <form action="ServletPizzaUpdate" method="post">
            <input type="hidden" name="id" value="<%=pizza.getIdPizza()%>"/>
            <table>
                <tr>
                    <td>Nome da Pizza: </td>
                    <td><input type="text" name="nome" value="<%=pizza.getNomePizza()%>"/>
                    <td>Ingredientes: </td>
                    <td><input type="text" name="ingredientes" value="<%=pizza.getIngredientesPizza()%>"/>
                    <td>Preço Pizza: </td>
                    <td><input type="number" name="precoPizza" value="<%=pizza.getPrecoPizza()%>"/>
                </tr>
                <tr>
                    <td><input type="submit"  value="Edit Pizza"/></input></td>
                </tr>
            </table>
        </form>

    </body>
</html>
