package Inheritance.Super;

public class Phone {

    String model;
    String color;

    public Phone(String color, String model){
        this.model = model;
        this.color = color;
        System.out.println("Phone(String color, String model) 생성자 실행");
    }
}
