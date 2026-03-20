package Main.Java.br.com.secao8.exercicio_final.exercicio_membros_estaticos.util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + IOF);
    }

}
