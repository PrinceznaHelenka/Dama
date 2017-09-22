import java.lang.reflect.Field;


//abstraktní třída
public class Stones {
    Stones stone;
    Field field;

    String color;
    int x;
    int y;


    public Stones(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int returnX(){
        return this.x;
    }
    public int returnY(){
        return this.y;
    }

 public static void moveTo(){

 }

  public  static void die(){

  }

}
