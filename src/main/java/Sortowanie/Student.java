package Sortowanie;

import java.util.Objects;

public class Student {

    private String name;
    private String pesel;
    private int indexNumber;

    public Student(String name, String pesel, int indexNumber) {
        this.name = name;
        this.pesel = pesel;
        this.indexNumber = indexNumber;
    }

    public String getName() {
        return name;
    }

    public String getPesel() {
        return pesel;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return indexNumber == student.indexNumber && Objects.equals(name, student.name) && Objects.equals(pesel, student.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pesel, indexNumber);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ",pesel='" + pesel + '\'' +
                ",index=" + indexNumber +
                '}';
    }
}
