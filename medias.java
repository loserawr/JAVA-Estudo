package classes;

import java.util.Scanner;

public class Medias {
    Scanner entrada = new Scanner(System.in);
    public double nota1, nota2, nota3, mediaa, pesototal;
    private final   int peso1 = 3;
    private final int peso2 = 2;
    private final int peso3 = 1;
    public int opcc;


        public double calcAritime(){
            mediaa = (nota1 + nota2) / 2;
            return mediaa;
        }

        public double calcPonde(){
          mediaa = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
          return mediaa;
        }

}
