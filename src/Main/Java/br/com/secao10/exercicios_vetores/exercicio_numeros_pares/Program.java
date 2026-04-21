package Main.Java.br.com.secao10.exercicios_vetores.exercicio_numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS NÚMEROS VOCÊ VAI DIGITAR?");
        int n = sc.nextInt();

        int [] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("DIGITE UM NÚMERO: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NÚMEROS PARES:");

        int contador = 0;

        for (int i = 0; i < n; i++){
            double resto_da_divisão = vect[i] % 2;

            if (resto_da_divisão == 0){
                System.out.print(vect[i] + "   ");
                contador += 1;
            }
        }
        System.out.println();

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + contador);

        sc.close();

    }
}
