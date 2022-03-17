package Interfejsy;

public interface ICar {

    //interfejs to kontrakt, ktory mowi jaie metody implementuje(dostarcza dzialajace metody) klasa,
    //ktora deklaruje implementacje interfejsu
    //metoda abstrakcyjna, deklaruje sygnature, nie dostarcza implementacji

    void drive();

    String getVin();

    boolean isEngineOn();
}
