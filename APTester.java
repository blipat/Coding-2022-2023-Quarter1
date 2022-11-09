import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.lang.Math;


public class APTester {
    public static void main(String[] args){
        String lastName = "Vu";
        String otherLastName = "Lopez";
        int comparison = lastName.compareTo(otherLastName);
        System.out.println(comparison);
        double myNumber = 7.8;
        System.out.println((double) (int) myNumber*2);
        String x = "APCSA";
       // System.out.println(x*3);
       System.out.println((int) (Math.random()*100));
       String str = "I am";
       str += 10+3;
       String age = "years old";
       System.out.println(str+age);
    }
}
