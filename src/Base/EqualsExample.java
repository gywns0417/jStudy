package Base;

public class EqualsExample {
    public static void main(String[] args) {
        ObjectMember obj1 = new ObjectMember("blue");
        ObjectMember obj2 = new ObjectMember("blue");
        ObjectMember obj3 = new ObjectMember("red");

        if(obj1.equals(obj2)){
            System.out.println("obj1과 obj2는 동등합니다.");
        } else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }

        if(obj1.equals(obj3)){
            System.out.println("obj1과 obj3는 동등합니다.");
        } else {
            System.out.println("obj1과 obj3는 동등하지 않습니다.");
        }
    }
}
