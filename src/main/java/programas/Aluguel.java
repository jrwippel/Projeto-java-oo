package programas;

import entities.Locatario;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Aluguel {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented?");
        int n = sc.nextInt();
        Locatario[] vect = new Locatario[10];

        for (int i=1;i <= n;++i){
            sc.nextLine();
            System.out.println("Rent #"+ i +":");
            System.out.println("Name: ");
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room:");
            int room = sc.nextInt();
            vect[room] = new Locatario(nome, email);
        }

        System.out.println("Busy rooms:");
        System.out.println();
        for (int i=0;i < 10 ;++i){
            if (vect[i] != null){
                System.out.println(i+":"+ vect[i]);
            }
        }
        sc.close();
    }
}
