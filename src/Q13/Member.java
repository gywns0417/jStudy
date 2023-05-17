package Q13;

public class Member {
    public static void main(String[] args) {
        MemberLogin login = new MemberLogin();
        login.validateAndPrintLoginStatus();


    }
    private String name;
    String id;
    private String password;
    int age;

    Member(String name, String id, String password){
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getPassword(){
        return password;
    }



}
