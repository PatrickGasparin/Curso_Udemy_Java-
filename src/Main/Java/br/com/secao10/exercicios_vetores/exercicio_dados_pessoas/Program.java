package Main.Java.br.com.secao10.exercicios_vetores.exercicio_dados_pessoas;

import Main.Java.br.com.secao10.exercicios_vetores.exercicio_dados_pessoas.entities.Pessoa;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa [] vect =  new Pessoa[n];
        int contadorHomens = 0;
        int contadorMulheres = 0;
        double somaAlturaMulheres = 0;

        for (int i = 0; i < n; i++){
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            double altura = sc.nextDouble();

            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            char genero = sc.next().charAt(0);

            if (genero == 'M'){
                contadorHomens += 1;
            } else {
                contadorMulheres += 1;
                somaAlturaMulheres += altura;
            }

            vect[i] = new Pessoa(altura, genero);
        }

        double menorAltura = vect[0].getAltura();
        double maiorAltura = vect[0].getAltura();
        double mediaAlturaMulhers = somaAlturaMulheres / contadorMulheres;

        for (int i = 0; i < n; i++){
            if (vect[i].getAltura() > maiorAltura){
                maiorAltura = vect[i].getAltura();
            } else if (vect[i].getAltura() < menorAltura) {
                menorAltura = vect[i].getAltura();
            }

        }

        System.out.println("Menor Altura = " + menorAltura );
        System.out.println("Maior Altura = " + maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaMulhers);
        System.out.println("Número de hoomens = " + contadorHomens);

        sc.close();

    }
}
