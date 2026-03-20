package Main.Java.br.com.secao8.Em_aula_78_79_membros_estaticos.solucao3.util;

public class Calculator {

    public static final double PI = 3.14159;

    public static  double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}
