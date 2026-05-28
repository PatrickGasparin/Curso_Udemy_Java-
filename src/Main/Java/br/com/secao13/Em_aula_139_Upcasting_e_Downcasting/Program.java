package Main.Java.br.com.secao13.Em_aula_139_Upcasting_e_Downcasting;


import Main.Java.br.com.secao13.Em_aula_139_Upcasting_e_Downcasting.Entities.Account;
import Main.Java.br.com.secao13.Em_aula_139_Upcasting_e_Downcasting.Entities.BusinessAccount;
import Main.Java.br.com.secao13.Em_aula_139_Upcasting_e_Downcasting.Entities.SavingAccount;

public class Program {

    public static void main(){

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        // O compilador aceita, mas vai dar o erro quando rodar o programa

        // para testar se ele percence a mesma subclasse use: instanceof
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }
}
