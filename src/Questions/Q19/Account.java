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

    public void setBalance(int balance) {
        if(balance > MAX_BALANCE || balance < MIN_BALANCE){}
            else{
            this.balance = balance;
        }
    }
    public void setId(String id){
        this.id = id;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return id + "   " + owner + "   " + balance;
    }
}
