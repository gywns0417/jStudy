package Base.Questions.Q6;

// Member 클래스에서 Object의 toString() 메소드를 오버라이딩해서 MemberExample 클래스의 실행 결과처럼 나오도록 작성하라
// 실행 결과 : blue: 이파란
public class Member {
    private String name;
    private String id;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return name + ": " + id;
    }
}
