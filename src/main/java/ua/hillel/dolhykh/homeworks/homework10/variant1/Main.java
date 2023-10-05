package ua.hillel.dolhykh.homeworks.homework10.variant1;

public class Main {
    public static void main(String[] args) {
        FileNavigator navi = new FileNavigator();

        System.out.println("add()");
        navi.add(new FileData("File1.txt", 51, "homework10.variant1(1)/"));
        navi.add(new FileData("File2.txt", 89, "homework10.variant1(2)/"));
        navi.add(new FileData("File3.txt", 21, "homework10.variant1(3)/"));
        navi.add(new FileData("File4.txt", 5, "homework10.variant1(4)/"));
        navi.add(new FileData("File5.txt", 24, "homework10.variant1(5)/"));
        navi.add(new FileData("File6.txt", 9, "homework10.variant1(6)/"));
        navi.add(new FileData("File7.txt", 51, "homework10.variant1(7)/"));
        navi.add(new FileData("File8.txt", 11, "homework10.variant1(8)/"));
        navi.add(new FileData("File9.txt", 21, "homework10.variant1(9)/"));
        System.out.println();


        System.out.println("find()");
        int a = 1;
        for (int i = 1; i < 5; i++) {
            String b = "homework10.variant1" + "." + i + "/";
            System.out.print("Шукаємо" + b);
            System.out.println(navi.find(b));
        }
        System.out.println();

        System.out.println("filterBySize()");
        int i = 15;
        System.out.println("Файли меньше " + i + " байтів: " + navi.filterBySize(i));
        System.out.println();

        System.out.println("remove()");
        String removedPath = navi.remove("homework10.variant1(4)/");
        System.out.println("Видалений путь: " + removedPath);
        System.out.println();


    }
}