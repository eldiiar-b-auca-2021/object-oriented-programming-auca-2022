import java.util.Scanner;

public class URI1285 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while(inp.hasNextInt()){
            int F = inp.nextInt();
            int S = inp.nextInt();
            int count = 0;
            for (int i = F; i <= S; i++){
                if ((matches(i))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean matches(int i) {
        String n = Integer.toString(i);
        for (int j = 0; j < n.length(); j++){
            for (int k = j+1; k < n.length(); k++){
                if (n.charAt(j) == n.charAt(k)){
                    return false;
                }
            }
        }
        return true;
    }
}
