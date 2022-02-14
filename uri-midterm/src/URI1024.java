import java.util.Scanner;

public class URI1024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
           char[] a = in.nextLine().toCharArray();
           for (int j = 0; j < a.length; j++) {
               int decimal = (a[j]);
               if (decimal >= 65 && decimal <= 90 || decimal >= 97 && decimal <= 122){
                   a[j] = (char) (decimal+3);
               }
           }
           for (int k = 0;  k < a.length/2; k++) {
               char temp = a[k];
               a[k] = a[a.length-1-k];
               a[a.length-1-k] = temp;
           }
           for (int k = a.length/2; k < a.length; k++) {
              a[k] = (char) (a[k]-1);

           }
            System.out.println(a);
           }
        }
    }

