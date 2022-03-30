import java.util.Scanner;

public class URI2137 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int cases = in.nextInt();
            String[] arr = new String[cases];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.next();
            }
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr.length; j++){
                    int f = Integer.parseInt(arr[i]);
                    int s = Integer.parseInt(arr[j]);
                    if (f < s){
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }
    }
}
