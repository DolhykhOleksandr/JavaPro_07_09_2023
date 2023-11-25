package ua.hillel.dolhykh.homeworks.homework2;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog();
        dogBobik.run(500);
        dogBobik.swim(10);

        Cat catMittens = new Cat();
        catMittens.run(300);
        catMittens.swim(10);

        System.out.println("Number of dogs created: " + Dog.getCount());
        System.out.println("Number of cats created: " + Cat.getCount());
        System.out.println("Number of animals created: " + (Dog.getCount() + Cat.getCount()));
    }
}