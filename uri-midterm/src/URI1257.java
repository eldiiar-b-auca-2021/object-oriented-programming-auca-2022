import java.util.Scanner;

public class URI1257 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numOfTestCases = in.nextInt();

        for (int i = 0; i < numOfTestCases; i++){
            int howManyStrings = in.nextInt();
            String[] strings = new String[howManyStrings];

            for (int j = 0; j < strings.length; j++) {
                strings[j] = in.next();
            }

            int count = 0;
            int anotherCount = 0;
            for (String j : strings) {
                anotherCount++;
                for (int k = 0; k < j.length(); k++) {
                    char c = Character.toUpperCase(j.charAt(k));
                    count += (int)c - 'A';
                    count += k;
                    count += anotherCount;
                }
            }
            System.out.println(count);
        }
    }
}
