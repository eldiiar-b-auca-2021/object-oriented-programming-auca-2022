import java.util.Scanner;

public class URI1196 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        char[] ch = keyboard.toCharArray();
        while (in.hasNextLine()){
            char[] userInput = in.nextLine().toCharArray();
            StringBuilder builder = new StringBuilder();
            for (char r : userInput){
                int index = keyboard.indexOf(r);
                if(index != -1) {
                    builder.append(ch[index - 1]);
                }else {
                    builder.append(r);
                }
            }
            System.out.println(builder);
            builder.delete(0, builder.length());
        }
    }
}
