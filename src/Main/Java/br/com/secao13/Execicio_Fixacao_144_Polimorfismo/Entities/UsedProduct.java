package Main.Java.br.com.secao13.Execicio_Fixacao_144_Polimorfismo.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product{

    private LocalDate manufactureDate;

    public UsedProduct(){

    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + getPrice() + " (Manufature date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")" ;
    }
}
