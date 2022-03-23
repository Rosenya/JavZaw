import java.util.Objects;

public class Product {

    private String barcode;
    private String name;
    private int price;

    public Product(String barcode, String name, int price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(barcode, product.barcode) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode, name, price);
    }
}
