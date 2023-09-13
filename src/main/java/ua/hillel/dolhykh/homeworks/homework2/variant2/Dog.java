package ua.hillel.dolhykh.homeworks.homework2.variant2;

public class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;
    private static int count = 0;

    public Dog() {
        count++;
    }

    @Override
    public void run(int length) {
        if (length <= MAX_RUN_DISTANCE) {
            System.out.println("The dog ran " + length + " m");
        } else {
            System.out.println("The dog cannot run that far");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= MAX_SWIM_DISTANCE) {
            System.out.println("The dog swam " + length + " m");
        } else {
            System.out.println("The dog cannot swim that far");
        }
    }

    public static int getCount() {
        return count;
    }
}
