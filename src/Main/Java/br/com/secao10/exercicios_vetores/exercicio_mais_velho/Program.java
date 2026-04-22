package Main.Java.br.com.secao10.exercicios_vetores.exercicio_mais_velho;

import Main.Java.br.com.secao10.exercicios_vetores.exercicio_mais_velho.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoa voce vai digitar? ");
        int n = sc.nextInt();

        Pessoa [] vect = new Pessoa[n];

        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa");
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            vect[i] = new Pessoa(nome, idade);
        }

        int maiorIdade = vect[0].getIdade();
        int indexPessoaMaisVelha = 0;

        for (int i = 1; i < n; i++){
            if (vect[i].getIdade() > maiorIdade ){
                maiorIdade = vect[i].getIdade();
                indexPessoaMaisVelha = i;
            }
        }

        System.out.println("Pessoa Mais velha: " + vect[indexPessoaMaisVelha].getNome());

        sc.close();
    }
}
