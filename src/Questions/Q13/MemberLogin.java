package Questions.Q13;

public class MemberLogin {
    MemberService memberService = new MemberService();
    Member user1 = new Member("홍길동", "hong", "12345");
    String id = user1.id;
    String password = user1.getPassword();
    boolean result = memberService.login(id, password);
    void validateAndPrintLoginStatus() {
        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else System.out.println("id 또는 password가 올바르지 않습니다.");

    }
}
