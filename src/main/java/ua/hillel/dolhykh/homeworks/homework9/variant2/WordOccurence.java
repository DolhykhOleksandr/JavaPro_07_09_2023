package ua.hillel.dolhykh.homeworks.homework9.variant2;

public class WordOccurence {
    private String name;
    private int occurrence;

    public WordOccurence(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "\n{name: \""
                + name + "\", occurrence: "
                + occurrence +
                "}";
    }
}