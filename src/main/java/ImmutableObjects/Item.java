////obiekt niemutowalny immutable, czyli taki, ktorego stanu nie mozna zmienic
////nie mozna dziedziczyc z tej klasy
//public class Item {
//
//    //do obiektu poprzedzonego slowem kluczowym final mozemy przypisac obiekt tylko raz
//    //nie mozemy potem przypisac innego obiektu do tej referencji
//    private final String name;
//    private final String barcode;
//
//    public Item(String name, String barcode) {
//        this.name = name;
//        this.barcode = barcode;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getBarcode() {
//        return barcode;
//    }
//
//    @Override
//    public String toString() {
//        return "Item{" +
//                "name='" + name + '\'' +
//                ", barcode='" + barcode + '\'' +
//                '}';
//    }
//}
