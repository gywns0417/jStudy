package NestedClass.Questions.Q7;

// 다음 Chatting 클래스는 컴파일 에러가 발생합니다. 원인을 설명해보세요.
// 답 : 로컬 변수를 로컬 클래스에서 사용할 경우 로컬 변수는 final 로 선언이 되기 때문에 값을 수정할 수 없다. 그런데 nickName을 chatId로 재정의 했기 때문에, 에러가 발생한다.

public class Chatting {
    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }

    void startChat(String chatId) {
        String nickName = null;
        nickName = chatId;

        Chat chat = new Chat() {
            @Override
            public void start() {
                while(true) {
                    String inputData = "안녕하세요";
                    //String message = "[" + nickName + "] " + inputData;
                    //sendMessage(message);
                }
            }
        };

        chat.start();
    }
}
