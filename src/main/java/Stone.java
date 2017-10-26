import java.awt.*;
import java.lang.reflect.Field;


//abstraktní třída
public class Stone {
    Color color;
    int x;
    int y;

    Integer numberOfStones;

    public Stone(Integer numberOfStone, Color color) {
        this.numberOfStones = numberOfStone; // pluje z radku 54 GameBoard
        this.color = color;

         //pluje z radku 60-64 - getColorOfTheStone - GameBoard
    }


    public void setOnGameBoard(int x, int y){

        this.x = x;
        this.y = y; //v gameboard na řádku 70 v metodě setTheStonesOnTheBoard přiřazuju konkrétní souřadnice

    }



    public  static void die(Stone setOfStones[], Integer numberOfStones){

        setOfStones[numberOfStones].setOnGameBoard(20,20);

    }



}
