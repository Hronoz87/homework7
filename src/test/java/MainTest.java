import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static long suiteStartTime;
    private long testStartTime;

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running MainTest");
        suiteStartTime = System.nanoTime();
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("MainTest complete: " + (System.nanoTime() - suiteStartTime));
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Starting new test");
        testStartTime = System.nanoTime();
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete:" + (System.nanoTime() - testStartTime));
    }

    @Test
    public void testMain() {
        User user = new User(1, "John", "Smit", Sex.MAN, 20);
        User user1 = new User(2, "Andy", "Smit", Sex.MAN, 40);
        User user2 = new User(3, "Anna", "Smit", Sex.WOMAN, 18);
        User user3 = new User(4, "Maria", "Smit", Sex.WOMAN, 42);

        List<User> expected = new ArrayList<>();
        expected.add(user);
        expected.add(user1);
        expected.add(user2);
        expected.add(user3);

        List<User> actual = new ArrayList<>();

        actual.add(user);
        actual.add(user1);
        actual.add(user2);


        Assertions.assertEquals(expected, actual);
    }


}