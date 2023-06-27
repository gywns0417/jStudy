package NestedClass.AnonymousImplObj;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button3 btnOk = new Button3();

        //Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new Button3.ClickListener() {
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            };
        });

        //Ok 버튼 클릭하기
        btnOk.click();

        // ----------------------------------------------------------------

        // Cancel 버튼 객체 생성
        Button3 btnCancel = new Button3();

        //Cancel 버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListener(new Button3.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        //Cancel 버튼 클릭하기
        btnCancel.click();

    }
}
