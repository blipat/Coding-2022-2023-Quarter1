import java.util.*;
import java.awt.*;

public class TurtleDebug
{
  public static void main(String[] args)
  {
      World w = new World(300,1000);
      Turtle t0 = new Turtle(w);
      Turtle t1 = new Turtle(w);
      Turtle t2 = new Turtle(100, 50, w);
      t0.forward();
      t1.turnRight();
      t2.turnLeft();
      w.show(true);
  }
}