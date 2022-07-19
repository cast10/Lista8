package src.ativadade3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean c = true;
        Scanner scan = new Scanner(System.in);
        Restaurante novoCardapio = new Restaurante();

        while(c == true){
            System.out.println("O que quer fazer hoje? Segue as opções: ");
            System.out.println("Digite 1 - adicionar novo cardapio");
            System.out.println("Digite 2 - exibir novo cardapio");
            System.out.println("Digite 3 - excluir novo cardapio");
            System.out.println("Digite 4 - sair");

            int escolhaDoUser = scan.nextInt();

            switch (escolhaDoUser){

                case 1:
                    novoCardapio.adicionar();
                    break;

                case 2:
                    novoCardapio.exibir();
                    break;

                case 3:
                    novoCardapio.excluir();
                    break;

                case 4:
                    c = false;
                    break;

                default:
                    System.out.println("Escolha inválida");
            }

        }

    }
}
