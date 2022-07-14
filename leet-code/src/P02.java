import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = "+26t5";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        String line = s.trim();
        StringBuilder builder = new StringBuilder();

        if (line.charAt(0) == '-' && line.charAt(line.length() - 1) != '-') {
            int index = 1;
            for (int i = 0; i < line.length(); i++){
                if (i == 0){
                    continue;
                }
                if (Character.isDigit(line.charAt(i))){
                    index++;
                }else {
                    break;
                }
            }
            builder.append(line.substring(0, index));

            if (builder.length() > 0) {
                while (builder.charAt(1) == '0') {
                    builder.deleteCharAt(1);
                }
                try {
                    return Integer.parseInt(String.valueOf(builder));
                } catch (IllegalArgumentException ex) {
                    return -2147483648;
                }
            }

        } else {
            int index = 0;
            if (line.charAt(0) == '+'){
                index = 1;
            }

            for (int i = 0; i < line.length(); i++) {
                if (i == 0 && index == 1) {
                    continue;
                }
                if (Character.isDigit(line.charAt(i))) {
                    builder.append(line.charAt(i));
                    index++;
                } else {
                    break;
                }
            }


            if (builder.length() > 0) {
                while (builder.charAt(1) == '0') {
                    builder.deleteCharAt(1);
                }
                try {
                    return Integer.parseInt(String.valueOf(builder));
                } catch (IllegalArgumentException ex) {
                    return 2147483647;
                }
            }
        }
        return 0;
    }
}

