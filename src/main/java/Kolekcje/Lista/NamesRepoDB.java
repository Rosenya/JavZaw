package Kolekcje.Lista;

import java.util.List;

public class NamesRepoDB implements NamesRepository {
    @Override
    public void addName(String name) {
        //nawiazuje polaczenie do bazy danych i tam dodaje imie
    }

    @Override
    public void remove(String name) {
//nawiazanie polaczenia do bazy danych i usuniecie imienia
    }

    @Override
    public String getNames() {
//wyswietlenie tabeli zawartosci imion
        return "";
    }

    @Override
    public List<String> getNamesList() {
        return null;
    }
}
