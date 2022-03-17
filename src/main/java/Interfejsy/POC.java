package Interfejsy;

public class POC {

    public static void main(String[] args) {

        CarImpl car = new CarImpl("tajny vin");
        System.out.println(car.getVin());
        System.out.println(car.isEngineOn());
        car.stop();

        //odwolujemy sie do typu referencyjnego typu interfejs ICar
        //mamy dostep tylko do metod zdefiniowanych w interfejsie

//        ICar ford = new CarImpl("vin ford");
        ICar ford = new FakeCar();
        System.out.println(ford.getVin());
        System.out.println(ford.isEngineOn());
//        ford.stop() nie jest dostepne, bo nie jest zadeklarowane w interfejsie
    }
}