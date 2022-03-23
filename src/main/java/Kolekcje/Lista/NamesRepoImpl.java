package Kolekcje.Lista;

import java.util.ArrayList;
import java.util.List;

public class NamesRepoImpl implements NamesRepository {

    public List<String> names = new ArrayList<>();
//    private List<String> names = new LinkedList<>();

    @Override
    public void addName(String name) {
        //moge tu np validowac
        //dodac ze kazdy dodany element jest dodatkowo wysylany do zapasowej bazy danych
        names.add(name);
    }

    @Override
    public void remove(String name) {
        names.remove(name);
    }

    @Override
    public String getNames() {
//        System.out.println(names);
        return names.toString();
    }

    @Override
    public List<String> getNamesList() {
        return names; //nie zwracamy referencji do listy, poniewaz dajemy mozliwosc niekontrolowanej zmiany
        //uzycia listy nie zgodnie z przeznaczeniem
//        return new ArrayList<>(names);
    }

}
