package atvpoo;
import java.util.Scanner;
 
public class Lojamain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Funcionario F = new Funcionario();
        Gerente G = new Gerente();
        Vendendor V = new Vendendor();

        int opc = 0;
        

        if (opc != 3){
            System.out.println("Você é um Vendendor ou Gerente? ");
            System.out.println("1 - Vendendor");
            System.out.println("2 - Gerente");
            System.out.println("3 - Sair");
            opc = entrada.nextInt();
            entrada.nextLine();

            if (opc == 1){
                    
                    System.out.println("Qual o seu nome? ");
                    V.setNome(entrada.nextLine());
                    
                    System.out.println("Qual o seu RG? ");
                    V.setRg(entrada.nextInt());
                    
                    System.out.println("Qual o seu salario base? ");
                    V.setSalario(entrada.nextDouble());
                
                    int opcvend = 0;
                    while (opcvend != 2) {
                        System.out.println("Registre o valor das suas vendas esse mês: ");
                        System.out.println("1 - Registrar Venda");
                        System.out.println("2 - Voltar");
                        opcvend = entrada.nextInt();
                        entrada.nextLine();

                        if (opcvend == 1) {
                            System.out.println("Digite o valor da venda: ");
                            double valorVenda = entrada.nextDouble();
                            V.informar_venda(valorVenda);
                            
                            }
                    }
                    V.imprimirSalarioTotal(); 
                    System.out.println();
                    System.out.println("Obrigado por utilizar o progama :)");
                         
                }
                
                if (opc == 2) {
                    System.out.println("Qual o seu nome? ");
                    G.setNome(entrada.nextLine());

                    System.out.println("Qual o seu RG? ");
                    G.setRg(entrada.nextInt());

                    System.out.println("Qual o seu salario fixo? ");
                    G.setSalario(entrada.nextDouble());

                    System.out.println("Quantas horas extras você acumulou? ");
                    G.setHoras(entrada.nextInt());

                    G.salariofinal();
                    System.out.println();
                    System.out.println("Obrigado por utilizar o progama :)");

                }
                
                if (opc == 3){
                    System.out.println("Obrigado pelo uso do progama :)");
                
                }
                else{
                    System.out.println("Resposta invalida, tente outra vez.");
                }
            }
            entrada.close();
        }
    }

    

