import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredykatZListy {

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
        predicate = name -> !name.isEmpty(); //zwraca true dla pustego imienia

        boolean result = names.stream().allMatch(predicate); //zwraca true jesli lista nie zawiera pustych elementow
        System.out.println(result);

        //tworzymy stream() co oznacza, ze kazdy element listy names trafia jako argument do lambdy
        //jako argument, czyli jest podstawiany do name
//        boolean isNamesContainsRambo = names.stream().anyMatch(name -> name.equals("Rambo"));

        //final oznacza, ze jak raz przypiszemy obiekt do referencji, to nie mozemy przypisac innego obiekut
        //stan obiektu moze sie zmienic, ale nie mozemy przypisac innego

        //jesli chcemy przekazac zmienna do lambdy w tym przypadku nameToCheck
        //to zmienna ta musi byc finalna lub efektywnie finala
        //efektywnie finalna, znaczy ze mozna przed nia postawic final

        String nameToCheck = "Rambo";
        boolean isNamesContainsRambo = names.stream().anyMatch(name -> name.equals(nameToCheck));
        //zwraca true jesli na liscie jest Rambo


        System.out.println("isNamesContainsRambo " + isNamesContainsRambo);


    }

}
