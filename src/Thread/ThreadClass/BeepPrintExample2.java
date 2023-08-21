package Thread.ThreadClass;

import java.awt.Toolkit;

public class BeepPrintExample2 {
    public static void main(String[] args) {
       Thread thread = new Thread() {
        @Override
        public void run() {
            Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷 객체 얻기
            for(int i = 0; i < 5; i++){
                toolkit.beep();
                try {
                    Thread.sleep(500); 
                } catch (Exception e ){}
             }
            }
        };
        
        thread.start();

       for(int i = 0; i < 5; i++){
        System.out.println("띵");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
       }
    }
}
