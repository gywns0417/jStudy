package Exception;

public class ExceptionHandlingExample2 {
    public static void printLength(String data){
        try {
            int result = data.length();
            System.out.println("문자 수  : " + result);
            
        } catch (NullPointerException e) { // 예외 정보를 얻는 3가지 방법
            System.out.println(e.getMessage()); // 1
            // System.out.println(e.toString()); // 2
            // e.printStackTrace(); // 3
        }

    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("프로그램 종료");
    }
}
