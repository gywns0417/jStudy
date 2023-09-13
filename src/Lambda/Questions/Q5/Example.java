package Lambda.Questions.Q5;

public class Example {
    public static void main(String[] args) {
        // Button 객체 생성
        Button btnOk = new Button(); 

        // 함수형 인터페이스에 람다식 전달
        btnOk.setClickListener(() -> {
            System.out.println("Ok 버튼을 클릭했습니다.");
        });
        // 구현체 실행
        btnOk.click();

        Button btnCancle = new Button();
        btnCancle.setClickListener(() -> {
            System.out.println("Cancle 버튼을 클릭했습니다.");
        });
        btnCancle.click();
    }
}
