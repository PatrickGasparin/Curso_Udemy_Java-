package Main.Java.br.com.secao13.Em_aula_138_Heranca.Entities;

public class BusinessAccount extends Account{

    private Double loadLimit;

    public BusinessAccount (){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loadLimit) {
        super(number, holder, balance);
        this.loadLimit = loadLimit;
    }

    public Double getLoadLimit() {
        return loadLimit;
    }

    public void setLoadLimit(Double loadLimit) {
        this.loadLimit = loadLimit;
    }

    public void loan(double amount){
        if (amount <= loadLimit){
            balance += amount - 10.0;
        }
    }
}
