package Models;

public class PizzaModel {
    
    private int idPizza;
    private String imagemPizza;
    private String nomePizza;
    private String ingredientesPizza;
    private int precoPizza;
    
    public PizzaModel(){
 
    }
    
    public PizzaModel(int id, String imP ,String nP, String iP, int pP ){
        idPizza= id;
        imagemPizza = imP;
        nomePizza = nP;
        ingredientesPizza = iP;
        precoPizza = pP;
    }

    /**
     * @return the idPizza
     */
    public int getIdPizza() {
        return idPizza;
    }

    /**
     * @param idPizza the idPizza to set
     */
    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    /**
     * @return the imagemPizza
     */
    public String getImagemPizza() {
        return imagemPizza;
    }

    /**
     * @param imagemPizza the imagemPizza to set
     */
    public void setImagemPizza(String imagemPizza) {
        this.imagemPizza = imagemPizza;
    }

    /**
     * @return the nomePizza
     */
    public String getNomePizza() {
        return nomePizza;
    }

    /**
     * @param nomePizza the nomePizza to set
     */
    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }

    /**
     * @return the ingredientesPizza
     */
    public String getIngredientesPizza() {
        return ingredientesPizza;
    }

    /**
     * @param ingredientesPizza the ingredientesPizza to set
     */
    public void setIngredientesPizza(String ingredientesPizza) {
        this.ingredientesPizza = ingredientesPizza;
    }

    /**
     * @return the precoPizza
     */
    public int getPrecoPizza() {
        return precoPizza;
    }

    /**
     * @param precoPizza the precoPizza to set
     */
    public void setPrecoPizza(int precoPizza) {
        this.precoPizza = precoPizza;
    }
}