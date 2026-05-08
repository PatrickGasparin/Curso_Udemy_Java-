package Main.Java.br.com.secao12.Em_aula_127_Enum;

import Main.Java.br.com.secao12.Em_aula_127_Enum.Entities.Enums.OrderStatus;
import Main.Java.br.com.secao12.Em_aula_127_Enum.Entities.Order;

import java.util.Date;

public class Program {

    public static void main(String[] args){

        Order order = new Order(1080, new Date(), OrderStatus.PEDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.PROCESSING;
        //Isso pq normalmente o valor vai ser recebido em formato de String e o .valueOf converte a string para o valor do enum
        OrderStatus os2 = OrderStatus.valueOf("PROCESSING");
    }

}
