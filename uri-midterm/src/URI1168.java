import java.util.Scanner;

public class URI1168 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int i = 0;
        while (i < number) {
            String symbols = in.next();
            int nLeds = 0;
            for (int j = 0; j < symbols.length(); j++) {
                switch (symbols.charAt(j)) {
                    case '0':
                    case '6':
                    case '9':
                        nLeds+=6;
                        break;
                    case '2':
                    case '5':
                    case '3':
                        nLeds+=5;
                     break;
                    case '4':
                        nLeds+=4;
                        break;
                    case '7':
                        nLeds+=3;
                        break;
                    case '8':
                        nLeds+=7;
                        break;
                    case '1':
                        nLeds+=2;
                }
            }
            System.out.printf("%d leds\n", nLeds);
            i++;
        }
    }
}
