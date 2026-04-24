package Main.Java.br.com.secao10;

public class Em_aula_104_For_Each {

    public static void main(String[] args) {

        String[] vect = new String[]{"Maria", "Pedro", "João"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("----------------------------------");

        for (String obj : vect){
            System.out.println(obj);
        }
    }
}
