import java.util.ArrayList;
import java.util.Collections;

public class SortowanieStudent {

    public static void main(String[] args) {

        Student rambo = new Student("Rmabo", 18);
        Student rocky = new Student("R", 77);
        Student batman = new Student("Batmannnnnnnnnnnnnnnnn", 44);
        Student terminator = new Student("Terminator", 32);

        ArrayList<Student> students = new ArrayList();
        students.add(rambo);
        students.add(rocky);
        students.add(batman);
        students.add(terminator);
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

        StudentComparator studentComparator = new StudentComparator();
        Collections.sort(students, studentComparator);
//        students.sort(comparator);
        System.out.println(students);
    }

}
