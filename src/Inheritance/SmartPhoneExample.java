package Inheritance;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myphone = new SmartPhone("아이폰", "실버");

        //Phone 으로부터 상속받은 필드 읽기
        System.out.println("모델 : " + myphone.model);
        System.out.println("컬러 : " + myphone.color);

        //SmartPhone 의 필드 읽기
        System.out.println("와이파이 상태 : " + myphone.wifi);

        //Phone 의 메소드 호출
        myphone.bell();
        myphone.sendVoice("여보세요");
        myphone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
        myphone.sendVoice("네. 반갑습니다.");
        myphone.hangUp();

        //SmartPhone 의 메소드 호출
        myphone.setWifi(true);
        myphone.internet();
    }
}
