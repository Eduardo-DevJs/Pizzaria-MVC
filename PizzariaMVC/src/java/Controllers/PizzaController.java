package Controllers;

/**
 *
 * @author Dudu
 */
//Pacotes necessarios para usar o banco e outras funções
import Models.PizzaModel;
import java.util.List;
import Connections.ConnectionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PizzaController {
//Função para mostrar todos os Usuarios cadastrados no banco

    public static List<PizzaModel> getAllPizzas() {
//Criar a conexão
        Connection con = null;
        ConnectionSQL connection = new ConnectionSQL();
//Uma forma de você fazer uma inserção no banco mais segura, onde você prepara os parametros para serem inseridos.
        PreparedStatement pS;
//Uma interface utilizada pra guardar dados vindos de um banco de dados.
        ResultSet rS;
//Comando sql para selecionar todos os usuarios do banco
        String sql = "select * from Pizzas";
//Lista para guardar os usuarios do banco
        List pizzaList = new ArrayList();
        try {
//Pegar conexao com o banco
            con = connection.connection();
            pS = con.prepareStatement(sql);
            rS = pS.executeQuery();
//para percorrer o resultset
            while (rS.next()) {
//Atributos do banco, rS.getInt("id_user"), pega o resultado do banco e transforma em inteiro;
//O que está dentro do get.Int("NOME DO ATRIBUTO NO BANCO") Tem que ser igual o nome que está no banco de dados.
                int id = rS.getInt("id_pizza");
                String name = rS.getString("nome_pizza");
                String ingredientes = rS.getString("ingrediente_pizza");
                int precoPizza = rS.getInt("precoPizza");
//Criando um novo usuario a partir dos valores no banco
                PizzaModel pizza = new PizzaModel(id, name, ingredientes, precoPizza);
//Adicionando na nossa lista de usuarios
                pizzaList.add(pizza);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            connection.TurnOffConnection(con);
        }
//Retorna a lista com todos os usuarios do banco
        return pizzaList;
    }

    public static PizzaModel getPizzaById(int id) {
        PizzaModel pizza = null;
//Criar a conexão
        Connection con = null;
        ConnectionSQL connection = new ConnectionSQL();
//Uma forma de você fazer uma inserção no banco mais segura, onde você prepara os parametros para serem inseridos.
        PreparedStatement pS;
//Uma interface utilizada pra guardar dados vindos de um banco de dados.
        ResultSet rS;
//Comando sql para selecionar todos os usuarios do banco
        String sql = "SELECT * FROM Pizzas WHERE id_pizza=" + id;
//Lista para guardar os usuarios do banco
        try {
//Pegar conexao com o banco
            con = connection.connection();
            pS = con.prepareStatement(sql);
            rS = pS.executeQuery();
//para percorrer o resultset
            while (rS.next()) {
//Atributos do banco, rS.getInt("id_user"), pega o resultado do banco e transforma em inteiro;
//O que está dentro do get.Int("NOME DO ATRIBUTO NO BANCO") Tem que ser igual o nome que está no banco de dados.
                String name = rS.getString("nome_pizza");
                String ingredientes = rS.getString("ingrediente_pizza");
                int precoPizza = rS.getInt("precoPizza");
//Criando um novo usuario a partir dos valores no banco
                pizza = new PizzaModel(id, name, ingredientes, precoPizza);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            connection.TurnOffConnection(con);
        }
//Retorna a lista com todos os usuarios do banco
        return pizza;
    }

    public static int updatePizza(PizzaModel pizza) {
        int status = 0;
        Connection con = null;
        ConnectionSQL connection = new ConnectionSQL();
        //Uma forma de você fazer uma inserção no banco mais segura, onde você prepara os parametros para serem inseridos.​
        PreparedStatement pS;
        //Comando sql para selecionar todos os usuarios do banco​
        String sql = "UPDATE Pizzas SET nome_pizza =?, ingrediente_pizza=?, precoPizza=? WHERE id_pizza=?";

        try {
            //Pegar conexao com o banco​
            con = connection.connection();
            pS = con.prepareStatement(sql);
            //para alterar o nome o 1 é o primeiro "?", o 2 é o segundo "?" e o 3 é o terceiro "?"
            pS.setString(1, pizza.getNomePizza());
            pS.setString(2, pizza.getIngredientesPizza());
            pS.setInt(3, pizza.getPrecoPizza());
            pS.setInt(4, pizza.getIdPizza());
            status = pS.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            connection.TurnOffConnection(con);
        }
        //Retorna a lista com todos os usuarios do banco​
        return status;
    }

    public static int createPizza(PizzaModel pizza) {
        int status = 0;
        Connection con = null;
        ConnectionSQL connection = new ConnectionSQL();
        //Uma forma de você fazer uma inserção no banco mais segura, onde você prepara os parametros para serem inseridos.​
        PreparedStatement pS;
        //Comando sql para selecionar todos os usuarios do banco​
        String sql = "INSERT INTO Pizzas (nome_pizza,ingrediente_pizza,precoPizza) VALUES (?,?,?)";

        try {
            //Pegar conexao com o banco​
            con = connection.connection();
            pS = con.prepareStatement(sql);
            //para alterar o nome
            pS.setString(1, pizza.getNomePizza());
            pS.setString(2, pizza.getIngredientesPizza());
            pS.setInt(3, pizza.getPrecoPizza());
            status = pS.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            connection.TurnOffConnection(con);
        }
        //Retorna a lista com todos os usuarios do banco​
        return status;
    }

    public static int deletePizza(int id) {
        int status = 0;
        Connection con = null;
        ConnectionSQL connection = new ConnectionSQL();
//Uma forma de você fazer uma inserção no banco mais segura, onde você prepara os parametros para serem inseridos.
        PreparedStatement pS;
//Comando sql para selecionar todos os usuarios do banco
        String sql = "DELETE FROM Pizzas WHERE id_pizza=" + id;
        try {
//Pegar conexao com o banco
            con = connection.connection();
            pS = con.prepareStatement(sql);
//para alterar o nome
            status = pS.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            connection.TurnOffConnection(con);
        }
//Retorna a lista com todos os usuarios do banco
        return status;
    }
}
