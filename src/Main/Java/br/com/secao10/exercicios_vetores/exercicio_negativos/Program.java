package Main.Java.br.com.secao10.exercicios_vetores.exercicio_negativos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS NÚMEROS VOCÊ VAI DIGITAR? ");
        int n = sc.nextInt();

        while (n < 0 || n > 10){
            System.out.println("VOCÊ PRECISA DIGITAR UM NÚMEOR ENTRE 0 e 10");
            n = sc.nextInt();
        }

        int [] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("DIGITE UM NÚMERO: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        for (int i = 0; i < n; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
