/* 
The variable isRaining is a boolean variable 
that is either true or false. If it is true 
then the message 'Take an umbrella!' will be 
printed and then execution will continue with 
the next statement which will print 'Drive 
carefully'. 
*/

public class IntroIfStatementsOne {
    public static void main(String[] args)
    {
      boolean isRaining = true;
      if (isRaining)
      {
         System.out.println("Take an umbrella!");
      }
      System.out.println("Drive carefully");
    }
}
