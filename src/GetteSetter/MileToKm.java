package GetteSetter;

public class MileToKm   {
    private double speed;


    public double getSpeed() {
        double km = speed * 1.6;
        return km;
    }


    private boolean stop;

    public boolean isStop() {
        return stop;
    }
}
