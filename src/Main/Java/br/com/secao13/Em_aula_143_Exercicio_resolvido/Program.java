package Main.Java.br.com.secao13.Em_aula_143_Exercicio_resolvido;

import Main.Java.br.com.secao13.Em_aula_143_Exercicio_resolvido.Entities.Employee;
import Main.Java.br.com.secao13.Em_aula_143_Exercicio_resolvido.Entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){

            System.out.println("Employee " + (i + 1) + "# data:");

            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hours: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y'){
                System.out.print("Adicional charge: ");
                double adcionalCharge = sc.nextDouble();
                Employee emp = new OutsourceEmployee(name, hours, valuePerHour,adcionalCharge);
                employees.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                employees.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp: employees){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
