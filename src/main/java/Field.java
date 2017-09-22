import java.lang.reflect.Field;

public class Field {
  int x;
  int y;

  public Field(int x, int y) {
      this.x = x;
      this.y = y;
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


  }


}
