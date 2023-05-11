package SingletonPattern;

public class Singleton {

    //private 정적 필드 선언과 초기화
    private static Singleton singleton = new Singleton();

    //생성자 외부 호출 못하도록 private 선언
    private Singleton() {}

    //public 권한 갖는 정적 메소드 선언
    public static Singleton getInstance(){
        return singleton;
    }
}
