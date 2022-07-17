package src.atividade1;

import java.util.ArrayList;

public class MainProduto {

    public static void main(String[] args) {

    ArrayList<LstaProduto> ListaDeProdutos = new ArrayList<>();

    LstaProduto p1 = new LstaProduto();
    LstaProduto p2 = new LstaProduto();

    p1.setNome("Cafe");
    p1.setPreco(15);

    p2.setNome("leite");
    p2.setPreco(7);

    LstaProduto.add(p1);
    LstaProduto.add(p2);

        System.out.println("Lista do mercado" );
        System.out.println();
        //for ( int mercado = 0; mercado < LstaProduto.size(); )
        System.out.println( "Nome  " + p1.getNome() + "   Preço  " + p1.getPreco() );
        System.out.println( "Nome  " + p2.getNome() + "  Preço  " + p2.getPreco() );


    }


}




