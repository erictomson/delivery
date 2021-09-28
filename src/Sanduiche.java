public class Sanduiche extends Lanche {
    // Todos os lanches derivam da classe Lanche
    // Existem 3 tipos de lanches: sanduíche, massa e bolo
    // Sanduíche deve receber um vetor de até 10 ingredientes
    private String[] ingredientes=new String[10];

    // Construtor da subclasse Sanduiche
    public Sanduiche(){
        super.setTempoPreparo(15);
    }

    // Getters e Setters da subclasse Sanduiche
    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

}
