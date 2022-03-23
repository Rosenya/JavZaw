import java.util.Comparator;

//w nawiasie diamentowym <Student> umieszczam informacje ktorej klasy tworze Comparator
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
