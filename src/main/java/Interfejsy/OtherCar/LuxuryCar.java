package Interfejsy.OtherCar;

public class LuxuryCar extends Car {

    private int luxuryLevel;

    public LuxuryCar(String vin, int luxuryLevel) {
        super(vin);
        this.luxuryLevel = luxuryLevel;
    }

}
