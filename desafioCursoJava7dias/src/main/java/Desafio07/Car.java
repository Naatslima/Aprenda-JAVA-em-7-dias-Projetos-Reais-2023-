package Desafio07;

public class Car {

    private String marca;
    private String modelo; //parametros privados só podem ser acessados pelo metodo
    private int ano;
    private int valor;

    //constroctor
    Car(String marca, String modelo, int ano, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public int getValor() {
        return valor;
    }

    void juros() {
        int soma = valor * 10 / 100;
        int total = soma + valor;
        System.out.println("O valor do carro com juros é " + total);
    }

    //novo metodo para acessar e trocar a variavel
    /*public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }*/
}
