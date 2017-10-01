import java.awt.*;
import java.lang.reflect.Field;

public class GameBoard {

    Field boardOfField[8][8];


    public void beginGame(){
        generateBoard();
        generateFields;
        generateStones;
    }

    public void generateBoard(){
        int i;
        int j;
        Color color;
        for (i = 0; i<8; i++) {
            for (j = 0; j<8; j++) {
              boardOfField [i][j] = new Field(i,j);

            }
        }

        getColorOfTheField(i,j){
           if (i % 2 == 0 && j % 2 == 0){
               color = Color.white;
           }
           if (i % 2 == 0 && j % 2 == 1){
               color = Color.black;
           }
           if (i % 2 == 1 && j % 2 == 0){
               color = Color.black;
           }
           if (i % 2 == 1 && j % 2 == 1){
               color = Color.white;
           }
        }
    }

    public void generateStones(){

        Stones stone = new Stones;
        


    }
}
