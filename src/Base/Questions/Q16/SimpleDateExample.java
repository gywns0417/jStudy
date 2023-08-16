package Base.Questions.Q16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateExample {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");

        Date now = new Date();

        System.out.println(sdf.format(now));
    }
}
