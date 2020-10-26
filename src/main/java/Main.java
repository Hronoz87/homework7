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



        listGetAge1(list);
        listGetSex(list);

    }



    public static List<User> listGetAge1(List<User> list) {
        List<User> list2 = new ArrayList<>();
        for (User user : list) {
            user.getAge();
            if (user.age > 20) {
                list2.add(user);
                System.out.println("Взрослый человек " + user);
            }

        }
        return list2;
    }


    public static List<User> listGetSex(List<User> list) {
        List<User> list3 = new ArrayList<>();
        for (User user : list) {
            user.getSex();
            if (user.Sex == Sex.MAN) {
                list3.add(user);
                System.out.println("Мужчина " + user);
            }

        }
        return list3;
    }
}
