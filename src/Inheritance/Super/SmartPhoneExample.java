package Inheritance.Super;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("아이폰", "옐로우");

        //Phone 으로부터 상속받은 필드 읽기
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);
    }
}
