package Return;

public class ReturnMethodField {

    int gas = 1;

    void setGas(int gas){
        this.gas = gas;
    }

    void setGasZero(){
        this.setGas(0);
    }

    boolean isGasEmpty(){
        return gas == 0? true : false;
    }

    void printBoolean(){
        if(isGasEmpty() == true){
            System.out.println("gas가 없습니다.");
        }
        else System.out.println("gas가 있습니다.");
    }

}
