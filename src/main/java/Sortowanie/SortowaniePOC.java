import java.util.ArrayList;
import java.util.Collections;

public class SortowaniePOC {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Zygmunt");
        names.add("Blazej");
        names.add("Ula");
        names.add("Adan");
        System.out.println(names);

//        names.sort(); jest metoda sortujaca, ale wymaga comparatora
        Collections.sort(names); //tutaj sortujemy, to jest metoda statyczna!
        System.out.println(names);

        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(111);
        liczby.add(9999999);
        liczby.add(333);
        liczby.add(222);
        System.out.println(liczby);
        Collections.sort(liczby); //tutaj sortujemy
        System.out.println(liczby);

        ArrayList<String> cyfry = new ArrayList<>(); //uwaga sortuje po pierwszym znaku
        cyfry.add("1");
        cyfry.add("4");
        cyfry.add("999");
        cyfry.add("44");
        cyfry.add("0");
        cyfry.add("5555");
        cyfry.add("77");
        cyfry.add("333");
        System.out.println(cyfry);
        Collections.sort(cyfry); //tutaj sortujemy
        System.out.println(cyfry);
    }

}
