package Interfejsy.OtherCar;

public class CarArrayHelper {

    public void clearVin(Car[] carsWithVin){
        for (int i = 0; i < carsWithVin.length; i++) {
            carsWithVin[i].setVin("empty");
            System.out.println("Modyfikuje teraz " + carsWithVin[i]);
        }
    }

}
