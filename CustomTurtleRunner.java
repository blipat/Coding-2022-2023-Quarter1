import java.util.*;
import java.awt.*;

public class CustomTurtleRunner
{
  public static void main(String[] args)
  {
      World world1 = new World(400,400);

      // 1. Change the constructor call below to create a large
      // 150x200 CustomTurtle with a green body (Color.green)
      // and a blue shell (Color.blue) at position (150,300).
      // Move it forward to see it.
      CustomTurtle turtle1 = new CustomTurtle(world1);
      turtle1.forward();


      // 2. Create a small 25x50 CustomTurtle with a red body
      // and a yellow shell at position (350,200)
      // Move it forward to see it.


      // 3. Create a CustomTurtle of your own design

      world1.show(true);
  }
}

class CustomTurtle extends Turtle
{
   private int x;
   private int y;
   private World w;
   private Color bodycolor;
   private Color shellcolor;
   private int width;
   private int height;

 /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model or world
   */
  public CustomTurtle(ModelDisplay modelDisplay)
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }

  /** Constructor that takes the model
   * display to draw it on and custom colors and size
   * @param m the world
   * @param body : the body color
   * @param shell : the shell color
   * @param w: width
   * @param h: height
   */
  public CustomTurtle(ModelDisplay m, Color body, Color shell, int w, int h)
  {
    // let the parent constructor handle it
    super(m);
    bodycolor = body;
    setBodyColor(body);
    shellcolor = shell;
    setShellColor(shell);
    height = h;
    width = w;
    setHeight(h);
    setWidth(w);
  }

/** Constructor that takes the x and y and a model
   * display to draw it on and custom colors and size
   * @param x the starting x position
   * @param y the starting y position
   * @param m the world
   * @param body : the body color
   * @param shell : the shell color
   * @param w: width
   * @param h: height
   */
  public CustomTurtle(int x, int y, ModelDisplay m,  Color body, Color shell, int w, int h)
  {
    // let the parent constructor handle it
    super(x,y,m);
    bodycolor = body;
    setBodyColor(body);
    shellcolor = shell;
    setShellColor(shell);
    height = h;
    width = w;
    setHeight(h);
    setWidth(w);
  }
}
