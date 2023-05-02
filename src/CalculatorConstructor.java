import java.util.Scanner;

public class CalculatorConstructor {
    int result;

    CalculatorConstructor(int a, int b){
       result = plus(a, b);
    }

    public int plus(int a, int b){
        return a+b;
    }


}
