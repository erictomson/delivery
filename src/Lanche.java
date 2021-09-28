public abstract class Lanche {
    // Lanche tem preço
    private double preco;

    // Construtor da superclasse (classe abstrata)
    public Lanche() {
        this.preco=0;
    }

    public Lanche(double preco) {
        this.preco = preco;
    }

    // Getters e Setters da classe abstrata
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
