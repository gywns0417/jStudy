package Questions.Inhertance.Q11;

public class MainActivity extends Activity {
    @Override
    public void onCreate(){
        super.onCreate();
        System.out.println("추가적인 실행 내용");
    }

    public static void main(String[] args) {
        MainActivity m = new MainActivity();
        m.onCreate();
    }
}
