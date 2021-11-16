package entities;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;

    public String toString(){
        return nome
                +", $ "
                + String.format("%.2f%n", salarioliquido());
    }
    public double salarioliquido(){
        return salario - imposto;
    }

    public void IncrementaSalario(double percentual){
        salario = (salario + (salario * percentual) / 100);
    }
}
