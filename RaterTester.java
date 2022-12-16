/*

PART 1

After you fill in Rater, the main method in RaterTester.java should produce the following output. Note that the main method  runs several test cases to check all of the conditions of the program. We need to make sure to test every line of code.

Current Rating: 2.0
Well Rated Company Jr Cookery

Current Rating: 4.5
Gold Star Company Jr Cookery

Current Rating: 4.5
Gold Star Company Jr Cookery

Current Rating: 1.0
Not Recommended Company Jr Cookery

PART 2

In the main method of RaterTester.java: 
Create a Rater object. Set its rating to something less than 3. 
Call updateReview, then print out the object. 
Use setRating to set the rating to something between 3 and 5. 
Call updateReview again, then print out the object.

This will let you test both branches of your if-else statement.

*/

public class RaterTester
{
    public static void main(String[] args)
    {
        Rater jrs = new Rater("Jr Cookery", 2);
        
        
        // Test Case: In the middle
        System.out.println("Current Rating: " + jrs.getRating());
        System.out.println(jrs);
        
        
        // Test Case: High rating
        jrs.setRating(4.5);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);
        
        // Test Case: Setting rating too high
        jrs.setRating(100);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);
        
        
        // Test Case: Low rating
        jrs.setRating(1);
        System.out.println("\nCurrent Rating: " + jrs.getRating());
        System.out.println(jrs);
        
    }
}

