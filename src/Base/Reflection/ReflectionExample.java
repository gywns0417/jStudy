package Base.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        Class clazz = Car2.class;
        
        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors(); // 생성자 정보 읽기
        for(Constructor constructor : constructors){ // Counstructor[] 배열에서 하나씩 꺼내기
            System.out.print(constructor.getName() + "("); // Constructor[] 배열의 요소를 getName() 메소드로 프린트
            Class[] parameters = constructor.getParameterTypes(); // 생성자의 매개변수 정보를 Class[] 배열에 저장
            printParameters(parameters); // 매개변수 정보 출력
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields(); // 필드 정보 읽기
        for(Field field : fields){ // Field[] 배열에서 하나씩 꺼내기
            System.out.println(field.getName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods(); // 메소드 정보 읽기
        for(Method method : methods){ // Method[] 배열에서 하나씩 꺼내기
            System.out.print(method.getName() + "("); // 메소드 이름 프린트
            Class[] parameters = method.getParameterTypes(); // 메소드의 매개변수 정보를 Class[] 배열에 저장
            printParameters(parameters);
            System.out.println(")");
        }
    }

    // 생성자 및 메소드의 매개변수 정보 출력
    private static void printParameters(Class[] parameters){
        for(int i = 0; i < parameters.length; i++){ // 매개변수 정보 출력
            System.out.print(parameters[i].getName());
            if(i < parameters.length - 1) { 
                System.out.print(",");
            }
        }
    }
}
