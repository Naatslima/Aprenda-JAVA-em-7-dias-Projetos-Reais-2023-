package Desafio08;

public class Clients {

    String firstName;
    int age;
    int balance;

    //o metodo pode ter o mesmo nome da classe.
    Clients() {
            balance = 10;
        }
        //void metodo de execussao
        void newAccount() {
            System.out.println(firstName + " Conta Criada!!");
            System.out.println("O novo saldo da conta é de R$" + balance);
    }
}

