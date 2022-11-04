import java.util.*;
import java.awt.*;
import java.lang.Math;


public class returnValues {
    public static void main(String[] args){
        World world = new World(300,300);
        Turtle yertle = new Turtle(world);
        System.out.println("Yertle's width is: " + yertle.getWidth());
        yertle.setWidth(20);
        yertle.setHeight(20);
        System.out.println("Yertle's width is: " + yertle.getWidth());
        yertle.turnRight();

        Turtle bertle = new Turtle(world);
        int area;
        area = bertle.getWidth() * bertle.getHeight();
        System.out.println("Bertle's area is: " + area);

        bertle.penUp();
        bertle.moveTo(10,10);
        bertle.penDown();
        bertle.moveTo(290,10);
        bertle.moveTo(290,290);
        bertle.moveTo(10,290);
        bertle.penUp();
        bertle.moveTo(100,10);
        bertle.penDown();
        bertle.moveTo(200,10);
        bertle.moveTo(200,250);
        bertle.moveTo(100,250);



        world.show(true);





    }
}