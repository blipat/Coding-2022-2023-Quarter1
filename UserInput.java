import java.util.Scanner; // import the Scanner class

public class UserInput {
  public static void main(String[] args) {
    System.out.print("Please Enter your name: ");
    Scanner scan = new Scanner(System.in); // create a Scanner object
    String name = scan.nextLine(); // read user's String input
    System.out.println("Hello " + name); // print user input
    System.out.print("Please Enter your age: ");
    int age = scan.nextInt(); // read user's int input
    System.out.println("Your age is " + age);
    scan.close();
  }
}

