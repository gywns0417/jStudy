package GetteSetter;

public class Speed {

    private double speed;

    public void setSpeed(double speed){
        if(speed < 0){
            this.speed = 0;
            return;
        }
        this.speed = speed;

    }
}
