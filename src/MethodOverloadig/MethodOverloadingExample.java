package MethodOverloadig;

public class MethodOverloadingExample {
    double width;
    double height;

    double areaRectangle(double width){
        this.width = width;
        return width * width;
    }

    double areaRectangle(double width, double height){
        this.width = width;
        this.height = height;
        return width * height;
    }

}
