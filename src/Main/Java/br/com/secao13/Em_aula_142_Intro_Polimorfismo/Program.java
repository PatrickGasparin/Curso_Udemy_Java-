package Main.Java.br.com.secao13.Em_aula_142_Intro_Polimorfismo;

import Main.Java.br.com.secao13.Em_aula_142_Intro_Polimorfismo.Entities.Account;
import Main.Java.br.com.secao13.Em_aula_142_Intro_Polimorfismo.Entities.BusinessAccount;
import Main.Java.br.com.secao13.Em_aula_142_Intro_Polimorfismo.Entities.SavingAccount;

public class Program {

    public static void main(String[] args){

        Account acc1 =  new Account(1001, "Alex", 1000.0);
        Account acc2 =  new SavingAccount(1002, "Anna", 1000.0, 0.01);
        Account acc3 =  new BusinessAccount(1003, "Bob", 1000.0, 500.0);

        acc1.withdraw(200.0);
        acc2.withdraw(200.0);
        acc3.withdraw(200.0);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        System.out.println(acc3.getBalance());
    }
}
