package Main.Java.br.com.secao10.exercicios_vetores.exercicio_aprovados;

import Main.Java.br.com.secao10.exercicios_vetores.exercicio_aprovados.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        Aluno [] vect = new Aluno[n];

        for (int i = 0; i < n; i++){
        System.out.println("Digite o nome, primeira e segunda nota do " + (i+1) +  "a aluno:");

        String nome = sc.next();
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        vect[i] = new Aluno (nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");
         for (int i = 0; i < n; i++){
             double media = (vect[i].getNota1() + vect[i].getNota2()) / 2;
             if (media >= 6){
                 System.out.println(vect[i].getNome());
             }
         }

         sc.close();
    }
}
