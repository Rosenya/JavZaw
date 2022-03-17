package Dziedziczenie;

public class CarApp {

    public static void main(String[] args) {

        Truck truck = new Truck("fake vin", 1000);

        //metoda getVin() jest dziedziczona z klasy Car

        truck.getVin();
        truck.getModel();
        Taxi taxi = new Taxi();
        taxi.getVin();
//        Car car = new Car(); nie mozemy utworzyc obiektu klasy Car, poniewaz jest to klasa abstrakcyjna

    }

}

