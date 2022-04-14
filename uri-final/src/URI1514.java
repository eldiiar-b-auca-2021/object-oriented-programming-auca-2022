import java.util.Scanner;

public class URI1514 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            boolean nobodySolvedAtAll = true;
            boolean everyoneSolvedAtLeastOne = true;
            boolean everyProblemSolved = true;
            boolean noProblemSolvedByEveryone = true;
            int numContestants = in.nextInt();
            int numProblems = in.nextInt();
            if (numContestants == 0 && numProblems == 0) {
                break;
            }
            int[] counters = new int[numProblems];
            int sum = 0;
            for (int i = 0; i < numContestants; i++) {
                sum = 0;
                for (int j = 0; j < numProblems; j++) {
                    int r = in.nextInt();
                    sum += r;
                    counters[j] += r;
                }
                if (sum == numProblems) {
                    nobodySolvedAtAll = false;
                }
                if (sum == 0) {
                    everyoneSolvedAtLeastOne = false;
                }
            }
            for (int c : counters) {
                if (c == 0) {
                    everyProblemSolved = false;
                }
                if (c == numContestants){
                    noProblemSolvedByEveryone = false;
                }
            }
            int res = 0;
            res += nobodySolvedAtAll ? 1 : 0;
            res += everyoneSolvedAtLeastOne ? 1 : 0;
            res += everyProblemSolved ? 1 : 0;
            res += noProblemSolvedByEveryone ? 1 : 0;
            System.out.println(res);
        }
    }
}