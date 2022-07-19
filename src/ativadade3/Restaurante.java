package src.ativadade3;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {

    String nome;
    String ingredientes;

    Scanner input = new Scanner(System.in);

    ArrayList<Restaurante> cardapio = new ArrayList<>();


    public Restaurante(String nome, String ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public Restaurante() {

    }

    //adiciopmar//
    public void adicionar() {
        System.out.println("Qual é nome do Prato? ");
        String prato = input.nextLine();

        System.out.println("Qual é nome do acompanhamento? ");
        ingredientes = input.nextLine();

        System.out.println("Você adicionou um novo prato  " + prato+ "  e com acompanhamento  "  + ingredientes);

        Restaurante novoCardapio = new Restaurante(prato, ingredientes);
        cardapio.add(novoCardapio);


    }
    // Exibir//

    public void exibir() {
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println("numero  " + i + ": prato: " + cardapio.get(i).getNome() + " ingredientes: " + cardapio.get(i).getIngredientes());
        }
    }

    public void excluir() {
        exibir();
        System.out.println("digite o numero do prato para ser removido ");
        int excluirC = Integer.parseInt(input.nextLine());
        if (excluirC <= cardapio.size()) {
            cardapio.remove(excluirC);
            System.out.println("prato removido");
        } else {
            System.out.println("prato já foi removido");
        }
    }






        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


}
