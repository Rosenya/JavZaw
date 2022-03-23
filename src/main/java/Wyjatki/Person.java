import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        if (birthday.isAfter(LocalDate.now())) {
//            throw new IllegalArgumentException("Bledna data nie moze byc z przyszloci");
            throw new InvalidBirthdayDate("Bledna data nie moze byc z przyszloci");
        }
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}