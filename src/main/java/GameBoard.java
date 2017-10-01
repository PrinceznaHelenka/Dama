import java.awt.*;
import java.lang.reflect.Field;

public class GameBoard {

    Field boardOfField[8][8];
    Field field;
    Stones setOfStones[16];

    int i;
    int j;
    Color color;

    Integer numberOfTheStone;

    Stones stone = new Stones;


    public void beginGame(){
        generateBoard();
        generateStones();

    }

    public void generateBoard() {

        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                boardOfField[i][j] = new Field(i, j, getColorOfTheField(i, j));

            }
        }
    }

    public Color getColorOfTheField(int i, int j) {
        if (i % 2 == 0 && j % 2 == 0) {
            return Color.white;
        }
        if (i % 2 == 0 && j % 2 == 1) {
            return Color.black;
        }
        if (i % 2 == 1 && j % 2 == 0) {
            return Color.black;
        }
        if (i % 2 == 1 && j % 2 == 1) {
            return Color.white;
        }
    }

    }

    public void generateStones() {

        for (numberOfTheStone = 0; numberOfTheStone < 16; numberOfTheStone++) {
            setOfStones[numberOfTheStone] = new Stones(numberOfTheStone, getColorOfTheStone(numberOfTheStone));

            //do setOfSt dej kaminky s cislem a barvickou
        }
    }

    public Color getColorOfTheStone(Integer numberOfTheStone) {
        if (numberOfTheStone < 8) {
            return Color.white;
        } else {
            return Color.black;
        }
    }

    public void setTheStonesOnTheBoard(){

        setOfStones[numberOfTheStone].color


    }





}
