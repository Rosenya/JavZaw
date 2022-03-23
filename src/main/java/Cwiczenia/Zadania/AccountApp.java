package Cwiczenia.Zadania;

public class AccountApp {
//    ZADANIE
//    Bedziemy rozwijac program Account.Account.java
//    public class Account {
//        private String name;
//        private int balance;
//    }
//
//    1. Ustaw domyslna wartosc 0 dla pola balance
//    2. Dodaj (wygeneruj) metody typu getter i setter dla pola name
//    3. Dodaj (wygeneruj) metode typu getter dla pola balance
//    4. Dodaj (prywatne) pole debit typu boolean okreslajace, czy stan konta jest ujemny; ustaw
//    domyslna wartosc na false
//
//    AccountApplication.java
//    public class AccountApplication {
//        public static void main(String[] args) {
//            Account account = new Account();
//            account.setName("Konto Premium");
//            System.out.println("Nazwa: " + account.getName());
//            System.out.println("Stan konta: " + account.getBalance());
//        }
//    }
//    Dodanie mozliwosci wplacania i wyplacania pieniedzy.Account.java
//
//    public void deposit(int amount) {
//    }
//    public void withdraw(int amount) {
//    }
//
//    1. Zaimplementuj powyzsze metody
//    2. Metoda withdraw ma ustawiac pole debit na true, gdy stan konta bedzie ujemny
//    3. Sprawdz ich dzialanieKolejne funkcjonalnosci.1. Dodaj walidacje parametru amount w metodzie deposit i withdraw;
//    - metody maja wykonywac logike, tylko gdy wartosc amount jest dodatnia
//    - w przeciwnym wypadku maja wyswietlac komunikat Kwota wplaty/wyplaty musi byc
//    dodatnia!
//    2. W metodzie withdraw dodaj wyswietlanie komunikatu Ujemny stan konta jesli pole debit ma
//    wartosc true
//    3. Do metod deposit i withdraw dodaj wyswietlanie podsumowania, np. (dla - odpowiednio -
//    deposit i withdraw)
//    Stan konta: 300 | Wplata: 250 | Po operacji: 550
//    Stan konta: 200 | Wyplata: 500 | Po operacji: -300
//    4. Dodaj obsluge maksymalnego debetu np. 1000. Jesli kwota po operacji mialaby byc nizsza, to nie
//    wykonuj wyplaty i wyswietl komunikat: Nie mozna wykonac operacji przekraczajacej debetZaimplementuj metode
//    transfer umozliwiajaca wykonanie przelewu z biezacego konta na inne.Account.java
//    public void transfer(Account other, int amount) {
//    }
//
//    1. Z biezacego konta nalezy wyplacic amount
//    2. Na konto other nalezy wplacic amountDodaj metode toString i wywoluj ja jak ponizej.Account.java
//    public String toString() {
//        return "Account{name: " + name + ", balance:" + balance + "}";
//    }
//    AccountApplication.java
//    public class AccountApplication {
//        public static void main(String[] args) {
//            Account account = new Account();
//            account.setName("Konto Premium");
//            System.out.println(account);
//        }
//    }
}
