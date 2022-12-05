import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingTextField {
  public static void main(String[] args) {
    // A JFrame is a window where we can design our UI
    JFrame frame = new JFrame("My app");
    frame.setSize(900, 600);
    frame.setLayout(null);

    // create a Labels, Button, and TextField
    JLabel goalLabel = new JLabel();
    JTextField goalField = new JTextField(15);
    JLabel actualLabel = new JLabel();
    JTextField actualField = new JTextField(15);
    JButton inputButton = new JButton("submit");
    JLabel outputLabel = new JLabel();

    // place and size for components
    goalLabel.setBounds(100,50,300,50);
    goalLabel.setFont(new Font("Arial", Font.PLAIN, 12)); //edit this
    goalLabel.setForeground(Color.BLACK); //edit this 
    goalLabel.setText("Type your goal amount below then press 'enter':"); //edit this

    goalField.setBounds(100, 100, 150, 50);

    actualLabel.setBounds(500,50,300,50);
    actualLabel.setFont(new Font("Arial", Font.PLAIN, 12)); //edit this
    actualLabel.setForeground(Color.BLACK); //edit this 
    actualLabel.setText("Type your actual amount below then press 'enter':"); //edit this

    actualField.setBounds(500, 100, 150, 50);

    inputButton.setBounds(150, 200, 400, 50);

    outputLabel.setBounds(100,400,450,50);
    outputLabel.setFont(new Font("Arial", Font.PLAIN, 18)); //edit this
    outputLabel.setForeground(Color.RED); //edit this
    
    // add components to JFrame f
    frame.add(goalLabel);
    frame.add(goalField);
    frame.add(actualLabel);
    frame.add(actualField);
    frame.add(inputButton);
    frame.add(outputLabel);
    
    inputButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double goalAmount = Double.parseDouble(goalField.getText());
        double actualAmount = Double.parseDouble(actualField.getText());
        // ADD CODE HERE
        
      }    });

    // make the frame visible
    frame.setVisible(true);
  }
}
