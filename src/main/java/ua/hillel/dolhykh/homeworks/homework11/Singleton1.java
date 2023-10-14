package ua.hillel.dolhykh.homeworks.homework11;

public class Singleton1 {
    private static Singleton1 instance;

    private String value;

    public String getValue() {
        return value;
    }

    private Singleton1(String value) {
        this.value = value;
    }

    public static Singleton1 getInstance(String value) {
        if (instance == null) {
            instance = new Singleton1(value);
        }

        return instance;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Singleton1 first = Singleton1.getInstance("Hello!");
        Singleton1 second = Singleton1.getInstance("Goodbye!");

        // true
        System.out.println(first == second);

        // Hello!
        System.out.println(first.getValue());

        // Hello!
        System.out.println(second.getValue());
    }
}