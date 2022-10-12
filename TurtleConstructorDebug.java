import java.util.*;
import java.awt.*;

public class TurtleConstructorDebug
{
  public static void main(String[] args)
  {
      World world2 = new World(300,500);
      Turtle t0 = new Turtle(world2);
      Turtle t1 = new Turtle(world2);
      Turtle t2 = new Turtle(100, 50, world2);
      t0.forward();
      t1.turnRight();
      t2.turnLeft();
      world2.show(true);
  }
}