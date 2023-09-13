package ua.hillel.dolhykh.homeworks.homework2.variant1;

public class Animal {
    protected String name;
    protected int runningLimit;
    protected int swimmingLimit;
    protected static int animalCount = 0;
    protected static int catCount = 0;
    protected static int dogCount = 0;

    public Animal(String name, int runningLimit, int swimmingLimit) {
        this.name = name;
        this.runningLimit = runningLimit;
        this.swimmingLimit = swimmingLimit;
        animalCount++;
        if (this instanceof Cat) {
            catCount++;
        } else if (this instanceof Dog) {
            dogCount++;
        }
    }

    public void run(int distance) {
        if (distance <= runningLimit) {
            System.out.println(name + " ran " + distance + " meters.");
        } else {
            System.out.println(name + " couldn't run " + distance + " meters.");
        }
    }

    public void swim(int distance) {
        if (distance <= swimmingLimit) {
            System.out.println(name + " swam " + distance + " meters.");
        } else {
            System.out.println(name + " couldn't swim " + distance + " meters.");
        }
    }
}