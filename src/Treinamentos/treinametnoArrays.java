package src.Treinamentos;

public class treinametnoArrays {

    public static void main(String[] args) {


        double[] horas = new double[10];
        horas[0] = 9.40;
        horas[1] = 9.41;
        horas[2] = 9.42;
        horas[3] = 9.43;
        horas[4] = 9.44;
        horas[5] = 9.45;

       // System.out.println("você acordou as   " + horas[3]);


        for(int i = 0; i < horas.length;i++){

            System.out.println("você acordou as   "  +  (i+1) + "   foi  "+ horas[i] );
           // System.out.println("O horário que você acordou no dia " + (i + 1) + " foi: " + horariosAcordados[i]);//

        }








    }
}
