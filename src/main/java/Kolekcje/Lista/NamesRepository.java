package Kolekcje.Lista;

import java.util.List;

public interface NamesRepository {

    //chcemy, zeby odpowiedzialnosci klasy implementujacej interfejs
    //bylo zarzadzanie lista imion, a nie drukowanie itp
    void addName(String name);

    void remove(String name);

    String getNames();

    List<String> getNamesList();

}
