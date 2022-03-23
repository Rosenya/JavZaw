package porownania;

public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) { //kolejnosc naturalna
//        return o.getName().compareTo(this.getName()); //sortowanie po imieniu ale odwrotnie
//        return Integer.compare(o.getAge(), this.getAge());
//        return Integer.compare(this.age, o.age);
//        return Integer.compare(this.getName().length(), o.getName().length());
        int compareResult = this.getName().compareTo(o.getName()); //sortowanie po imieniu
        if (compareResult == 0) {
            return Integer.compare(this.getAge(), o.getAge());
        }
        return compareResult;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
