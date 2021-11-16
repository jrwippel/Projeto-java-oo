package programas;

import entities.ContaTitular;

import java.util.Scanner;

public class CadastroCtaBanco {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ContaTitular contaTitular;

        System.out.print("Enter account number: ");
        int conta = sc.nextInt();
        System.out.print("Enter account holder:");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)?");
        char response = sc.next().charAt(0);


        if (response == 'y'){
            System.out.println("Enter initial deposit value:");
            double vlrdepinicial = sc.nextDouble();
            contaTitular = new ContaTitular(conta, titular, vlrdepinicial);
        }else{
            contaTitular = new ContaTitular(conta, titular);
        }

        System.out.println("Account data:");
        System.out.println(contaTitular);


        System.out.println("Enter a deposit value:");
        double vlrdeposito = sc.nextDouble();

        contaTitular.addDeposito(vlrdeposito);

        System.out.println("Updated account data:");
        System.out.println(contaTitular);

        System.out.println("Enter a withdraw value: ");
        vlrdeposito = sc.nextDouble();

        contaTitular.remDeposito(vlrdeposito);

        System.out.println("Updated account data:");
        System.out.println(contaTitular);

        sc.close();


    }
}
