package Questions.Q19;

import java.util.Scanner;

public class BankApplication {
    String r = "-";
    Scanner scan = new Scanner(System.in);
    int x = 0;
    Account[] list = new Account[100];


    public static void main(String[] args) {

        BankApplication bankApplication = new BankApplication();
        //bankApplication.choiceMenu();
        bankApplication.createAccount();
        bankApplication.createAccount();
        bankApplication.printAccount();

    }

    void menu(){
        System.out.println(r.repeat(20));
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println(r.repeat(20));
        System.out.print("선택 > ");
        System.out.println(r.repeat(20));
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

    }

    void createAccount(){
        System.out.print("계좌번호 :");
        String id = scan.nextLine().trim();
        System.out.print("계좌주 :");
        String owner = scan.nextLine().trim();
        System.out.print("초기입금액 :");
        int balance  = scan.nextInt();

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



}

