import java.util.*;

public class P01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       try {
           int[] arr = new int[]{1, 2, 3, 4, 5};
           int userInput = in.nextInt();
           int[] result = find(arr, userInput);
           System.out.println(Arrays.toString(result));
       }catch (IllegalArgumentException ex){
           System.out.println(ex.getMessage());
       }
    }

    private static int[] find(int[] arr, int userInput) {
        Map<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            list.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++){
            int requiredNum = userInput- arr[i];
            if (list.containsKey(requiredNum)){
                return new int[]{i, list.get(requiredNum)};
            }
        }
        throw new IllegalArgumentException("No Solution");
    }
}
