import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingTextField {
  public static void main(String[] args) {
    // A JFrame is a window where we can design our UI
    JFrame frame = new JFrame("My app");
    frame.setSize(500, 500);
    frame.setLayout(null);

    // create a Labels, Button, and TextField
    JLabel inputLabel = new JLabel();
    JButton submitButton = new JButton("submit"); //edit this
    JLabel outputLabel = new JLabel();
    JTextField  testField = new JTextField(15);

    // place and size for components
    inputLabel.setBounds(100,50,300,50);
    inputLabel.setFont(new Font("Arial", Font.PLAIN, 18)); //edit this
    inputLabel.setForeground(Color.BLACK); //edit this 
    inputLabel.setText(" Type your name below:"); //edit this

    testField.setBounds(100, 100, 150, 50);

    submitButton.setBounds(100, 150, 150, 50);

    outputLabel.setBounds(100,200,300,50);
    outputLabel.setFont(new Font("Arial", Font.PLAIN, 18)); //edit this
    outputLabel.setForeground(Color.RED); //edit this
    
    // add components to JFrame f
    frame.add(inputLabel);
    frame.add(testField);
    frame.add(submitButton);
    frame.add(outputLabel);
    
    // add event listener for button click
    submitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String userInput = testField.getText();
        outputLabel.setText(" Hello, " + userInput); //edit this
        // add code here
      }    });

    // make the frame visible
    frame.setVisible(true);
  }
}
