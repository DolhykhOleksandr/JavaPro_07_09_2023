package ua.hillel.dolhykh.homeworks.homework1.package1;

public class SameName {
    //public static final int CONSTANT = 10;
    private String name;
    private int age;

    public SameName(String name, int age){
       this.name = name;
       this .age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "SameName{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void printAll(){
        System.out.println(name+","+age);
    }
}
