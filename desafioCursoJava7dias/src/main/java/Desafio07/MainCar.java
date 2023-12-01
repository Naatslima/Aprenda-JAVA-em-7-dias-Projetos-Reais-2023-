package Desafio07;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X6", 2024, 125000);

        /*car.setMarca("Ferrari");
        car.setModelo("X5"); //faz alteração
        car.setAno(2023);*/

        System.out.println(car.getMarca()); //get puxa a informação
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println(car.getValor());

        car.juros();


    }
}
