public class Item {

    private String name;
    private String barcode;

    public Item(String name, String barcode) {
        this.name = name;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

//    @Override
//    public String toString() {
//        return "Item{" +
//                "name='" + name + '\'' +
//                ", barcode='" + barcode + '\'' +
//                '}';
//    }
}
