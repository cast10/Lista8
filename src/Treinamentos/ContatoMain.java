package src.Treinamentos;

import java.util.ArrayList;

public class ContatoMain {
    public static void main(String[] args) {

        ArrayList<Contato> contato = new ArrayList<>();

        Contato c1= new Contato("Douglas", "jjjde", "7774747474");
        Contato c2= new Contato("Bruna", "jjjde", "7774747474");
        Contato c3= new Contato("Ale", "jjjde", "7774747474");

        contato.add(c1);
        contato.add(c2);
        contato.add(c3);

        contato.remove(c2);


        for (Contato c : contato) {
            System.out.println("Nome   " +c.getNome() + "     email  "+ c.getEmail()+  "  celular  "+ c.getCelular() );


        }
    }
}
