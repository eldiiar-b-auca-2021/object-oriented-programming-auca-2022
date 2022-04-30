package prototype04;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Figure> figures = Utils.createFigures();
        while (true) {
            System.out.print("cmd: ");
            String cmd = in.nextLine();
            switch (cmd) {
                case "ShowAll":
                    for (Figure f : figures) {
                        System.out.println(f);
                    }
                    break;
                case "Click":
                    System.out.print("x: ");
                    int xClick = in.nextInt();
                    System.out.print("y: ");
                    int yClick = in.nextInt();
                    for (Figure f : figures){
                        if (f.contains(xClick, yClick)) {
                            System.out.println(f);
                        }
                    }
                    break;
                case "Move":
                    System.out.print("x1: ");
                    int x1 = in.nextInt();
                    System.out.print("y1: ");
                    int y1 = in.nextInt();
                    System.out.print("x2: ");
                    int x2 = in.nextInt();
                    System.out.print("y2: ");
                    int y2 = in.nextInt();
                    for (Figure f : figures){
                        if (f.contains(x1, y1)){
                            f.move(x2-x1, y2-y1);
                        }
                    }
                    break;
                case "Stop":
                    return;
            }


            }
        }
    }
