package Questions.Q16;


public class PrintOverloadingNonInstance {
    public static void main(String[] args) {
        println(1);
        println(true);
        println(5.8);
        println("홍길동");

    }

    static void println(int x){
        System.out.println(x);
    }

    static void println(boolean x){
        System.out.println(x);
    }

    static void println(double x){System.out.println(x);}

    static void println(String x){System.out.println(x);}



}
