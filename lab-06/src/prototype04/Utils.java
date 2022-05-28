package prototype04;

import java.util.ArrayList;

public class Utils {
    
    public static ArrayList<Figure> createFigures() {
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Rect(10, 10, 100, 100));
        figures.add(new Rect(400, 400, 100, 100));
        figures.add(new Circle(500, 10, 100));
        figures.add(new Circle(800, 800, 100));
        figures.add(new Cross(700, 10, 20, 100));
        return figures;
    }
}
