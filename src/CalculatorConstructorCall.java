import java.util.Scanner;

public class CalculatorConstructorCall {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요:");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("두 번째 정수를 입력하세요:");
        int b = scanner.nextInt();
        scanner.nextLine();

        CalculatorConstructor cal = new CalculatorConstructor(a, b);
        int result = cal.result;
        System.out.println(result);

    }
}
