import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;

        int let = 0;
        boolean isFirst = true, isSpace = false;
        int num, length = 0;
        char[] ch = new char[length];
        while ((num = in.nextInt()) != 0) {
            if (!isFirst) {
                System.out.println();
            }
            String[] words = new String[num];
            isFirst = false;
            for (int i = 0; i < num; i++) {
                String l = in.nextLine();

                for (int j = 0; j < l.length(); j++) {
                    if (Character.isLetter(l.charAt(j))) {
                        isSpace = true;
                    }
                    if (isSpace && l.charAt(j) == ' ') {
                        count++;
                    }
                    if (count == 1) {
                        let = l.length();
                    }
                    words[j] += l;
                }
            }
           for(String i : words){
               System.out.println(i);
           }
        }




    }
}
