package pl.sdacademy.intermediate.basic10;

import java.io.FileNotFoundException;


public class Rectangle {

    int width;
    int height;

    public Rectangle(int width, int height) {
        if (width<0 || height<0){
            throw new IllegalArgumentException("Wysokośći szerokość nie mągą mieć -");
        }
        this.width=width;
        this.height=height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void showSize() {
        System.out.println(getWidth() + "-" + getHeight());
    }

    public void updateWidth(int width) {
        if (width>=0) {
            this.width = width;
        }
    }

    public void updateHeight(int height) {
        if (height>=0) {
            this.height = height;
        }
    }

    public int calculateArea() {
        int area = getWidth()*getHeight();
        return area;
    }

     int calculatePerimeter() {
        int perimeter = (2*getWidth())+ (2*getHeight());
        return perimeter;
    }

}


