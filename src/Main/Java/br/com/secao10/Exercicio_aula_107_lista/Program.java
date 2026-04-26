package Main.Java.br.com.secao10.Exercicio_aula_107_lista;

import Main.Java.br.com.secao10.Exercicio_aula_107_lista.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários voce vai digitar? ");
        int n = sc.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Funcionário #" + (i+1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));

        }

        System.out.println("Digite o ID do funcionário para aumentar o salário: ");
        int y = sc.nextInt();

        Funcionario funcionarioResultado = funcionarios.stream().filter(x -> x.getId() == y).findFirst().orElse(null);
        int indexFuncionatio = funcionarios.indexOf(funcionarioResultado);

        if (funcionarioResultado == null){
            System.out.println("Esse funcionário não existe! ");
        } else {
            System.out.print("Digite a porcentagem de aumento: ");
            double porcentagem = sc.nextDouble();
            funcionarioResultado.aumentaSalario(porcentagem);
        }

        System.out.println("Lista de funcionários: ");
        for (Funcionario x: funcionarios){
            System.out.println(x);
        }

        sc.close();
    }
}
