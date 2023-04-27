public class ConstructorExam {
    String nation = "대한민국";
    String name;
    String ssn;

    public static void main(String[] args){
        ConstructorExam k1 = new ConstructorExam("킹효준", "000000-1234567");
        ConstructorExam k2 = new ConstructorExam("킹투", "000001-1231411");


    }

    public ConstructorExam(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
        System.out.println(name);
        System.out.println(ssn);

    }


}
