import java.awt.*;
import java.lang.reflect.Field;


//abstraktní třída
public class Stones {
    Color color;
    int x;
    int y;

    Integer numberOfStones;


    public Stones(Integer numberOfStone, Color color) {
        this.numberOfStones = numberOfStone; // pluje z radku 54 GameBoard
        this.color = color; //pluje z radku 60-64 - getColorOfTheStone - GameBoard
    }


    public static void moveTo(){

 }

  public  static void die(){

  }



}
