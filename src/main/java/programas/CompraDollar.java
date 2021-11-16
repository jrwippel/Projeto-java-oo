package programas;

import entities.CurrencyConverter;

import java.util.Scanner;

public class CompraDollar {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollar = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double qtdedollar = sc.nextDouble();

        double paidreais = CurrencyConverter.conversaodollar(dollar, qtdedollar);

        System.out.printf("Amount to be paid in reais = "+"%.2f%n", paidreais );

        sc.close();

    }
}
