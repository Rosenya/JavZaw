package Equals;

import java.util.Objects;

public class Child {

    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return age == child.age && name.equals(child.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
