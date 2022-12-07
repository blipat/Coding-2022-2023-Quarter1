/*

PART 1

The Rater class represents a rating system for a company. The company is rated on a scale of 1 - 5.

The toString representation changes based on how well rated the company is. Suppose we have a company called “Tina’s Tires”.
If its rating is less than two, toString would return “Not Recommended Company Tina’s Tires”
If its rating is over 3.5, toString would return “Gold Star Company Tina’s Tires”
Otherwise, toString would return “Well Rated Company Tina’s Tires”

Remember, once a return statement is executed, the rest of the method is skipped. Therefore, if you return a String in an if statement, the remaining if statements will not be tested.

The other method you need to fill in is setRating. The rating should only be changed if the new rating is 5 or less.

PART 2

Let’s look at the Rater class again.

The Rater class represents a rating system for a company. The company is rated on a scale of 1 - 5. This time, there is an additional instance variable – review. This variable is set based on the company’s current rating.

The updateReview method updates review: 
If the company is rated 3 or more, the company’s review would say “Proudly recommended”.
Otherwise, the review will say, “Needs more ratings”

The toString method returns the name of the company followed by its review. For example, it might say “Tina's Tires : Proudly recommended”. Update the toString method to match that format.

The last method you need to fill in is setRating. The rating should only be changed if the new rating is 5 or less. This is the same as the last time.

*/

public class Rater
{
    private String name; // name of company
    private double rating; // number rating (1 - 5)
    
    
    public Rater(String company, double initialRating)
    {
        name = company;
        rating = initialRating;
    }
    
    // Set rating to newRating as long as
    // the new rating is no more than 5
    public void setRating(double newRating)
    {
        
    }
    
    // Returns the rating of the company
    public double getRating()
    {
        return rating;
    }
    
    // Returns a string representation of the company
    // based on their ratings
    public String toString()
    {
        // remember, once a return statement is
        // executed, the program LEAVES the method.
        // Nothing after the executed return statement is executed.
    }
}
