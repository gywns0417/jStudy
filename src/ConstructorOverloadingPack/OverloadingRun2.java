package ConstructorOverloadingPack;

public class OverloadingRun2 {
    public static void main(String[] args){
        OtherConstructorCall car1 = new OtherConstructorCall();
        System.out.println("제조사 : " + car1.company);
        System.out.println();
        OtherConstructorCall car2 = new OtherConstructorCall("그랜저");
        System.out.println("제조사 : " + car2.company);
        System.out.println("모델명 : " + car2.model);
        System.out.println();
        OtherConstructorCall car3 = new OtherConstructorCall("그랜저", "검정");

            //ConstructorOverloadingPack.OtherConstructorCall(String model, String color) 생성자 내부에 this("아반떼"); 만 사용하므로,
            //다른 어떤 매개변수를 넣든 ConstructorOverloadingPack.OtherConstructorCall(String model)가 호출되고,
            //그 생성자는 this(model, "은색", 300); 밖에 없으므로, model이 처음에 "아반뗴"로 전달되고, 나머지는 은색, 300이 전달된다.
        System.out.println("제조사 : " + car3.company);
        System.out.println("모델명 : " + car3.model);
        System.out.println("모델명 : " + car3.color);
        System.out.println();
        OtherConstructorCall car4 = new OtherConstructorCall("그랜저", "검정", 300);
        System.out.println("제조사 : " + car4.company);
        System.out.println("모델명 : " + car4.model);
        System.out.println("모델명 : " + car4.color);
        System.out.println("모델명 : " + car4.maxSpeed);



    }
}
