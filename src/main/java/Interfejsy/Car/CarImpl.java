package Interfejsy.Car;



public class CarImpl implements ICar {

    //slowo kluczowe implements inforumuje, ze klasa implementuje interfejs

    private String vin;
    private boolean isEngineOn;

    public CarImpl(String vin) {
        this.vin = vin;
    }

    public void turnOn() {
        isEngineOn = true;
    }

    public void turnOf() {
        isEngineOn = false;
    }

    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public String getVin() {
        return vin;
    }

    @Override
    public boolean isEngineOn() {
        return false;
    }
}
