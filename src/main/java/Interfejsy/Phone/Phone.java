package Interfejsy.Phone;

public class Phone implements IPhone{

    @Override
    public void dial(int number) {
        System.out.println("dialling " + number);
    }

    public void lock(){
        System.out.println("lock IPhone");
    }

}
