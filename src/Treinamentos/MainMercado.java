package src.Treinamentos;

import java.util.ArrayList;

public class MainMercado {

    public static void main(String[] args) {

        String nome;
        double precp;

        ArrayList<String> ListaDeProdutos = new ArrayList<>();

        ListaDeProdutos.add("Cafe");
        ListaDeProdutos.add("Açuca");
        ListaDeProdutos.add("Leite");
        ListaDeProdutos.add("Pão");
        ListaDeProdutos.add("Manteiga");

        ListaDeProdutos.remove(0);


        for (String N : ListaDeProdutos){
        System.out.println(N);

        }
    }
}
