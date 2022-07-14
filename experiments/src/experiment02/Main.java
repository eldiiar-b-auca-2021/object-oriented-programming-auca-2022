package experiment02;

public class Main {
    public static void main(String[] args) {
        Car kamaz = new Kamaz();
        Car lexus = new Lexus();
        move(kamaz);
        move(lexus);
    }
    public static void move(Car cars){
        cars.drive();
    }
}
