<%@page import="Models.PizzaModel"%>
<%@page import="Controllers.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/cadastro.css"/>
    </head>
    <body>
        <div class="container">
            <form action="ServletPizzaCreate" method="post" class="form">
                <label for="nomeProduto">Nome Pizza</label>
                <input type="text" name="nome" id="nomeProduto" required>
                <label for="descricaoProduto">Descrição da Pizza</label>
                <textarea name="ingredientes" id="descricaoProduto" cols="30" rows="10" required></textarea>
                <select name="imgPizza" id="imgPizza">
                    <option value="portuguesa">Portuguesa</option>
                    <option value="mucarela">Muçarela</option>
                    <option value="calabresa">Calabresa</option>
                    <option value="baiana">Baiana</option>
                </select>
                <label for="precoProduto">Preço da Pizza</label>
                <input type="number" id="precoProduto" name="precoPizza" placeholder="R$" required>
                <button type="submit">Cadastrar Produto</button>
            </form>
        </div>
    </body>

</html>
