import java.util.Arrays;

public class Sanduiche extends Lanche {
    // Controlar a quantidade de ingredientes no meu array
    private int contIngredientes=0; //1
    // Todos os lanches derivam da classe Lanche
    // Existem 3 tipos de lanches: sanduíche, massa e bolo
    // Sanduíche deve receber um vetor de até 10 ingredientes
    private String[] ingredientes=new String[10];

    // Construtor da subclasse Sanduiche
    public Sanduiche(){
        super.setTempoPreparo(15);
    }

    public void setContIngredientes(int contIngredientes) {
        this.contIngredientes = contIngredientes;
    }

    public void adicionarIngrediente(String ingrediente) {
        if(contIngredientes<ingredientes.length) {
            this.ingredientes[contIngredientes] = ingrediente;
            contIngredientes++;
        } else {
            System.out.println("Número máximo de ingredientes atingidos!");
        }
    }

    @Override
    public String toString() {
        return "Sanduiche{" +
                "ingredientes=" + Arrays.toString(ingredientes).strip() +
                '}';
    }
}
