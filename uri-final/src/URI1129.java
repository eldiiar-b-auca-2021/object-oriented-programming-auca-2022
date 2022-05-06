import java.util.Scanner;

public class URI1129 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            int num = in.nextInt();
            if (num == 0){
                break;
            }
            String answer = "ABCDE";
            in.nextLine();
            int count = 0, index = 0;
            for (int i = 0; i < num; i++){
                count = 0;
                String[] line = in.nextLine().split(" ");
                for (int j = 0; j < line.length; j++){
                    int n = Integer.parseInt(line[j]);
                    if (n <= 127){
                        count++;
                        index = j;
                    }
                }
                if (count == 1){
                    System.out.println(answer.charAt(index));
                }else {
                    System.out.println("*");
                }
            }
        }
    }
}
