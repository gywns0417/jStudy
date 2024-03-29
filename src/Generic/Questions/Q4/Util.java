package Generic.Questions.Q4;

public class Util {

// 다음 Util 클래스의 정적 getValue() 메소드는 첫 번째 매개값으로 Pair 타입과 하위 타입만 받고, 두 번째 매개값으로 키값을 받는다. 리턴값은 키값이 일치할 경우 Pair에 저장된 값을 리턴하고,
// 일치하지 않으면 null을 리턴하도록 Util 클래스와 getValue() 제네릭 메소드를 작성하라.
    public static <K, V> V getValue(Pair<K,V> p, K k){
        if(p.getKey() == k){
            return p.getValue();
        } else {
            return null;
        }
    }

}
