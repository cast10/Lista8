package src.atividade1;

import java.util.ArrayList;


public class MainProduto {

    public static void main(String[] args) {

        ArrayList<ListaProduto> produtoComPreco = new ArrayList<>();

        ListaProduto p1= new ListaProduto("café", 14.00);
        ListaProduto p2= new ListaProduto("leite", 7.00);
        ListaProduto p3= new ListaProduto("pao", 1.00);

        produtoComPreco.add(p1);
        produtoComPreco.add(p2);
        produtoComPreco.add(p3);



        produtoComPreco.remove(p2);

        for (ListaProduto i :produtoComPreco){
            System.out.println("Nome do produto  "+ i.getNome()+ "  Preço  "+ i.getPreco());

        }





    }


}




