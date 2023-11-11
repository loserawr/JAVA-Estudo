package atvpoo;
public class Vendendor extends Funcionario {
    private int quantid;
    public double totalVendas;

    public int getQuantid() {
        return quantid;
    }

    public void setQuantid(int quantid) {
        this.quantid = quantid;
    }

    public void informar_venda(double valorVenda){
        totalVendas += valorVenda;
 
    }
    public void imprimirSalarioTotal() {
        double bonus = 0.05 * totalVendas;

        double salarioTotal = getSalario() + bonus;
       
        System.out.println("#########################");
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRg());
        System.out.println("Salário Base: " + getSalario());
        System.out.println("Total de Vendas: " + totalVendas);
        System.out.println("Comissão (5%): " + bonus);
        System.out.println("Salário Total: " + salarioTotal);
        System.out.println("#########################");

    }
}
