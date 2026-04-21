package Main.Java.br.com.secao10.exercicios_vetores.exercicio_abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS ELEMENTOS VAI TER O VETOR? ");
        int n  = sc.nextInt();

        double [] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double somaValorsVetor = 0;
        for (int i = 0; i < n; i++){
            somaValorsVetor += vect[i];
        }

        double media = somaValorsVetor / n;

        System.out.println();
        System.out.printf("MÉDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA");
        for (int i = 0; i < n; i++){
            if (vect[i] < media){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }

}
