package Static;

public class StaticMember {
    String color; //인스턴스 필드
    static double pi = 3.14159; //항상 동일한 값을 가져야 하는 변수이므로, 정적 필드로 선언한다.

    void setColor(String color){ // 인스턴스 필드인 color를 변경하므로, 인스턴스 메소드로 한다.
        this.color = color;
    }

    static int plus(int x , int y){ // 외부에서 주어진 매개값들을 가지고 처리하므로 정적 메소드로 선언한다.
        return x + y;
    }

}
