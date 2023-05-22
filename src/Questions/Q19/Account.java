package Questions.Q19;

public class Account {
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;
    private int balance;
    private String id;
    private String owner;

    public Account(String id, String owner, int balance){
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public void setDepositBalance(int balance) {
        if(balance > MAX_BALANCE || balance < MIN_BALANCE){
            System.out.println("한번에 가능한 입금액은 0~1,000,000 입니다.");
        }
            else{
            this.balance = this.balance + balance; //this.balance는 이 메소드를 호출하는 객체의 'balance' 필드 값을 말한다.
                                                   //즉, list[x] = new Account(id, owner, balance); 로 각각의 객체들이
                                                   //각각의 id, owner, balance 값을 갖고 있기에, 필드 값은 하나지만 객체가 여러개 이므로
                                                   //이 메소드는 이 코드를 호출한 특정 list[x] 객체의 balance 값을 수정한다.
        }
    }

    public void setWithdrawBalance(int balance){
        if(balance > MAX_BALANCE || balance < MIN_BALANCE){
            System.out.println("한번에 가능한 출금액은 0~1,000,000 입니다.");
        }
        else{
            this.balance = this.balance - balance;
        }
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + "   " + owner + "   " + balance;
    }
}
