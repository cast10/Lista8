package src.atividade2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candidato {

    private String numeroDeMatr;
    private String nota;

    Scanner input = new Scanner(System.in);

    ArrayList<Candidato> listadecandidato = new ArrayList<>();

    public Candidato(String numeroDeMatr, String nota) {
        this.numeroDeMatr = numeroDeMatr;
        this.nota = nota;
    }

    public Candidato(String matricula, float nota) {
    }

    public Candidato() {

    }

    public void adicionar(){
        System.out.println("Qual é matricula?");
        String matricula = input.next();

        System.out.println("Qual é sua nota?");
        System.out.println("");
        float nota = input.nextFloat();

        System.out.println("você irá adicionar um novo candidato ");

        Candidato novoCandidato = new Candidato(matricula, nota);
        listadecandidato.add(novoCandidato);
    }
    public void exibirCandidato(){

        for (int i =0; i<listadecandidato.size();i++)
        System.out.println("Numero de matrícula  "+ listadecandidato.get(i).getNumeroDeMatr() + "  nota " + listadecandidato.get(i).getNota());

    }
    public void excluirCandidato(){
        System.out.println("Qual número de matricula você quer excluir ?");
        exibirCandidato();
        String excluir = input.next();

        for ( int i= 0; i < listadecandidato.size(); i++){
            if(listadecandidato.get(i).getNumeroDeMatr().equals(excluir)) {
             listadecandidato.remove(i);
             System.out.println("Esse candidato foi removido com sucesso");

            }

        }

    }

    public String getNumeroDeMatr() {
        return numeroDeMatr;
    }

    public void setNumeroDeMatr(String numeroDeMatr) {
        this.numeroDeMatr = numeroDeMatr;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public void exibirCamdidato() {
    }
}
