public class ProblemSet0_2 {
   public static void main(String[] args)
   {
       //
   int currentYear = 2022;
   int birthYear = 2006;
   int dogBirthYear = 2020;
   int age= currentYear - birthYear;
   int dogAge= currentYear - dogBirthYear;
   int dogYearsAge= dogAge * 7;
   System.out.println("my age is" + age);
   System.out.println("my dogs age is" + dogAge);
   System.out.println("my dogs dog age is" + dogYearsAge);
}
}