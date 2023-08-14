package Base.Annotation;

import java.lang.reflect.Method;

public class PrintAnnotaionExample{
    public static void main(String[] args) throws Exception {
        Method[] declaredMethods = Service.class.getDeclaredMethods(); //Service의 메소드 정보 읽기
        for(Method method : declaredMethods){
            // PrintAnnotaion 얻기
            // 지정한 어노테이션이 적용되어 있으면 어노테이션을 리턴, 그렇지 않다면 null 리턴
            // 즉, service의 메소드들에 PrintAnnotion이 적용되어 있는가를 확인
            PrintAnnotaion printAnnotaion = method.getAnnotation(PrintAnnotaion.class);
            // 설정 정보를 이용해서 선 출력
            // printAnnotation(boolean 타입)이 null이 아니면, 메소드에 적용된 어노테이션의 number값 만큼 value값을 출력하는 메소드 실행
            printLine(printAnnotaion);

            // 메소드 호출
            method.invoke(new Service());

            // 설정 정보를 이용해서 선 출력
            printLine(printAnnotaion);

           
        }
    }

    public static void printLine(PrintAnnotaion printAnnotaion){
        if(printAnnotaion != null){
            // number 속성값 얻기
            int number = printAnnotaion.number();
            for(int i = 0; i < number; i++){
                // value 속성값 얻기
                String value = printAnnotaion.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
