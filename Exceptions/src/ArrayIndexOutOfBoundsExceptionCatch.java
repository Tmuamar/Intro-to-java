
public class ArrayIndexOutOfBoundsExceptionCatch 
{
   public static void main(String []args)
   {
      try 
      {
         String[] animals = {"cat", "dog"};
         for (int i = 2; i<=animals.length; i++) 
         {
            System.out.println(animals[i]);
         }
      } catch (Exception e) {
         System.out.println("ArrayIndexOutOfBounds caught: " + "\n"
               + " Exception was thrown because the array was accessed by an illegal index because it was greater than the size of the array");
         }
   }
}
