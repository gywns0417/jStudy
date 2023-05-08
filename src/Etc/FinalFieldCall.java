package Etc;

public class FinalFieldCall {
    public static void main(String[] args) {
        FinalField k1 = new FinalField("123456-0987765", "왕효준");

        System.out.println(k1.name);
        System.out.println(k1.nation);
        System.out.println(k1.ssn);

        k1.name = "킹효준"; //final 필드 아니므로 변경 가능
        
        System.out.println(k1.name);
    }
    
}
