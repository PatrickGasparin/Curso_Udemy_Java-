package Main.Java.br.com.secao10.exercicios_vetores.exercicio_soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS NÚMEROS VOCÊ VAI DIGITAR? ");
        int n = sc.nextInt();

        double [] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("DIGITE UM NÚMERO: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES =");

        for (int i = 0; i < n; i++){
            System.out.print(" " + vect[i]);
        }

        double sum = 0;
        for (int i = 0; i < n; i++){
            sum += vect[i];
        }

        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);

        double avg = sum / n;


        System.out.printf("MÁDIA = %.2f%n", avg);


        sc.close();
    }
}
