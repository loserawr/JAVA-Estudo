import java.util.Scanner;

import javax.swing.JOptionPane;

import classes.Csm;
import classes.Imposto;
import classes.Medias;
import classes.Posto;
import classes.Triangulo;

public class Sistema {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc = 0;

        Posto posto = new Posto();
        Csm po = new Csm();
        Imposto aqui = new Imposto();
        Triangulo tri = new Triangulo();
        Medias media = new Medias();

        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Qual progama você deseja usar?\n"
                    + "(1) - Salario CSM\n"
                    + "(2) - Folha de pagamento\n"
                    + "(3) - Validação e tipo de triangulo\n"
                    + "(4) - Posto\n"
                    + "(5) - Medias\n"
                    + "(6) - Nenhum"));

            switch (opc) {

                case 1:
                    po.salario1 = Double.parseDouble(
                            JOptionPane.showInputDialog("Bem vindo Colaborador, Qual o seu salario para reajuste?"));
                    po.ajustando();
                    JOptionPane.showMessageDialog(null, "Seu salario anterior era de: " + po.salario3 + "\n"
                            + "Seu percentual de ajuste foi de: " + (po.ajuste * 100) + "%\n"
                            + "O Valor do seu aumento foi de: " + po.salario2 + "\n"
                            + "Seu salario reajustado é de: " + po.salario1 + ", Obrigado pelos seus serviços :)");

                    break;

                case 2:
                    aqui.valor = Integer
                            .parseInt(JOptionPane.showInputDialog("Bem vindo trabalhador, qual o valor da sua hora? "));
                    aqui.hora = Integer.parseInt(
                            JOptionPane.showInputDialog("E qual foi a sua quantidade de horas trabalhadas no mês?"));
                    aqui.ir();
                    aqui.calculo();
                    JOptionPane.showMessageDialog(null,
                            "###################### FOLHA DE PAGAMENTO ######################\n"
                                    + "Seu salario bruto foi de:                                    R$" + aqui.salr
                                    + "\n"
                                    + "O valor descontado do IR(" + (aqui.ir * 100) + "%) foi de:          R$"
                                    + aqui.salr2 + "\n"
                                    + "O valor descontado do INSS(10%) foi de:      R$" + aqui.inss + "\n"
                                    + "O valor do FGTS(11%) foi de:           :                 R$" + aqui.fgts + "\n"
                                    + "O valor total que foi descontado foi de:         R$" + aqui.total + "\n"
                                    + "O seu salario liquido é:                                      R$" + aqui.liquid);

                    break;

                case 3:
                    tri.lado1 = Double
                            .parseDouble(JOptionPane.showInputDialog("Qual tamanho do lado AB do seu triangulo?"));
                    tri.lado2 = Double
                            .parseDouble(JOptionPane.showInputDialog("Qual tamanho do lado BC do seu triangulo?"));
                    tri.lado3 = Double
                            .parseDouble(JOptionPane.showInputDialog("Qual tamanho do lado CA do seu triangulo?"));
                    tri.valid();
                    tri.trin = tri.valid();

                    if (tri.trin) {
                        JOptionPane.showMessageDialog(null, "Seu triangulo é um triangulo valido!");
                        if (tri.lado1 == tri.lado2 && tri.lado1 == tri.lado3) {
                            JOptionPane.showMessageDialog(null, "E seu triangulo é um Triangulo Equilátero!");

                        } else if (tri.lado1 == tri.lado2 || tri.lado2 == tri.lado3 || tri.lado3 == tri.lado1) {
                            JOptionPane.showMessageDialog(null, "E seu triangulo é um Triangulo Isósceles!");

                        } else {
                            JOptionPane.showMessageDialog(null, "E seu triangulo é um Triangulo Escaleno");

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Seu triangulo é invalido :(");
                    }
                    break;

                case 4:
                    posto.respota = JOptionPane.showInputDialog(
                            "########## TABELA DE PREÇOS ##########\n"
                                    + "Litro da Gasolina: R$ 5.90\n"
                                    + "LItro do Alcool:   R$ 3.80\n"
                                    + "Promoções: Até 20L de Gasolina, 4%OFF por L / 20L ou mais, 6%OFF por L\n"
                                    + "Promoções: Até 20L de Alcool, 3%OFF por L / 20L ou mais, 5%OFF por L\n"
                                    + "Promoções: Até 20L de Alcool, 3%OFF por L / 20L ou mais, 5%OFF por L\n"
                                    + "#######################################\n"
                                    + "Bem vindo ao Posto Ipiranga, deseja abastacer com Alcool - (A) ou Gasolina - (G)");

                    posto.quantidade = Double
                            .parseDouble(JOptionPane.showInputDialog("E quantos litros deseja abastacer? "));

                    posto.calculoGA();
                    JOptionPane.showMessageDialog(null, "O valor do abastecimento de " + posto.quantidade
                            + " Litros de gasolina, ficou por: " + posto.valor);
                    break;

                case 5:
                    media.opcc = Integer.parseInt(JOptionPane.showInputDialog(
                            "######### Menu de opções de medias #########\n"
                                    + "1 - Media aritimetica\n"
                                    + "2 - Media ponderada\n"));

                    if (media.opcc == 1) {
                        media.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a sua primeira nota?"));
                        media.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a sua segunda nota?"));
                        media.calcAritime();
                        JOptionPane.showMessageDialog(null, "Sua media ficou igual a: " + media.mediaa);

                    } else if (media.opcc == 2) {
                        media.nota1 = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual foi a sua primeira nota?(Peso 3)"));
                        media.nota2 = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual foi a sua primeira nota?(Peso 2)"));
                        media.nota3 = Double
                                .parseDouble(JOptionPane.showInputDialog("Qual foi a sua primeira nota?(Peso 1)"));
                        media.calcPonde();
                        JOptionPane.showMessageDialog(null, "Sua media ficou igual a: " + media.mediaa);
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção invalida!");
                    }

                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Obrigado pelo uso do sistema :)");

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "ERROR! OPÇÃO INVALIDA!");
            }

        }

        entrada.close();
    }

}
