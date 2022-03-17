package Interfejsy;

public class FakeCar implements ICar {

    @Override
    public void drive() {
        System.out.println("fake drive");
    }

    @Override
    public String getVin() {
        return "fake vin";
    }

    @Override
    public boolean isEngineOn() {
        return false;
    }
}