package ua.hillel.dolhykh.homeworks.homework2.variant1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobik");
        Cat cat = new Cat("Murzik");

        dog.run(500);
        dog.swim(11);

        cat.run(100);
        cat.swim(5);

        System.out.println("Cat count: " + Animal.catCount);
        System.out.println("Dog count: " + Animal.dogCount);
        System.out.println("Total animal count: " + Animal.animalCount);
    }
}




