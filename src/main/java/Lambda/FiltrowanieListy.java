import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FiltrowanieListy {

    public static void main(String[] args) {

        Consumer<String> stringConsumer;
//        @FunctionalInterface
//        public interface Consumer<T> {
//            void accept(T t); IMPLEMENTUJEMY TE METODE
        //T zastepujemy Stringiem czyli argumentem lambdy bedzie String

        List<String> names = new ArrayList<>();
        names.add("Jan");
        names.add("Terminator");
        names.add("Ramboooooooooooooooo");
        names.add("Rocky");
        names.add("Terminator");

        System.out.println(names);

//        names.stream().forEach(x -> System.out.println(x)); // w implementacji interfejsu Consumer wydrukowalismy zawartosc
        names.stream().forEach(System.out::println); //uzywamy tu referencji metody, jest to alternatywna forma implementacji interfejsu funkcyjnego


        //w kodzie z uzyciem streamow i lambd lepiej widac intencje operacji
        List<String> o = names.stream()
                .filter(name -> !name.isEmpty())
                .filter(name -> name.contains("o"))
                .filter(name -> name.length() > 1)
                .collect(Collectors.toList()); //operacja przypisania rezultatu do listy
        System.out.println(o);


        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (!name.isEmpty() && name.contains("o") && name.length() > 1) {
                result.add(name);
            }
        }

//        @FunctionalInterface
//        public interface Comparator<T> {
//        int compare(T o1, T o2);
        Comparator<String> ii;

        List<String> anotherResult = names.stream()
                .filter(name -> !name.isEmpty()) //usuwa puste stringi
                .filter(name -> name.contains("o")) //usuwa wszystkie string nie zawieraje o
//                .sorted() sortujemy na koniec a nie na poczatku, bo bedzie to efektywniej
                .filter(name -> name.length() > 1) //pozostawia String o dlugosci wiekszej niz 1
                .sorted((x, y) -> Integer.compare(x.length(), y.length())) //moge dodat sortowanie, tutaj lambda implementuje interface Comparator
                .collect(Collectors.toList()); //operacja przypisania rezultatu do listy
        System.out.println(anotherResult);
    }

}
