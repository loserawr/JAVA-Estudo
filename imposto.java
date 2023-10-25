package classes;

import java.util.Scanner;

public class Imposto {

    Scanner entrada = new Scanner(System.in);
    public double salr, ir, salr2, liquid, inss, sin, fgts, total;
    public int hora, valor;


    public double ir() {
        salr = hora * valor;

        if (salr < 900) {
            ir = 0;
        } else if (salr > 900 && salr <= 1500) {
            ir = 0.05;
        } else if (salr > 1500 && salr <= 2500) {
            ir = 0.1;
        } else {
            ir = 0.2;
        }
        salr2 = ir * salr;
        return salr2;

    }

    public void calculo() {
        ir();

        inss = salr * 0.1;
        fgts = salr * 0.11;
        sin = salr * 0.03;
        total = inss + salr2;
        liquid = salr - total;

    }


    }

