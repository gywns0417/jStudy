import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiDimensionalArray {

    int[][] arr = {{0, 1, 2, 3}, {2, 4, 6, 8}, {42, 16, 642, 51221}};

    public static void main(String[] args) {
        /* Todo: 1. 2차원 배열의 행 반환하기 o
    Todo: 2. 2차원 배열의 열 반환하기 o
    Todo: 3. 2차원 배열의 행, 열 길이 반환하기 o
   Todo: 4. 행의 합, 열의 합 구하기 o
    5. 문자열로 반환하기 o
    6. 모든 요소 꺼내서 배열에 넣기 o
    7. 위의 모든 걸 스트림으로 해보기 o
    //return문은 print로 대체함
 */
        MultiDimensionalArray instance = new MultiDimensionalArray();
        int[][] arr = instance.arr;
        instance.printRowForEach(arr);
        instance.printRowFor(arr);
        instance.printColForEach(arr);
        instance.printColFor(arr);
        instance.printLength(arr);
        instance.printRowSum(arr);
        instance.printColSum(arr);
        instance.printArray();
        instance.streamAll();
    }

    void printRowForEach(int[][] arr) {
        System.out.println("---------------------- 행 반환_for-each 문");
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }

    void printRowFor(int[][] arr) {
        System.out.println("---------------------- 행 반환_for문");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    //----------------------------------
    void printColForEach(int[][] arr) {
        System.out.println("---------------------- 열 반환_for-each 문");
        for (int[] a : arr) {
            for (int b : a) {
                System.out.println(String.valueOf(b));
            }
        }
    }

    void printColFor(int[][] arr) {
        System.out.println("---------------------- 열 반환_for문");
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                System.out.println(String.valueOf(arr[i][k]));
            }
        }
    }
    //----------------------------------

    void printLength(int[][] arr) {
        System.out.println("---------------------- 행열 길이 반환_for-each 문");
        System.out.println("행의 길이 : " + arr.length);
        for (int[] a : arr) {
            System.out.printf("열의 길이 : %s%n", a.length);
        }

    }

    //----------------------------------
    void printRowSum(int[][] arr) {
        System.out.println("---------------------- 행의 합 반환_for-each문");
        int sum = 0;
        int[] result = new int[arr.length];
        int i = 0;

        for (int[] a : arr) {
            for (int b : a) {
                sum += b;

            }
            result[i] = sum;
            System.out.printf("%s번째 행의 합 : %s%n", i, result[i]);
            i++;
        }
        System.out.println("배열화 : " + Arrays.toString(result));
    }

    void printColSum(int[][] arr) {
        System.out.println("---------------------- 열의 합 반환_for문+List");
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;

        for (int k = 0; k < arr[0].length; k++){
            for (int i = 0; i < arr.length; i++) { //k :0~2 //// i : 0~3 (length)
                sum += arr[i][k]; //0,0 + 1,0 + 2,0, //0,1 + 1,1 + 2,1
            }

            result.add(sum);
            sum = 0;
            System.out.println("각 열의 합: " + result.get(k));
        }
        System.out.println("리스트화 : " + Arrays.toString(result.toArray()));

    }
    // int[][] arr = {{0, 1, 2, 3}, {2, 4, 6, 8}, {42, 16, 642, 51221}};

    void printArray(){
        System.out.println("---------------------- 모든 요소 배열에 넣기");
        ArrayList<Integer> result = new ArrayList<>();
        for(int[] a : arr){
            for(int b : a){
                result.add(b);
            }
        }
        System.out.println("모든 요소 리스트화 : " + Arrays.toString(result.toArray()));
    }


    void streamAll() {
        Stream<int[]> stream = Stream.of(arr);
        System.out.println("---------------------- 스트림_모든 행 출력");
        stream.forEach(m -> System.out.println(Arrays.toString(m))); //m = arr을 스트림화 한 요소. 여기서는 arr[][]의 요소들,
        // 행들이다. 행들이 m이 되어 하나씩 다 출력하게 한다. 이 m은
        // 1차원 배열이므로, Arrays.toString()을 사용한다.
        System.out.println("---------------------- 스트림_모든 열 출력");
        IntStream.range(0, arr[0].length)
                .mapToObj(m -> Arrays.stream(arr).mapToInt(row -> row[m]))
                .forEach(col -> System.out.println(Arrays.toString(col.toArray())));

        System.out.println("---------------------- 스트림_행, 열 길이 출력");

        System.out.println("행의 길이 : " + Arrays.stream(arr).count());

        long rr = IntStream.range(0, arr[0].length).mapToObj(m -> Arrays.stream(arr).mapToInt(r -> r[m]))
                .count();

        System.out.println("열의 길이 : " + rr);

        System.out.println("---------------------- 스트림_행의 합 출력");
        Stream.of(arr).mapToInt(m -> Arrays.stream(m).sum())
                .forEach(m -> System.out.println(m));
        System.out.println("---------------------- 스트림_열의 합 출력");
       IntStream.range(0, arr[0].length)
               .map(m -> Arrays.stream(arr).mapToInt(row -> row[m]).sum()) //스트림화 한 arr의 행에서 m번째 요소들만을 모아
               .forEach(System.out::println);                              //합한 것을 intstream의 m번째 요소로 넣고, print한다.
        System.out.println("---------------------- 스트림_모든 요소 문자열 출력");                             // int형식으로 출력이라 따로 변환 필요없다.
        Arrays.stream(arr).flatMapToInt(Arrays::stream)
                .forEach(m -> System.out.println(Integer.toString(m)));
        System.out.println("---------------------- 스트림_모든 요소 배열 넣기 출력");
        System.out.println(Arrays.toString(Arrays.stream(arr).flatMapToInt(Arrays::stream)
                .toArray()));
        System.out.println("---------------------- 스트림_모든 요소 배열 넣기 출력_리팩토링");
        int[] flatArr = Arrays.stream(arr).flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println(Arrays.toString(flatArr));







    }
}


