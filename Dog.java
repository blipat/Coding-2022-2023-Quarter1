public class Dog
{
   private String name;
   private String breed;

   public String getName()
   {
      return name;
   }   

   public static void main(String[] args){
    Dog Karel = new Dog();
    System.out.println(Karel.getName());
   }
}