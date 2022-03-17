package Dziedziczenie;

public class Elephant extends Animal {

    @Override
    //adnotacja sprawdza, czy metoda, ktora nadpisujemy istnieje
    //jesli przestanie istniec kod nie bedzie sie kompilowal

    public void run() { //sygnatura metody
        System.out.println("method Elephant run"); //cialo metody
    }

        //klasa dziedzieczy z klasy abstrakcyjnej
        //jest to klasa nieabstrakcyjna, wiec musi implementowac metody abstrakcyjne z klasy
        //abstrakcyjnej z ktorej dziedziczy
        //implementowac, czyli dostaraczac cialo metody

}
