
public class ClassCastExceptionCatch 
{
   public static void main(String[]args)
   {
      try 
      {
         Object exception = new Integer(42);
         System.out.println((String)exception);
      } catch (Exception e) {
         System.out.println("ClassCast Exception caught: " + "\n"
            + " Exception was thrown because it casting exception as a string");
      }
   }
}
