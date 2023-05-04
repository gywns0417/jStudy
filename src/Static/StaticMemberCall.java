package Static;

public class StaticMemberCall {
    double result1 = 10 * 10 * StaticMember.pi;
    int result2 = StaticMember.plus(1, 5);

    StaticMember in2 = new StaticMember();

    double result3 = 10 * 10 * in2.pi;
    int result4 = in2.plus(5,6);
}
