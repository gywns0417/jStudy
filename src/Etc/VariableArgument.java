package Etc;

public class VariableArgument {

    public static void main(String[] args){
        int a = values(1,2,3,4,5,6);
        System.out.println(a);
    }

    static int values(int ... arguments){
        int sum = 0;
        for(int i = 0; i < arguments.length; i++){
            sum += arguments[i];
        }
        return sum;
    }
}
