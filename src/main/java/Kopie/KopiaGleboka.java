import java.util.ArrayList;
import java.util.List;

public class KopiaGleboka {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("pralka", "jsofje"));
        items.add(new Item("tv", "sfs"));

        //Kopia gleboka, nowa tablica, nowe obiekty o polach, ktore maja takie same wartosci
        List<Item> itemsCopy = new ArrayList<>();
        for (Item item : items) {
            Item newItem = new Item(item.getName(), item.getBarcode());
            itemsCopy.add(newItem);
        }

        System.out.println(items);
        System.out.println(itemsCopy);
        itemsCopy.remove(0);
        itemsCopy.get(0).setBarcode("psikus");
        System.out.println("**********************");
        System.out.println(items);
        System.out.println(itemsCopy);


    }
}
