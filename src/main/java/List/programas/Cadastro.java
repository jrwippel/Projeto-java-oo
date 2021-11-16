package List.programas;

import List.entities.Employed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        List<Employed> list = new ArrayList<>();

        System.out.print("How many employees will be registered?");
        int n = sc.nextInt();

        for (int i=1;i<=n;++i){
            System.out.println();
            System.out.println("Employed #"+i+":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)){
                System.out.println("ID já existe, tente outro ID.");
                id = sc.nextInt();
            }
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();


            System.out.print("Salary:");
            double salary = sc.nextDouble();

            list.add(new Employed(id, name, salary));
        }
        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Employed emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null){
            System.out.print("Funcionário não existe");
        }else {
            System.out.print("Enter the percentage:");
            double percent = sc.nextDouble();
            emp.incrementSalary(percent);
        }

        System.out.println();
        System.out.println("List of employeds:");

        for (Employed obj : list) {
            System.out.println(obj);
        }
        sc.close();

    }
    public static boolean hasId(List<Employed> list, int id) {
        Employed emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }



}
