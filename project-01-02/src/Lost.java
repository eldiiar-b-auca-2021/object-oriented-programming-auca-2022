public class Lost {
    Game2048 game = new Game2048();
    public boolean youLost(){
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                if (game.getCoordinates(i,j) == game.getCoordinates(i, j+1)){
                    return false;
                }
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                if (game.getCoordinates(j,i) == game.getCoordinates(j+1,i)){
                    return false;
                }
            }
        }
        return true;
    }
}
