package atvpoo;
public class Gerente extends Funcionario{
    private int horas;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public double horas_extras(){
        return getHoras() * (getSalario() / 100);
    }
    public void salariofinal(){
        double salariototal = getSalario() + horas_extras();
        
        
        System.out.println("#########################");
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRg());
        System.out.println("Salário Fixo: " + getSalario());
        System.out.println("Quantidade de horas extras: "+ getHoras());
        System.out.println("Salário Total: " + salariototal);
        System.out.println("#########################");
    }
}
