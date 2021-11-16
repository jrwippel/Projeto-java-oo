package programas;

import entities.Funcionario;

import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Nome do Funcionario: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Salario: ");
        funcionario.salario = sc.nextDouble();
        System.out.println("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println("Funcionario: "+funcionario);

        System.out.print("Informe o percetual de incremento do salario: ");
        double percentual = sc.nextDouble();

        funcionario.IncrementaSalario(percentual);

        System.out.println("Registro alterado: "+funcionario);

        sc.close();
    }

}
