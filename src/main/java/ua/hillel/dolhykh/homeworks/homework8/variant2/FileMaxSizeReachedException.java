package ua.hillel.dolhykh.homeworks.homework8.variant2;

public class FileMaxSizeReachedException extends Exception{
    public FileMaxSizeReachedException() {
        System.out.println("Дуже великій розмір файлу");
    }
}