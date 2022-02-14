import java.util.Scanner;

public class URI1235 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            String result = changer(line);
            String firstStr = "";
            for (int j = result.length()-1; j >= 0; j-- ) {
                firstStr+=result.charAt(j);
            }
            String secondRes = anotherChanger(line);
            String secondStr = "";
            for (int k = secondRes.length()-1; k >= 0; k--) {
                secondStr+=secondRes.charAt(k);
            }
            String answer = firstStr+secondStr;
            System.out.println(answer);
        }

    }
    public static String changer(String line) {
        String firstHalf = line.substring(0,line.length()/2);

        return firstHalf;
    }
    public static String anotherChanger(String line) {
        String secondHalf = line.substring(line.length()/2);
        return secondHalf;
    }

}
