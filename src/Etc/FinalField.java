package Etc;

public class FinalField {

    final String nation = "대한민국";
    final String ssn;

    String name; //이름은 개명 가능

    public FinalField(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
    
}
