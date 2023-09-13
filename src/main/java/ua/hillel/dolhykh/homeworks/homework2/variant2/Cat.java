package ua.hillel.dolhykh.homeworks.homework2.variant2;

public class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;

    private static int count = 0;

    public Cat() {
        count++;
    }

    @Override
    public void run(int length) {
        if (length <= MAX_RUN_DISTANCE) {
            System.out.println("The cat ran " + length + " m");
        } else {
            System.out.println("The cat cannot run that far");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("The cat cannot swim");
    }

    public static int getCount() {
        return count;
    }
}