package Main.Java.br.com.secao10.exercicios_vetores.exercicio_alturas;

import Main.Java.br.com.secao10.exercicios_vetores.exercicio_alturas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTAS PESSOAS SERÃO DIGITADAS? ");

        int n = sc.nextInt();

        Pessoa [] vect = new Pessoa[n];

        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa");
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            vect[i] = new Pessoa(name, age, height);
        }

        double sum_height = 0;
        int sum_minor = 0;

        for (int i = 0; i < n; i++){
            sum_height += vect[i].getHeight();
        }

        double avg_height = sum_height / n;

        for (int i = 0; i < n; i++){
            if(vect[i].getAge() < 16){
                sum_minor += 1;
            }
        }

        double perc_miror = (100.0 / n) * sum_minor;

        System.out.printf("ALTURA MÉDIA: %.2f%n", avg_height);
        System.out.printf("PESSOAS COM MENOS DE 16 ANOS: %.1f", perc_miror);
        System.out.println("%");

        for (int i = 0; i < n; i++){
            if(vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
