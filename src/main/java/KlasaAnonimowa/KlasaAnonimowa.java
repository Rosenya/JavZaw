package porownania;

import java.util.ArrayList;
import java.util.Comparator;

public class KlasaAnonimowa {

    public static void main(String[] args) {

        Student terminator = new Student("Terminatoroooooooooooooooooooooooo", 32);
        Student batman = new Student("Rambooooooooooooooooo", 44);
        Student rocky = new Student("Rambo", 77);
        Student rambo = new Student("Ram", 18);

        ArrayList<Student> students = new ArrayList();
        students.add(rambo);
        students.add(terminator);
        students.add(rocky);
        students.add(batman);
        System.out.println(students);

        //klasa anonimowa
        Comparator<Student> comparatorByAge = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getName().length(), o2.getName().length());
            }
        };

        //klasa anonimowa
        Comparator<Student> comparatorByName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareTo(o2);
            }
        };

        students.sort(comparatorByAge);
        System.out.println(students);

        students.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println(students);
    }

}
