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
            this.balance = this.balance + balance;
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
