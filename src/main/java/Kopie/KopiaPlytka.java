import java.util.ArrayList;
import java.util.List;

public class KopiaPlytka {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("pralka", "jsofje"));
        items.add(new Item("tv", "sfs"));

        //UWAGA obie listy przechowuje te same obiekty
        List<Item> itemsCopy = new ArrayList<>(items); //kopiowanie listy, czyli uwtorzenie nowej listy podajac w konstruktorze oryginalna

        System.out.println(items);
        System.out.println(itemsCopy);
        itemsCopy.remove(0);
        itemsCopy.get(0).setBarcode("psikus");
        System.out.println("**********************");
        System.out.println(items);
        System.out.println(itemsCopy);

    }


}
