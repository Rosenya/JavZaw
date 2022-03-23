package ENUMY;

public class App {

    //Linki
    // http://devfoundry.pl/enum-ograniczenia-i-mozliwosci/
    // https://www.samouczekprogramisty.pl/typ-wyliczeniowy-w-jezyku-java/
    // https://devcave.pl/effective-java/enums
    // https://developeronthego.pl/java-typ-wyliczeniowy-enum/
    // https://programuj.pl/blog/typy-wyliczeniowe-enumy

    public static void main(String[] args) {

        Seasons spring = Seasons.SPRING;
        System.out.println(spring);
        Seasons summer = Seasons.SUMMER;
        Seasons winter = Seasons.WINTER;
        Seasons autumn = Seasons.AUTUMN;

        summer.comment();
        spring.comment();
        winter.comment();
        autumn.comment();


        System.out.println(summer + " " + summer.getDay());
        summer.setDay(30);
        System.out.println(summer.getDay());


//        boolean isEqual = spring.equals(spring);
//        System.out.println(isEqual);
//        boolean isEqual2 = spring == spring;
//        System.out.println(isEqual2);
//
//        Seasons[] seasons = Seasons.values();
//        for (int i = 0; i < seasons.length; i++) {
//            System.out.println(seasons[i]);
//        }

        switch (summer) {
            case SPRING:
                System.out.println("Jest wiosna");
                break;
            case SUMMER:
                System.out.println("jest lato");
                break;
            case AUTUMN:
                System.out.println("jest jesień");
                break;
            case WINTER:
                System.out.println("jest zima");
                break;
        }
    }
}

