public class ExceptionPoc {

    //wyjatek to jest obiekt, ktory usmierca biezacy watek
    //wyjatki sa rzucane w sytuacjach zdarzen wyjatkowych
    //mozemy ale nie musimy obslugiwac wyjatkow
    public static void main(String[] args) {

        String[] names = {"Jan", "Franek"};

        //bloka try nie moze byc blokiem samodzielnym
        //musi mu towarzyc catch albo finally
        try {
            names[3].isEmpty();
            System.out.println("Ten kod sie nie wywola");
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) { //w nawiasie podajemy jaki blad lub jakie bledy chcemy tu przechwycic
            //zeby zastosowac multicatch bledy nie moga byc bledami dziedziczacymi od siebie
            //w tym bloku mamy strategi obslugi bledu
            //przykladowe akcje: zalogowanie bledu w logach, wyswietlenie informacji na konsoli lub okienku popup dla uzytkownika
            //poproszenie o ponowne wprowadzenie, ponowienie proby np polaczenia za jakis czas np kilka sekund

            System.out.println("Wystapil blad:");
            ex.printStackTrace();
        } catch (Exception e) {
            System.out.println("Tutaj przechwytujemy bledy Exception i klas pochodnych");
        } finally { //ten blok wywola sie zawsze, bez wzgledu na to, czy przechwycimy jakis wyjatek, czy nie
            //przykladowo mozemy tutaj zamykac polaczenie do bazy danych
            System.out.println("Blok wykona sie zawsze");
        }
    }

}