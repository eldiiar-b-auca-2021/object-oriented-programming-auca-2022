import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Model {
    private static int currentStateOfLevel;
    private char[][] gameStructure;
    static File file = new File("Загрузки/MiniCosmos.txt");
    static Scanner in;

    static {
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Model() throws FileNotFoundException {
        File file = new File("images/");
        Scanner in = new Scanner(file);
        switch (currentStateOfLevel){
            case 0:
            case 1:
            case 2:
            case 8:
            case 9:
                gameStructure = new char[8][8];
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                gameStructure = new char[9][8];
                break;
            case 10:
                gameStructure = new char[8][9];
                break;

        }
        while(in.hasNext()){
            System.out.println(file);
        }
    }

    public static void main(String[] args) {
        while(in.hasNext()){
            System.out.println(file);
        }
    }
    public void levelOfGame(){

    }
    public void transitionToNewLevel(){
        currentStateOfLevel++;
    }
}
