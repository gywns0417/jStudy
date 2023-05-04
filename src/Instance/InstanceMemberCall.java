package Instance;

public class InstanceMemberCall {
    public static void main(String[] args) {
    InstanceMember im = new InstanceMember();
    InstanceMember im2 = new InstanceMember();

    im.gas = 10;
    im2.gas = 20;

    im.setSpeed(100);
    im2.setSpeed(200);

    }
}
