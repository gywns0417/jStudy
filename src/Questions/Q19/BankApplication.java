package Questions.Q19;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
    String r = "-";
    Scanner scan = new Scanner(System.in);
    int x = 0;

    static Account[] list = new Account[100];


    public static void main(String[] args) {

        BankApplication bankApplication = new BankApplication();

        while(true) {
            bankApplication.menu();
        }
    }

    void menu(){
        System.out.println(r.repeat(20));
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println(r.repeat(20));
        System.out.print("선택 > ");
        choiceMenu();


    }
    void choiceMenu(){
        while(!scan.hasNextInt()){
            System.out.println("1~5까지의 숫자를 입력해주세요.");
            scan.next();
        }
        int inputNumber = scan.nextInt();

        while(true){
            if(inputNumber < 1 || inputNumber > 5) {
                System.out.println("1~5 사이의 숫자로 입력해주세요.");
                inputNumber = scan.nextInt();

            }
            else break;
        }
        switch (inputNumber) {
            case 1 : createAccount();
                break;

            case 2 : printAccount();
                break;

            case 3 : deposit();
                break;

            case 4 : withdraw();
                break;

            case 5 : exit();

        }


    }

    void createAccount(){
        scan.nextLine();
        System.out.print("계좌번호 :");
        String id = scan.nextLine().trim();
        System.out.print("계좌주 :");
        String owner = scan.nextLine().trim();
        System.out.print("초기입금액 :");
        int balance  = scan.nextInt();
        scan.nextLine();
        list[x] = new Account(id, owner, balance);

        x = x + 1;
        System.out.println("결과 : 계좌가 생성되었습니다.");
    }

    void printAccount(){
        for(Account a : list){
            if(a != null){
                System.out.println(a);
            }
        }
    }

    void exit(){
        System.exit(0);
    }


    void deposit(){
        scan.nextLine();
        System.out.println("예금");
        System.out.println(r.repeat(20));
        System.out.print("계좌번호 :");
        String id = scan.nextLine().trim();
        int a = validateId(id);
        if(a != -1){
            System.out.print("예금액 :");
            int balance  = scan.nextInt();
            list[a].setDepositBalance(balance);
            scan.nextLine();
            System.out.println("예금 완료되었습니다.");
        }
        else {
            while(validateId(id) == -1) {
                System.out.println("맞는 계좌번호가 없습니다. 다시 입력해주세요.");
                System.out.print("계좌번호 :");
                id = scan.nextLine().trim();
                if(validateId(id) != -1){
                    System.out.print("예금액 :");
                    int balance  = scan.nextInt();
                    list[validateId(id)].setDepositBalance(balance);
                    scan.nextLine();
                    System.out.println("예금 완료되었습니다.");
                }
            }
        }
        //계좌번호 검증 메소드 작성필
    }

    void withdraw(){
        scan.nextLine();
        System.out.println("출금");
        System.out.println(r.repeat(20));
        System.out.print("계좌번호 :");
        String id = scan.nextLine().trim();
        int a = validateId(id);
        if(a != -1){
            System.out.println("출금액 : ");
            int balance = scan.nextInt();
            scan.nextLine();
            list[a].setWithdrawBalance(balance);
            System.out.println("출금이 성공되었습니다.");
        }
        else {
            while (validateId(id) == -1){
                System.out.println("맞는 계좌번호가 없습니다. 다시 입력해주세요.");
                System.out.print("계좌번호 :");
                id = scan.nextLine().trim();
                if(validateId(id) != -1){
                    System.out.print("출금액 :");
                    int balance  = scan.nextInt();
                    list[validateId(id)].setWithdrawBalance(balance);
                    scan.nextLine();
                    System.out.println("출금 완료되었습니다.");
                }
        }
        }
    }

    int validateId(String id){
        for(Account a : list){
            if(a != null && a.getId().equals(id)){
                return Arrays.asList(list).indexOf(a);
            }

        }
        return -1;
    }



}
