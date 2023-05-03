package Return;

import java.util.Scanner;

public class ReturnMethod {
    int save;
    Scanner scanner = new Scanner(System.in);
    ReturnMethodField returnMethodField = new ReturnMethodField();
    public static void main(String[] args){

        ReturnMethod returnMethod = new ReturnMethod();
        returnMethod.run();


    }

    void run(){
        System.out.println("가스를 입력해주세요.");
        save = scanner.nextInt();
        scanner.nextLine();
        returnMethodField.setGas(save);
        System.out.printf("gas는 %s입니다.%n", returnMethodField.gas);
        System.out.println("gas를 사용하시겠습니까? 사용하시려면 1을, 아니면 2를 입력해주세요.");
        if(scanner.nextInt() == 1){
            System.out.println("gas를 사용합니다.");
            returnMethodField.setGasZero();
            returnMethodField.printBoolean();
        }
        else {
            System.out.println("gas를 사용하지 않습니다.");
            returnMethodField.printBoolean();
        }
    }



}
