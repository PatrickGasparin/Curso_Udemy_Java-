package Main.Java.br.com.secao10;

import java.util.Scanner;

public class Em_aula_110_Matrizes {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagona principal:");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + "  ");
        }

        int cont = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] < 0){
                    cont += 1;
                }
            }
        }

        System.out.println();
        System.out.println("Números negativos = " + cont);

        sc.close();
    }
}
