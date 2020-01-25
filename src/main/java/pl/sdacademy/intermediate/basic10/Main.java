package pl.sdacademy.intermediate.basic10;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Rectangle rectangle = new Rectangle(3,44);
        rectangle.updateHeight(22);
        rectangle.updateWidth(10);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
