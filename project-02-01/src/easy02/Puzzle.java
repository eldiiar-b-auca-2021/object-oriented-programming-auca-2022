package easy02;

import javax.swing.*;

public class Puzzle {
    private int robotRow;
    private int robotCol;
    private int cellWidth;
    private int cellHeight;
    private char[][] data;
    private boolean isRobotOnRed;
    private boolean hasWon;
    int moves;
    private int currentLevel;
    private int goalRow;
    private int goalCol;
    String[] level;
    Puzzle(String[] level){

        cellWidth = level[0].length();
        cellHeight = level.length;
        data = new char[cellWidth][level.length];
        for (int r = 0; r < level.length; r++){
            for (int c = 0; c < level[r].length(); c++){
                data[r][c] = level[r].charAt(c);
                if (data[r][c] == '@'){
                    robotRow = r;
                    robotCol = c;
                }
                if (data[r][c] == '.'){
                    goalRow = r;
                    goalCol = c;
                }
            }
        }
    }

    public void moveLeft() {
        if (data[robotRow][robotCol-1] != '#' && data[robotRow][robotCol-1] != '$'){
            robotCol--;
            data[robotRow][robotCol] = '@';
            if ((robotRow) == goalRow && (robotCol+1) == goalCol) {
                data[robotRow][robotCol + 1] = '.';
            }else {
                data[robotRow][robotCol + 1] = ' ';
            }
        }else if (data[robotRow][robotCol-1] == '$' && data[robotRow][robotCol-2] != '#'){
            robotCol--;
            data[robotRow][robotCol] = '@';
            if ((robotRow) == goalRow && (robotCol+1) == goalCol){
                data[robotRow][robotCol+1] = '.';
            }else {
                data[robotRow][robotCol+1] = ' ';
            }
            data[robotRow][robotCol-1] = '$';
        }
        moves++;
        checkForWin();
    }

    public void moveRight() {
        if (data[robotRow][robotCol+1] != '#' && data[robotRow][robotCol+1] != '$'){
            robotCol++;
            data[robotRow][robotCol] = '@';
            if ((robotRow) == goalRow && (robotCol-1) == goalCol){
                data[robotRow][robotCol-1] = '.';
            }else {
                data[robotRow][robotCol-1] = ' ';
            }
        }else if (data[robotRow][robotCol+1] == '$' && data[robotRow][robotCol+2] != '#'){
            robotCol++;
            data[robotRow][robotCol] = '@';
            if ((robotRow) == goalRow && (robotCol-1) == goalCol){
                data[robotRow][robotCol-1] = '.';
            }else {
                data[robotRow][robotCol-1] = ' ';
            }
            data[robotRow][robotCol+1] = '$';
        }
        moves++;
        checkForWin();
    }

    public void moveUp() {
        if (data[robotRow - 1][robotCol] != '#' && data[robotRow - 1][robotCol] != '$') {
            robotRow--;
            data[robotRow][robotCol] = '@';
            if ((robotRow + 1) == goalRow && robotCol == goalCol) {
                data[robotRow + 1][robotCol] = '.';
            } else {
                data[robotRow + 1][robotCol] = ' ';
            }
        } else if (data[robotRow - 1][robotCol] == '$' && data[robotRow - 2][robotCol] != '#') {
            robotRow--;
            data[robotRow][robotCol] = '@';
            if ((robotRow + 1) == goalRow && robotCol == goalCol) {
                data[robotRow + 1][robotCol] = '.';
            } else {
                data[robotRow + 1][robotCol] = ' ';
            }
            data[robotRow - 1][robotCol] = '$';
        }
        moves++;
        checkForWin();
    }

    public void moveDown() {
        if (data[robotRow + 1][robotCol] != '#' && data[robotRow + 1][robotCol] != '$') {
            robotRow++;
            data[robotRow][robotCol] = '@';
            if (robotRow - 1 == goalRow && robotCol == goalCol) {
                data[robotRow - 1][robotCol] = '.';
            } else {
                data[robotRow - 1][robotCol] = ' ';
            }
        } else if (data[robotRow + 1][robotCol] == '$' && data[robotRow + 2][robotCol] != '#') {
            robotRow++;
            data[robotRow][robotCol] = '@';
            if (robotRow - 1 == goalRow && robotCol == goalCol) {
                data[robotRow - 1][robotCol] = '.';
            } else {
                data[robotRow - 1][robotCol] = ' ';
            }
            data[robotRow + 1][robotCol] = '$';
        }
        moves++;
        checkForWin();
    }

    public int getRobotRow() {
        return robotRow;
    }

    public int getRobotCol() {
        return robotCol;
    }

    public int getCellWidth() {
        return cellWidth;
    }

    public int getCellHeight() {
        return cellHeight;
    }

    public char elementAt(int r, int c) {
        return data[r][c];
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getMoves() {
        return moves;
    }

    public int getGoalRow() {
        return goalRow;
    }

    public int getGoalCol() {
        return goalCol;
    }


    public boolean checkForWin(){
        for (int i = 0; i < cellHeight; i++){
            for (int j = 0; j< cellWidth; j++){
                if (data[i][j] == '$' && goalRow == i && j == goalCol) {
                    return true;
                }
            }
        }
        return false;
    }
}
