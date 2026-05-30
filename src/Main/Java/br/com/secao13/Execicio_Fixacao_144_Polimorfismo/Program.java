package Main.Java.br.com.secao13.Execicio_Fixacao_144_Polimorfismo;

import Main.Java.br.com.secao13.Execicio_Fixacao_144_Polimorfismo.Entities.ImportedProduct;
import Main.Java.br.com.secao13.Execicio_Fixacao_144_Polimorfismo.Entities.Product;
import Main.Java.br.com.secao13.Execicio_Fixacao_144_Polimorfismo.Entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){

            System.out.println("Product #" + (i + 1) + " data:");

            System.out.print("Commin, used or imported (c/u/i)? ");
            char ch =  sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (ch == 'u'){
                System.out.print("Manufature date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                Product product = new UsedProduct(name, price, date);
                products.add(product);

            } else if ( ch == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);

            } else {

                Product product = new Product(name, price);

                products.add(product);
            }
        }

        System.out.println();
        System.out.println("ETIQUTAS DE PREÇO");
        for (Product p: products){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
