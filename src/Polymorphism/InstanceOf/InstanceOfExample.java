package Polymorphism.InstanceOf;

public class InstanceOfExample {
    //main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person){
        System.out.println("name : " + person.name);
        person.walk();

        //person이 참조하는 객체가 Student 타입인지 확인
        if(person instanceof Student){
            Student student = (Student) person;
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }

        //person이 참조하는 객체가 Student 타입일 경우
        //student 변수에 대입(타입 변환 발생) (Java 12 부터 사용 가능)
        if(person instanceof Student student){
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        //Person 객체를 매개값으로 제공하고 personInfo() 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);

        //Student 객체를 매개값으로 제공하고 personInfo() 호출
        Person p2 =  new Student("홍길동2", 1);
        personInfo(p2);




    }
}
