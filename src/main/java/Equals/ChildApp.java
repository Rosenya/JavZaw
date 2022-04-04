package Equals;

public class ChildApp {

    public static void main(String[] args) {

        Child rambo = new Child("Rambo", 11);
        Child randomRambo = new Child("Rambo", 11);

        boolean isEquals = rambo.equals(randomRambo);
        System.out.println(isEquals);
    }

}