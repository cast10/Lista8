package src.atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean c = true;
        Scanner scan = new Scanner(System.in);
        Candidato candidato = new Candidato();

        while(c == true){
            System.out.println("O que quer fazer hoje? Segue as opções: ");
            System.out.println("Digite 1 - adicionar candidato");
            System.out.println("Digite 2 - exibir candidato");
            System.out.println("Digite 3 - excluir candidato");
            System.out.println("Digite 4 - sair");

            int escolhaDoUser = scan.nextInt();

            switch (escolhaDoUser){

                case 1:
                    candidato.adicionar();
                    break;

                case 2:
                    candidato.exibirCamdidato();
                    break;

                case 3:
                    candidato.excluirCandidato();
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

