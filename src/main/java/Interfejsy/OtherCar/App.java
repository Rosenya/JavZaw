package Interfejsy.OtherCar;

public class App {

    public static void main(String[] args) {

        Car car = new Car("vin 94894834");
//        System.out.println(car.getVin());

        car = new Taxi("vinnnnnnnnnn", "taxiNumber 9879879");
        System.out.println(car.getVin()); //polimorfizm wywoluje sie metoda obiektu rzeczywiscie przekazanego

        System.out.println("**************************");
        Car[] cars = new Car[4];
        cars[0] = car;
        cars[1] = new Taxi("taxi vinnnn", "09584095");
        cars[2] = new LuxuryCar("luxury vin", 9);
        cars[3] = new LuxuryCar("random luxury vin", 8);

        CarArrayHelper carArrayHelper = new CarArrayHelper();
        carArrayHelper.clearVin(cars);

        car.setVin("psikus");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getVin());
        }

        //po lewej stronie jest referencja obiektu, po prawej stronie jest obiekt
        //jeden obiekt moze byc przypisany do wielu referencji
        //jesli zmienimy stan obiektu korzystajac z ktorejkolwiek referencji do obiektu jego stan sie zmieni
        //i zauwazymy to odwolujac sie do obiektu przez kazda z referencji
        Car car1 = new LuxuryCar("ijoidsfjo",9);
        Car car2 = car1;
        Car car3 = car2;
        Car car4 = car3;
        Car car5 = car1;

        System.out.println(car1.getVin());
        System.out.println(car5.getVin());

        car3.setVin("heheszki");
        System.out.println(car1.getVin());
        System.out.println(car5.getVin());


    }

}