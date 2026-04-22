package Main.Java.br.com.secao10.exercicios_vetores.exercicio_media_pares;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS ELEMETNOS VAI TER O VETOR? ");
        int n = sc.nextInt();

        double [] vect = new double[n];

        int contador = 0;
        double somaDosPares = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
            double restoDaDivisao = vect[i] % 2;
             if (restoDaDivisao == 0){
                 contador +=1;
                 somaDosPares += vect[i];
             }
        }

        if (contador == 0){
            System.out.println("NENHUM NÚMERO PAR");
        }
        else {
            double media = somaDosPares / contador;
            System.out.println("MEDIA DOS PARES = " + media);
        }

        sc.close();

    }
}
