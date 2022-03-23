import java.util.HashMap;
import java.util.Map;

public class MapaAgain {

    public static void main(String[] args) {

        //po lewej stronie referencja interface Map
        //po prawej przypisanie obiektu HasMap
        Map<String, Student> personMap = new HashMap<>();

        Student rambo = new Student("Rambo", "6483377373", 979);
        Student rocky = new Student("rocky", "4345345", 532);
        Student terminator = new Student("terminator", "35345", 94479);

        Student[] students = {rambo, rocky, terminator};
        for (int i = 0; i < students.length; i++) {
            personMap.put(students[i].getPesel(), students[i]);
        }
        System.out.println(personMap);
        Student batman = new Student("batman", "6483377373", 798);

        //w przypadku kiedy dodajemy wartosc za pomoca kluca i ten klucz juz istnieje
        //poprzednia wartosc przypisana do klucza zostanie zastapiona nowa
        personMap.put(batman.getPesel(), batman);
        System.out.println(personMap);

        for (String keys : personMap.keySet()) {
//            System.out.println(keys);
        }

        //mozemy z uzyciem petli foreach przeiterowac sie po elemtach
        //kazdy pojedyncze element to obiekt Map.Entry<'klasa klucza', 'klasa wartosci'> entry
        for (Map.Entry<String, Student> entry : personMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
            Student value = entry.getValue();
        }

        Student student = personMap.get("6483377373");
        int indexNumber = student.getIndexNumber();

//        System.out.println("to jest\" tekst"); off topic cudzyslowie w Stringu

        batman.setName("psikus");
        batman.setPesel("4345345");
        System.out.println(personMap);

        System.out.println(batman.hashCode());
        //server, endpoint, port, timeout, region
    }

}
