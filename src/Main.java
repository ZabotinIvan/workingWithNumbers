import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList = positiveNumberFilter(intList);
        intList = evenNumbers(intList);
        intList.sort(Integer::compareTo);
        System.out.println(intList);

        new StreamMain();

    }
    public static List<Integer> positiveNumberFilter (List<Integer> integers){
        List<Integer> result = new ArrayList<>();
        for (int x : integers){
            if (x < 1){
                continue;
            }
            result.add(x);
        }
        return result;
    }
    public static List<Integer> evenNumbers (List<Integer> integers){
        List<Integer> integerList = new ArrayList<>();
        for (int x : integers){
            if (x % 2 != 0 ){
                continue;
            }
            integerList.add(x);
        }
        return integerList;
    }

}
