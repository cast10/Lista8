package src.atividade1;


public class ListaProduto {

        String nome;
        double preco;

    public ListaProduto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static void add(ListaProduto p1) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

