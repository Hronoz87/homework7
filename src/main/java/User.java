import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {

    public int id;
    public String name;
    public String surname;
    public Enum Sex;
    public int age;

    public User(int id, String name, String surname, Enum sex, int age) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        Sex = sex;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Enum getSex() {
        return Sex;
    }

    public void setSex(Enum sex) {
        Sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Sex=" + Sex +
                ", age=" + age +
                '\n';
    }
}
