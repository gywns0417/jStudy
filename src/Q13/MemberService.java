package Q13;

public class MemberService {

    boolean login(String id, String password){
        if(id == "hong" && password == "12345") return true;
        return false;
    }

    void logout(String id){
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
