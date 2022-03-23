package Kolekcje.ArrayList;
import java.util.ArrayList;


public class ArrayListPOC {

    //XXX oznacza, ze metoda jest czesto wykorzystywana

    public static void main(String[] args) {

        //Problem: potrzebujemy struktury danych do przechowywania listy gosci na przyjecie
        //problem nie wiemy ilu bedzie gosci
        String[] goscie = new String[5];

        //utworzenie
        ArrayList<String> gosciee = new ArrayList<>();

        //dodawanie obiektow XXX
        gosciee.add("Rambo");
        gosciee.add("Terminator");
        gosciee.add("Predator");

        //wyswietlanie zawartosci
        System.out.println(gosciee);

        //sprawdzamy ile obiektow jest w liscie XXX
        int size = gosciee.size();
        System.out.println(size);

        //sprawdzenie czy lista jest pusta XXX
        System.out.println(gosciee.isEmpty());

        //dodaje wartosc na okreslonym indeksie, przesuwa dotychczasowe wartosci w prawo
        gosciee.add(1, "Batman");
        System.out.println(gosciee);

        //ustawiamy wartosc elementu o okreslonym indeksie, nadpisujemy aktualna wartosc
        gosciee.set(1, "superHero");
        System.out.println(gosciee);

        //XXX
        boolean isTerminatorPresent = gosciee.contains("Terminator");
        System.out.println(isTerminatorPresent);
        System.out.println(gosciee.indexOf("Terminator")); //pokazuje indeks na ktorym jest obiekt

        //gosciee.clear(); //czysci liste raczej nie uzywamy
        System.out.println(gosciee.get(2)); //pobieramy obiekt o okreslonym indeksie
        gosciee.remove("superHero"); //usuwa pierwsze wystapienie
        System.out.println(gosciee);
        gosciee.remove(0);
        System.out.println(gosciee);

    }
}