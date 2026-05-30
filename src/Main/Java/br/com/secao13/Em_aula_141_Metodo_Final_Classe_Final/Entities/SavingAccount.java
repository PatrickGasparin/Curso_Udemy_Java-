package Main.Java.br.com.secao13.Em_aula_141_Metodo_Final_Classe_Final.Entities;

public final class SavingAccount extends Account {

    private Double interestRate;

    public SavingAccount(){
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public final void withdraw(double amount){
        balance -=  amount;
    }
}
