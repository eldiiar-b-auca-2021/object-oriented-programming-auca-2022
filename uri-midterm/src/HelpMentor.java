import java.util.Scanner;

public class HelpMentor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int i = 0; i < testCases; i++){
            int numOfAllStudents = in.nextInt();
            int requirement = in.nextInt();
            int[] holder = new int[numOfAllStudents];
            int count = 0;
            for (int j = 0; j < numOfAllStudents; j++){
                holder[j] = in.nextInt();
                if (holder[j] <= 0){
                    count++;
                }
            }
            if (count >= requirement){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
