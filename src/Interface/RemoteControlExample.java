package Interface;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new Televison();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
        
    }
}
