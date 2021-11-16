package programas;

import entities.Retangulo;

import java.util.Scanner;

public class CalculoRetangulo {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.print("Informe a altura: ");
        retangulo.altura = sc.nextDouble();
        System.out.print("Informe a Largura: ");
        retangulo.largura = sc.nextDouble();
        System.out.println(retangulo);
        sc.close();
    }
}
