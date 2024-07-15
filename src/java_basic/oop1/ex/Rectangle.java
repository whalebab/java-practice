package java_basic.oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea(int width, int height) {
        return width * height;
    }
    int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }
    boolean isSquare(int width, int height) {
        return width == height;
    }
}
