import java.util.ArrayList;
import java.util.List;

public class PrzykladZastosowaniaKonkret {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jan");
        names.add("Rambo");
        names.add("Rocky");
        names.add("Terminator");
        names.add("Terminator");

        System.out.println(names);

        names.removeIf(name -> name.length() < 4);

        System.out.println(names);
    }
}
