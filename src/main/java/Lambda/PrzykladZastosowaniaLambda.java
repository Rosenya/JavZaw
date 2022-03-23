import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrzykladZastosowaniaLambda {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jan");
        names.add("Rambo");
        names.add("Rocky");
        names.add("Terminator");
        names.add("Terminator");

        System.out.println(names);
        Predicate<String> predicate;
//        @FunctionalInterface
//        public interface Predicate<T> {
//            boolean test(T t);
        predicate = name -> name.equals("Terminator");
        predicate = name -> name.length() < 4;

        names.removeIf(name -> name.isEmpty()); //metoda usuwa wszystki elementy dla ktorych implementacja interfejsu zwroci true
        names.removeIf(x -> x.isEmpty());

        System.out.println(names);

        //String kot to referencja
        //to co po prawej to przypisanie wartosci do referencji
        //zobaczymy ostatnio przypisana wartosc
        String kot = "kot";
        kot = "pies";
        kot = "tygrys";
        System.out.println(kot);


    }


}
