import java.util.Scanner;

public class CalculatorMethod {

    int result;
    int a;
    int b;

    public int input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요.");
        a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("두 번째 정수를 입력하세요.");
        b = scanner.nextInt();
        scanner.nextLine();

        result = plus(a,b);
        return result;

    }
    public int plus(int a, int b){
        return a+b;
    }

}
