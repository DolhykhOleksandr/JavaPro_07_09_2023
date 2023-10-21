package ua.hillel.dolhykh.homeworks.homework12.variant3;

public enum ProductType {

    BOOK("Book"),
    PEN("Pen"),
    PENCIL("Pencil"),
    NOTEBOOK("Notebook");

    private String type;

    ProductType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}