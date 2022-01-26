public class Main {
    static char[][] screen = new char[20][20];

    public static void main(String[] args) {

        initScreen();
        printScreen();

    }


    private static void initScreen() {
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                screen[i][j] = '.';
            }
        }
    }

    private static void printScreen() {
        for (int i = 0; i < screen.length; i++) {
            System.out.println();
            for (int j = 0; j < screen.length; j++) {
                System.out.print(screen[i][j]);
            }
        }
    }
}
