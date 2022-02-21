public class Main {
    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;
    static final int SCREEN_HEIGHT = 20;
    static final int SCREEN_WIDTH = 20;
    public static void main(String[] args) {
        //class/type object/variable/value
        Screen screen = new Screen(SCREEN_WIDTH,SCREEN_HEIGHT); //constructor
        Turtle turtle = new Turtle(screen, 0, 0, Turtle.RIGHT, false);
    screen.drawAt(3, 3);
    screen.print();


    }
}
