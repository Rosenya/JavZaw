package Wyjatki.Cwiczenia;

public class Kid implements Comparable<Kid>{

    private String name;
    private int age;
    private int heigth;
    private int shoeSize;

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

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public Kid(String name, int age, int heigth, int shoeSize) {
        this.name = name;
        this.age = age;
        this.heigth = heigth;
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heigth=" + heigth +
                ", shoeSize=" + shoeSize +
                '}';
    }

    @Override
    public int compareTo(Kid o) {
        return Integer.compare(this.getHeigth(), o.getHeigth());
    }
}

