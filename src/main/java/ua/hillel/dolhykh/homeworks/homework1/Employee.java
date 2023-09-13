package ua.hillel.dolhykh.homeworks.homework1;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
}

/*
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;


    public Employee(String fullName, String position, String email, String phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Співробітник: " +
                "ПІБ='" + fullName + '\'' +
                ", Посада='" + position + '\'' +
                ", Email='" + email + '\'' +
                ", Телефон='" + phoneNumber + '\'' +
                ", Вік=" + age;
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Іванов Іван Іванович", "Менеджер", "ivan@example.com", "+123456789", 30);

        System.out.println(employee.toString());
    }
}
*/

/*
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    // Конструктор класу Employee
    public Employee(String fullName, String position, String email, String phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public static void main(String[] args) {
        // Приклад створення об'єкта класу Employee
        Employee employee = new Employee("Іванов Іван Іванович", "Менеджер", "ivan@example.com", "+123456789", 30);

        // Виведення інформації про співробітника без використання геттерів та методу toString()
        System.out.println("ПІБ: " + employee.fullName);
        System.out.println("Посада: " + employee.position);
        System.out.println("Email: " + employee.email);
        System.out.println("Телефон: " + employee.phoneNumber);
        System.out.println("Вік: " + employee.age);
    }
}

*/
/*
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;


    public Employee(String fullName, String position, String email, String phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Іванов Іван Іванович", "Менеджер", "ivan@example.com", "+123456789", 30);


        System.out.println("ПІБ: " + employee.getFullName());
        System.out.println("Посада: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Телефон: " + employee.getPhoneNumber());
        System.out.println("Вік: " + employee.getAge());


        employee.setEmail("new_email@example.com");
        employee.setAge(31);

        System.out.println("Оновлений Email: " + employee.getEmail());
        System.out.println("Оновлений Вік: " + employee.getAge());
    }
}

*/
