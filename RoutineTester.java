public class RoutineTester
{
   public static void main(String[] args) 
   {
      //example of printTotal if sleep=8, school=8, friends=2.5, & hobbies=2
      Routine myWeek = new Routine();
        
      myWeek.setSchool(8);
      myWeek.setHobbies(2);
      myWeek.setFriends(2.5);
      myWeek.setSleep(8);
        
      //Prints the totals for the WHOLE WEEK
      myWeek.printTotal();
  }
}