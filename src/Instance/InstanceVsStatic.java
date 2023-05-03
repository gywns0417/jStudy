package Instance;

import java.util.Arrays;

public class InstanceVsStatic {
    int[][] arr = {{0, 1, 2, 3}, {2, 4, 6, 8}, {42, 16, 642, 51221}};
    static int[][] arrStatic = {{0, 1, 2, 3}, {2, 4, 6, 8}, {42, 16, 642, 51221}};

    public static void main(String[] args) {



        // returnOneRowInstance(); // 클래스 수준에서 바로 호출 (Error)
        returnOneRowStaticNoArugment(); // 클래스 수준에서 바로 호출
        // returnOneRowStaticArgument(arr); // 클래스 수준에서 바로 호출 (Error)
        returnOneRowStaticArgument(arrStatic); // 클래스 수준에서 바로 호출
        // returnOneRowInstanceArgument(arr); // (Error)
        // returnOneRowInstanceArgument(arrStatic); // (Error)

        // -> static 메소드는 인스턴스 생성 없이 클래스에서 바로 호출할 수 있지만,
        // static 메소드가 인자를 받을 경우, 인자 또한 static 이어야 한다.

        InstanceVsStatic instanceMain = new InstanceVsStatic();

        instanceMain.returnOneRowInstance(); //인스턴스 생성 후 호출
        instanceMain.returnOneRowStaticNoArugment(); // static 메소드를 인스턴스 참조를 이용하여 호출할려 함. 가능하지만, 불필요한
                                                     // 오버헤드(추가적인 자원 소모) 발생함. 그래서 이렇게 노란줄 뜸
        // instanceMain.returnOneRowStaticArgument(arr); //(Error)
        instanceMain.returnOneRowStaticArgument(arrStatic);
        // instanceMain.returnOneRowInstanceArgument(arr); // 인스턴스를 생성하여 호출할 수 있지만, arr이 static 변수가 아니므로
                                                        // 즉, main()이 static 이므로, arr이 static이 되어야 함. (Error)
        instanceMain.returnOneRowInstanceArgument(arrStatic);



        //static 메소드는 클래스 수준에서, non-static 메소드는 인스턴스 수준에서 호출 가능하다. -?
        // -> static 메소드는 클래스 호출 시 인스턴스 생성과 무관하게 바로 호출 가능하다.
        //non-static 메소드는 인스턴스 생성 후에 호출 가능하다.
        //따라서 static 메소드 안에서 non-static 메소드를 호출하려면, 호출할 메소드의 인스턴스를 만들어 줘야한다. 정보가 없기 때문에!
        //서로 어떨 때 사용하고 장단점은?
        //static을 사용하면 인스턴스를 생성할 필요가 없다.
    }


    int[][] returnOneRowInstance() { //인스턴스형, 인자 안받음

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
        System.out.println("static 메소드 호출");
        int a = 9;

        return arr;
    }
    //인스턴스형은 인자가 static이 아니라도, 클래스 변수라면 받아올 수 있다.

    static int[][] returnOneRowStaticNoArugment() { //static형, 인자 안받음

        for (int i = 0; i < arrStatic.length; i++) {
            System.out.println(Arrays.toString(arrStatic[i]));

        }
        System.out.println("static 메소드 호출");

        return arrStatic;
    }
    static int[][] returnOneRowStaticArgument(int[][] argument) { //static 형, 인자 받음

        for (int i = 0; i < argument.length; i++) {
            System.out.println(Arrays.toString(argument[i]));

        }
        System.out.println("static 메소드 호출");
        return argument;
    }

     //static 메소드는 인자를 받지 않으면 메소드 외부의 변수를 사용할 수 없다. (Error) 따라서, static 변수를 인자로 받아와야 사옹가능하다.


    int[][] returnOneRowInstanceArgument(int[][] argument) { // 인스턴스 형, 인자 받음

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
        System.out.println("인스턴스 메소드");
        return arr;

    }

    void noreturnColumnInstance() {
        for (int i = 0; i < arr.length; i++) {

        }
    }
}



