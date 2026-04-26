package Main.Java.br.com.secao10;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Em_aula_106_Lista {

    public static void main(String[] args){

        List<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Pedro");
        lista.add("Marcela");
        lista.add("Patrick");
        lista.add("Leticia");
        lista.add("Lucas");
        lista.add("Mario");
        lista.add("Mateus");
        lista.add("Anna");
        lista.add("Joaquim");
        lista.add("Júnior");
        lista.add("Jean");
        lista.add("Jussara");


        //adicionar em posição específica da lista
        lista.add(2, "Paula");

        for (String x: lista){
            System.out.println(x);
        }

        lista.remove("Anna");
        //remover por index da lista
        lista.remove(1);

        System.out.println();
        System.out.println("------------------");

        for (String x: lista){
            System.out.println(x);
        }

        //Função lambda que remove todos os que tem M no charAt(possição na string) 0
        lista.removeIf(x -> x.charAt(0) == 'M');

        System.out.println();
        System.out.println("------------------");

        for (String x: lista){
            System.out.println(x);
        }

        System.out.println();
        System.out.println("------------------");
        //para saber o index da palavra específica
        System.out.println("Index de Joaguim: " + lista.indexOf("Joaquim"));

        System.out.println();
        System.out.println("------------------");
        //Quando não encontrar o elemente, retornara -1
        System.out.println("Index de Angelo(que não tem na lista): " + lista.indexOf("Angelo"));

        System.out.println();
        System.out.println("------------------");

        // filtrando lista pela letra J, onde o resultado sera depositado em uma nova lista
        //Detalhe: .stream não é compativel com lista, será necessário covertelo novamente para lista com  a função .collect
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());

        System.out.println("Nova lista cricada para o filtro J: ");
        for (String x: resultado){
            System.out.println(x);
        }

        System.out.println();
        System.out.println("------------------");

        //encontrando primeiro elemento(.findFirst) com o filtro específico, caso contrário retorna null
        String nome = lista.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
        System.out.println(nome);

    }
}
