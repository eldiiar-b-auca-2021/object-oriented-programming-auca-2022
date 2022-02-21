public class Screen {

    private char[][] data; // field
    private int width;
    private int height;
    public Screen (int aWidth, int aHeight) {
        if (aWidth <= 0 || aHeight <= 0) {
            throw new RuntimeException("Screen constructor: Incorrect size " + aHeight + ", " + aWidth);
        }
        width = aWidth;
        height = aHeight;
        data = new char[width][height];
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = '.';
            }
        }
    }
    public void print (){
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col]);
            }
            System.out.println();
        }
    }

    public void drawAt(int row, int col) {
        if (row < 0 || col >= height || col < 0 || row >= width) {
            throw new RuntimeException("Screen.drawAt:incorrect coordinates " + row + ", "+col);
        }
        data[row][col] = '*';
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
}
