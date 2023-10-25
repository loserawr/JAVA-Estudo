package classes;

import java.util.Scanner;

public class Triangulo {

    Scanner entrada = new Scanner(System.in);
    public double lado1, lado2, lado3;
    public boolean trin;


    public boolean valid() {
        return  lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2;
    }



    }

