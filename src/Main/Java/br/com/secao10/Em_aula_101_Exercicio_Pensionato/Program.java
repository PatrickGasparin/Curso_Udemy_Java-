package Main.Java.br.com.secao10.Em_aula_101_Exercicio_Pensionato;

import Main.Java.br.com.secao10.Em_aula_101_Exercicio_Pensionato.entities.Quarto;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Quarto [] vect_quartos = new Quarto[9];

        System.out.print("Quantos alunos voce vai digitar? ");
        int n = sc.nextInt();

        int [] alunos = new int[n];

        for (int i = 0; i < n; i++){

            System.out.println();
            System.out.println("Locador: " + (i+1));

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            vect_quartos[quarto] = new Quarto(nome,email,quarto);
        }

        System.out.println();
        System.out.println("Quartos alugados: ");

        for (int i = 0; i < vect_quartos.length; i++){
            if (vect_quartos[i] != null){
                System.out.println(
                        vect_quartos[i].getQuarto()
                        + ": "
                        + vect_quartos[i].getNome()
                        + ", "
                        + vect_quartos[i].getEmail()
                );
            }
        }
    }
}
