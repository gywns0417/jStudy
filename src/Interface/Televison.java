package Interface;

public class Televison implements RemoteControl {
    
    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }
}
