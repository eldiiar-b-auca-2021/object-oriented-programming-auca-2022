package prototype01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Rectangle> figures = new ArrayList<>();
        figures.add(new Rectangle(10, 10, 100, 100));
        figures.add(new Rectangle(400, 400, 100, 100));

        while(true){
            int xClick = in.nextInt();
            int yClick = in.nextInt();
            if (xClick == -1 && yClick == -1){
                break;
            }
            for (Rectangle r : figures){
                if (r.contains(xClick, yClick)){
                    System.out.println(r);
                }
            }

        }
    }
}
