package ua.hillel.dolhykh.homeworks.homework9.variant1.phonebook;

public class MainAppPhoneBook {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new RecordEntry("Serhii", "0963899779"));
        phoneBook.add(new RecordEntry("Olha", "09635642779"));
        phoneBook.add(new RecordEntry("Oleksandr", "0503815579"));
        phoneBook.add(new RecordEntry("Mykola", "0503556659"));
        phoneBook.add(new RecordEntry("Oleh", "0625532779"));

        System.out.println(phoneBook.find("Oleksandr"));
    }
}