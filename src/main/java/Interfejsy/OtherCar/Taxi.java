package Interfejsy.OtherCar;

public class Taxi extends Car {

    private String taxiNumber;
    private String taxiVin = "TAXI VIN";

    public Taxi(String vin, String taxiNumber) {
        super(vin);
        this.taxiNumber = taxiNumber;
    }

    public String getTaxiNumber() {
        return taxiNumber;
    }

    @Override
    public String getVin() {
        return  taxiVin + super.getVin();
    }

    @Override
    public void setVin(String vin) {
        super.setVin(vin);
        this.taxiVin = vin;
    }

}
