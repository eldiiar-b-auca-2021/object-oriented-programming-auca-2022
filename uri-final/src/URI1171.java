import java.util.*;
public class URI1171 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();
        int[] set = new int[2000];
        for (int i = 0; i < cases; i++){
            int userInput = in.nextInt();
            set[userInput]++;
        }
        for (int j = 0; j < set.length; j++){
            if (set[j]>0){
                System.out.println(j+" aparece "+set[j]+" vez(es)");
            }
        }
    }
}