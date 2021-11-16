package programas;

import entities.Imc;

import java.util.Scanner;

public class CalculoImc {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Imc imc = new Imc();
        System.out.println("Informe o Peso: ");
        imc.peso = sc.nextDouble();
        System.out.println("Informe o Altura: ");
        imc.altura = sc.nextDouble();
        System.out.println("Masculino(M) ou Feminino(F): ");
        imc.genero = sc.nextLine();

        System.out.println(imc.classificao());
        sc.close();

    }
}
