public class OverloadingRun {
    public static void main(String[] args){
        ConstructorOverloading car1 = new ConstructorOverloading();
        System.out.println("제조사 : " + car1.company);
        ConstructorOverloading car2 = new ConstructorOverloading("그랜저");
        System.out.println("제조사 : " + car2.company);
        System.out.println("모델명 : " + car2.model);
        ConstructorOverloading car3 = new ConstructorOverloading("그랜저", "검정");
        System.out.println("제조사 : " + car3.company);
        System.out.println("모델명 : " + car3.model);
        System.out.println("모델명 : " + car3.color);
        ConstructorOverloading car4 = new ConstructorOverloading("그랜저", "검정", 300);
        System.out.println("제조사 : " + car4.company);
        System.out.println("모델명 : " + car4.model);
        System.out.println("모델명 : " + car4.color);
        System.out.println("모델명 : " + car4.maxSpeed);



    }
}
