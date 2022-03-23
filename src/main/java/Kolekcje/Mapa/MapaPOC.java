import java.util.HashMap;
import java.util.Map;

public class MapaPOC {

    public static void main(String[] args) {

        //mapowanie klucz - wartosc
        Product[] products = {new Product("fjeo", "mleko", 8), new Product("fjedfdso", "kawa", 12)};

        String barcodZKasy = "fjedfdso";

        for (int i = 0; i < products.length; i++) {
            if (products[i].getBarcode().equals(barcodZKasy)) {
                System.out.println("znalazlem cena wynosi " + products[i].getPrice());
            }
        }

        //szybkosc, szybko znajdujemy element po kluczu
        //Map to interface
        Map<String, Product> mapaProduktow = new HashMap<>();

        Product mleko = new Product("fjeo", "mleko", 8);

        //dodanie do mapy
        mapaProduktow.put(mleko.getBarcode(), mleko);

        //pobranie produktu
        Product mlekoZMapy = mapaProduktow.get("fjeo");

        System.out.println(mlekoZMapy);
    }

}