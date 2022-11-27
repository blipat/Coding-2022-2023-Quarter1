import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFirstDesktopApp {
  public static void main(String[] args) {
    // A JFrame is a window where we can design our UI
    JFrame frame = new JFrame("My app");
    frame.setSize(500, 500);
    frame.setLayout(null);

    // create a Button and a Label
    JButton helloButton = new JButton("Click Me!");
    JLabel outputLabel = new JLabel();

    JButton byeButton = new JButton("Don't Click Me!");

    // place and size for components
    // setBounds(x position, y position, width, height)
    helloButton.setBounds(100, 100, 150, 50);
    outputLabel.setBounds(100,200,300,50);
    outputLabel.setFont(new Font("Arial", Font.PLAIN, 24));
    outputLabel.setForeground(Color.BLUE);

    byeButton.setBounds(300, 100, 150, 50);
  
    // add components to JFrame f
    frame.add(helloButton);
    frame.add(byeButton);
    frame.add(outputLabel);
    
    // add event listener for button click
    helloButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("Hello World!");
      }    });

    byeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("Goodbye World!");
      }    });
    
    // make the frame visible
    frame.setVisible(true);
  }
}
