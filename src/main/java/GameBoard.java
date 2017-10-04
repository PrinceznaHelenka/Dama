import java.awt.*;
import java.lang.reflect.Field;

public class GameBoard {

    Field boardOfField[8][8];
    Stone setOfStones[16];

    int i;
    int j;

    Integer numberOfTheStone;



    public void beginTheGame(){
        generateBoard();
        generateStones();
        setTheStonesOnTheBoard();

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
            setOfStones[numberOfTheStone] = new Stone(numberOfTheStone, getColorOfTheStone(numberOfTheStone));

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
        int m;
        int n;
        for (m = 0; m<4; m++) {
            setOfStones[m].setOnGameBoard(2*m, 0);
        }
        for (m = 0, n = 4; m<4 && n<8; m++, n++){
            setOfStones[n].setOnGameBoard(2*m+1, 1);
        }
        for (m = 0, n = 8; m<4 && n<12; m++, n++){
            setOfStones[n].setOnGameBoard(2*m, 6);
        }
        for (m = 0, n = 12; m<4 && n<16; m++, n++){
            setOfStones[n].setOnGameBoard(2*m+1, 7);
        }

       //  setOfStones[0].setOnGameBoard(0,0);


    }


    }
