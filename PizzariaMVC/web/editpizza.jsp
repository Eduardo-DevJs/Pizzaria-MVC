<%@page import="Models.PizzaModel"%>
<%@page import="Controllers.PizzaController" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/cadastro.css"/>
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            PizzaModel pizza = PizzaController.getPizzaById(Integer.parseInt(id));
        %>
        <div class="container">
            <form action="ServletPizzaUpdate" method="post" class="form">
                <input type="hidden" name="id" value="<%=pizza.getIdPizza()%>"/>
                <label for="nomeProduto">Nome Pizza</label>
                <input type="text" value="<%=pizza.getNomePizza()%>" name="nome" id="nomeProduto" required>
                <label for="descricaoProduto">Descrição da Pizza</label>
                <textarea value="<%=pizza.getIngredientesPizza()%>" name="ingredientes" id="descricaoProduto" cols="30" rows="10" required></textarea>
                <select name="imgPizza" id="imgPizza">
                    <option value="portuguesa">Portuguesa</option>
                    <option value="mucarela">Muçarela</option>
                    <option value="calabresa">Calabresa</option>
                    <option value="">Baiana</option>
                </select>
                <label for="precoProduto">Preço da Pizza</label>
                <input value="<%=pizza.getPrecoPizza()%>" type="number" id="precoProduto" name="precoPizza" placeholder="R$" required>
                <button type="submit">Cadastrar Produto</button>
            </form>
        </div>
    </body>

</html>
