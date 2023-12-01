package Desafio08;

public class Main {
    public static void main(String[] args) {
        Clients c001 = new Clients();
        c001.firstName = "Carlos";
        c001.age = 24;

        Clients c002 = new Clients();
        c002.firstName = "Mariana";
        c002.age = 38;

        c002.newAccount();

    }
}
