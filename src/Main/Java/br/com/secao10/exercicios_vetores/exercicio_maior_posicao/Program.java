package Main.Java.br.com.secao10.exercicios_vetores.exercicio_maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS NÚMEROS VOCE VAI DIGITAR? ");
        int n = sc.nextInt();

        double [] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double maiorValor = vect[0];
        int posicaoDoMaiorValor = 0;

        for (int i = 1; i < n; i++){
            if (maiorValor < vect[i]){
                maiorValor = vect[i];
                posicaoDoMaiorValor = i;
            }
        }

        System.out.println();
        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoDoMaiorValor);

        sc.close();
    }
}
