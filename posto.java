package classes;

import java.util.Scanner;

public class Posto {
    Scanner entrada = new Scanner(System.in);
    public double gasolina, alcool, desconto, quantidade, valor;
    public String respota;


    public void calculoGA() {
        if (respota.equals("G")) {
            valor = 5.90 * quantidade;
            if (quantidade <= 20) {
                desconto = 0.04 * valor;
            } else {
                desconto = 0.06 * valor;
            }
            valor = valor - desconto;

        }
        if (respota.equals("A")) {
            valor = 3.80 * quantidade;
            if (quantidade <= 20) {
                desconto = 0.03 * valor;
            } else {
                desconto = 0.05 * valor;
            }
            valor = valor - desconto;

        }
    }
}
