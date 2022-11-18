public class IllegalArgumentExceptionThrown 
{

   public static void main(String[]args)
   {
      int x = 101;
      if (x < 100) {
         System.out.println("X is less than 100");
      }
      else {
         throw new IllegalArgumentException();
      }
   }
}
