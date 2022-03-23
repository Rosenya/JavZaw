package Interfejsy.Phone;


public class PhoneDemo {

    public static void main(String[] args) {

        IPhone phone1 = new Phone();
        phone1.dial(734934);
        IPhone phone2 = new SamsungPhone();
        phone2.dial(79889);

        SamsungPhone samsungPhone = new SamsungPhone();
        IPhone phone3 = samsungPhone;
        IPhone[] phones = {phone1, phone2, phone3};
    }
}
