package Interfejsy.Phone;

public class SamsungPhone implements IPhone {

    @Override
    public void dial(int number) {
        System.out.println("Samsung dzwoni na numer " + number);

    }

    public void ring(){
        System.out.println("ring ring ring....");
    }
}
