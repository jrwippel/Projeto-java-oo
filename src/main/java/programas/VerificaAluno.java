package programas;

import entities.Aluno;

import java.util.Scanner;

public class VerificaAluno {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Nome ALuno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Informe as Notas:");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println("FINAL GRADE: "+aluno.calculamedia());
        System.out.println(aluno.verificamedia());
        if (aluno.verificamedia() == "FAILED"){
            System.out.println("MISSING:"+aluno.pontosfaltam()+" POINTS");
        }


        sc.close();
    }
}
