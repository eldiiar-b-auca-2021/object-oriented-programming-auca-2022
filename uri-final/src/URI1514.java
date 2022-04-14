import java.util.Scanner;

public class URI1514 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            int numContestants = in.nextInt();
            int numProblems = in.nextInt();
            if (numContestants == 0 && numProblems == 0) {
                break;
            }
            int[][] counters = new int[numContestants][numProblems];
            for (int i = 0; i < numContestants; i++){
                for (int j = 0; j < numProblems; j++) {
                    counters[i][j] = in.nextInt();
                }
            }
            int sum = 0, n = 0, aN = 0, allProblems = 0;
            boolean noProblemSolvedByEveryone = false;
            boolean everyoneSolvedAtLeastOne = false;
            boolean everyProblemSolvedAtLeastByOne = false;
            for (int i = 0 ; i < numContestants; i++){
                for (int j = 0; j < numProblems; j++){
                    sum += counters[i][j];
                }
                if (sum > 0){
                    n++;
                }
                if (sum == 0){
                    aN++;
                }
                if (sum == numProblems){
                    everyProblemSolvedAtLeastByOne = true;
                    allProblems++;
                }
                sum = 0;
            }
            if (n == numProblems){
                everyoneSolvedAtLeastOne = true;
            }
            if (aN == numContestants){
                noProblemSolvedByEveryone = true;
            }
            int res = 0;
            if (allProblems != 3){
                res += 1;
            } else {
                res += 0;
            }
            res += everyoneSolvedAtLeastOne ? 1 : 0;
            res += noProblemSolvedByEveryone ? 1 : 0;
            res += everyProblemSolvedAtLeastByOne ? 1 : 0;
            System.out.println(res);
        }
    }
}