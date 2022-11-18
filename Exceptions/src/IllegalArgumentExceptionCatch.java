
public class IllegalArgumentExceptionCatch 
{
   public static void main(String[]args)
   {
      try 
      {
         int x = 101;
         if (x < 100) 
         {
            System.out.println("X is less than 100");
         }
         else 
         {
            throw new IllegalArgumentException();
         }
      }catch (Exception e) 
      {
         System.out.println("IllegalArgument Exception caught: " + "\n"
            + " Exception was thrown because the value of x was not less than 100 so it was an illegal argument");
      }
   }
}
