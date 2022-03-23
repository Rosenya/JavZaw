package Interfejsy.OtherCar;

public class Car {

    private String vin;

    public Car(String vin) {
        this.vin = vin;
    }

    //    public final String getVin() { dodanie final uniemozliwia nadpisanie metody
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }


    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                '}';
    }
}
