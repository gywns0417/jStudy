package Enum;

public class EnumTest {
    public static void main(String[] args){
        EnumExample today = EnumExample.SUNDAY;
        EnumExample yesterday = EnumExample.SATURDAY;

        if(today != yesterday) System.out.printf("어제는 %s, 오늘은 %s 입니다.", yesterday, today);
    }
}
