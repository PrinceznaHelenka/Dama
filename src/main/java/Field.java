import java.awt.*;
import java.lang.reflect.Field;

public class Field {
  int x;
  int y;
  Color color;

  public Field(int i, int j, Color color) {
      this.x = i;
      this.y = j;
      this.color = color;
  }

  public int returnX(){
      return this.x;
  }
  public int returnY(){
      return this.y;
  }

  Stones stone = null;

  public boolean isThereAStone(){
      if (stone == null) {
          return false;
      }
      else {
          return true;
      }
  }


  public boolean isTheFieldAvailable(){

     //if (je políčko obsazený figurkou && je černý)
  }


}
