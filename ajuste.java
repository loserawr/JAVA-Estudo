package classes;

import java.util.Scanner;

public class Csm {
    Scanner entrada = new Scanner(System.in);

    public double salario1, salario3;
    public double ajuste = 0;
    public double salario2 = 0;
    

    public double ajustando() {
        // Calcular o salario com o ajuste
        if (salario1 <= 280) {
            ajuste = 0.2;
        } else if (salario1 > 280 && salario1 <= 700) {
            ajuste = 0.15;
        } else if (salario1 > 700 && salario1 <= 1500) {
            ajuste = 0.1;
        } else {
            ajuste = 0.05;
        }

        salario3 = salario1;
        salario2 = salario1 * ajuste;
        salario1 += salario2;
        return salario1;
        
        

        }
    
        }

            


    




