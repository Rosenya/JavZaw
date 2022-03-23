package Kolekcje.Lista;

import java.util.List;
import java.util.Scanner;

public class Menu {
    //Burza mozgow
    //1. Scanner  - danych wejsciowych
    //2. String z menu
    //3. switch case
    //4. petla while
    //5. obiekt na ktorym bedziemy wywolywali akcje w zaleznosci od wybranej opcji
    public void runMenu(NamesRepository repo) {

        Scanner scanner = new Scanner(System.in);

        String menu = "Menu:\n" +
                "1.dodaj dziecko\n" +
                "2.usun dziecko\n" +
                "3.wyswietl liste dzieci\n" +
                "4.exit";

        while (true) {
            System.out.println(menu);
            int number = Integer.valueOf(scanner.nextLine());

            switch (number) {
                case 1:
                    System.out.println("Wprowadz imie:");
                    repo.addName(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Wprowadz imie do usuniecia");
                    repo.remove(scanner.nextLine());
                    break;
                case 3:
//                    String names = repo.getNames();
                    List<String> namesList = repo.getNamesList();
                    namesList.add("psikus");
//                    namesList.clear(); gdybysmy zwrocili referencje do pola w klasie przechowujacego listy, ktos moglby ja wyczysic
                    //jesli zwrocimy kopie to oryginalna lista bedzie nadal przechowywala dane
                    System.out.println(namesList);
                    break;
                case 4:
                    System.out.println("exit");
//                    System.exit(0); wylaczenie programu
                    return; //wyjscie z metody
                default:
                    System.out.println("Wprowadzono niepoprawna wartosc");
            }
        }

    }


}
