import java.util.ArrayList;
import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int newV = 0;
        while(x != 0){
            newV = (x % 10)+ newV * 10;
            x = x / 10;

        }
        System.out.println(newV);
    }
}
