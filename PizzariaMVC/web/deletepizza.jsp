<%@page import="Models.PizzaModel"%>
<%@page import="Controllers.PizzaController" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/modal.css">
        <title>Document</title>
    </head>
    <body>  
        <%
            String id = request.getParameter("id");
            PizzaModel pizza = PizzaController.getPizzaById(Integer.parseInt(id));
        %>
        <section class="modal-container" data-modal="container">
            <form action="ServletPizzaDelete" method="get">
                <input type="hidden" name="id" value="<%=pizza.getIdPizza()%>"/>
                <div class="modal">
                    <h1>Tem certeza que deseja Exlcuir?</h1>
                    <input type="submit" class="btnModal"  value="Sim"/></input>
                </div>
            </form>
        </section>

        <script>
            const modal = document.querySelector(".modal")
            setTimeout(() => {
                modal.classList.add('ativo')
            }, 1000)
        </script>
    </body>
</html>