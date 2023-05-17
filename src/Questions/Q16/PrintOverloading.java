package Questions.Q16;


public class PrintOverloading {
    public static void main(String[] args) {
        PrintOverloading printer = new PrintOverloading();
        printer.println(1);
        printer.println(true);
        printer.println(5.8);
        printer.println("홍길동");

    }

    void println(int x){
        System.out.println(x);
    }

    void println(boolean x){
        System.out.println(x);
    }

    void println(double x){System.out.println(x);}

    void println(String x){System.out.println(x);}



}
