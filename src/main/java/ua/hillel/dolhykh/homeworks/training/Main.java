package ua.hillel.dolhykh.homeworks.training;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0)
                System.out.println("i = " + i);
        }
        System.out.println();
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 1)
                System.out.println("i = " + i);
        }
    }
}