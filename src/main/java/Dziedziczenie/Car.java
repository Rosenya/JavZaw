package Dziedziczenie;



public abstract class Car {

    //pole klasy z prywatnym modyfikatorem dostepu

    private String vin;

    //konstruktor domyślny, "jeśli go nie utworzymy
    //to java zrobi to za nas" pod warunkiem, że nie ma innego
    //ma zastosowanie tylko jesli nie ma zadnego konstruktora

    public Car() {

        System.out.println("Konstruktor domyslny Car");

    }

    public Car(String vin) {

        this.vin = vin;

        System.out.println("Konstruktor parametrowy Car vin:" + vin);

    }

    public String getVin() { //ta linijka to sygnatura metody

        return vin;// to jest cialo metody

    }

    public String getModel() {

        return "ford";

    }

}


