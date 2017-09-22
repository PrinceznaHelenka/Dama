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
        for (i = 0; i<8; i++) {
            for (j = 0; j<8; j++) {
              boardOfField [i][j] = new Field(i,j);

            }
        }


    }

    public void generateFields(){

    }
    public void generateStones(){

    }
}
