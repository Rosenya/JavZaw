package Dziedziczenie;

//obiektowosc/dziedziczenie

public class Truck extends Car{

        //extend slowo kluczowe, ktore definiuje dziedziczenie
        //static final private super abstract - przyklady slow kluczowych
        //nie mozemy uzywac do nazywania zmiennych

    private int capacity;

    public Truck() {

        System.out.println("Konstruktor domyslny TruckOOP");

    }

    public Truck(String vin, int capacity) {

        super();
        //jest to odwolanie do konstruktora klasy bazowej
        //argumenty w nawiasie decyduja o tym, ktory konstruktor zostanie wywolany
        //jesli nie ma slowa super nie jawnie bedzie tam super();
        this.capacity = capacity;

        System.out.println("Konstruktor parametrowy TruckOOP");

    }

}
