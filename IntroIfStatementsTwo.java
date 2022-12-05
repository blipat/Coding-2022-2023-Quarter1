/*
This program prints out whether a random number
is positive or equal to 0. 

We will add another if statement that tests if 
it is a negative number.
*/

public class IntroIfStatementsTwo {
    public static void main(String[] args)
    {
        // Get a random number from -10 up to 10.
        int number = (int) (Math.random()*21) - 10;
        System.out.println("The number is " + number);
 
        // is it positive?
        if (number > 0)
        {
            System.out.println(number + " is positive!");
        }
        // is it 0?
        if (number == 0)
        {
            System.out.println(number + " is zero!");
        }
        // is it negative?
        // Add another if statement
        if (number < 0)
        {
            System.out.println(number + " is negative!");
        }
 
    }
}
