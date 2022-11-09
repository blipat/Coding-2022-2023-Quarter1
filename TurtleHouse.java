import java.util.*;
import java.awt.*;

public class TurtleHouse
{
  public static void main(String[] args)
  {


    World world1 = new World(1000,1000);

    CustomTurtle turtle1 = new CustomTurtle(world1, Color.black, Color.black, 10, 10);
    turtle1.forward();
    turtle1.turnRight();
    turtle1.forward();
    turtle1.turnRight();
    turtle1.forward();
    turtle1.turnRight();
    turtle1.forward();

    CustomTurtle turtle2 = new CustomTurtle(world1, Color.magenta, Color.magenta, 10, 10);
    turtle2.penUp();
    turtle2.moveTo(540, 500);
    turtle2.penDown();
    turtle2.forward(35);
    turtle2.turnRight();
    turtle2.forward(25);
    turtle2.turnRight();
    turtle2.forward(35);
    
    CustomTurtle turtle3 = new CustomTurtle(world1, Color.blue, Color.blue, 10, 10);
    turtle3.penUp();
    turtle3.moveTo(560, 440);
    turtle3.penDown();
    turtle3.forward(20);
    turtle3.turnRight();
    turtle3.forward(15);
    turtle3.turnRight();
    turtle3.forward(15);
    turtle3.turnRight();
    turtle3.forward(20);


  
    CustomTurtle turtle4 = new CustomTurtle(world1, Color.blue, Color.blue, 10, 10);
    turtle4.penUp();
    turtle4.moveTo(500, 400);
    turtle4.penDown();
    turtle4.turn(30);
    turtle4.forward();
    turtle4.turn(120);
    turtle4.forward();


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