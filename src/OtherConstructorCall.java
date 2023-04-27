public class OtherConstructorCall {

    String company = "기아차";
    String model;
    String color;
    int maxSpeed;

    OtherConstructorCall(){
    }

    OtherConstructorCall(String model){

        this(model, "은색", 300); //OtherConstructorCall(String model, String color, int maxSpeed)
                                                //위 메소드에 model, "은색", 300을 매개변수로 전달하여 호출.

    }

    OtherConstructorCall(String model, String color){
        this("아반떼"); //OtherConstructorCall(String model) 호출

    }

    OtherConstructorCall(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;

    }



}
