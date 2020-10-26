import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User user = new User(1, "John", "Smit", Sex.MAN, 20);
        User user1 = new User(2, "Andy", "Smit", Sex.MAN, 40);
        User user2 = new User(3, "Anna", "Smit", Sex.WOMAN, 18);
        User user3 = new User(4, "Maria", "Smit", Sex.WOMAN, 42);

        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        System.out.println(list.toString());

        listGetAge(list);
        listGetSex(list);

    }

    public static void listGetAge(List<User> list) {
        long list1 = list.stream()
                .filter(user -> user.getAge() > 20)
                .count();
        System.out.println("Людей старше 20 " + list1);

    }

    public static void listGetSex(List<User> list) {
        long list2 = list.stream()
                .filter(user -> user.getSex() == Sex.MAN)
                .count();
        System.out.println("Мужчин " + list2);
    }

}
