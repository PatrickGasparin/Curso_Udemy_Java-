package Main.Java.br.com.secao8.Em_aula_78_79_membros_estaticos.solucao2.util;

public class Calculator {

    public final double PI = 3.14159;

    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}
