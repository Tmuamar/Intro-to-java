
public class ClassCastExceptionThrown 
{
   public static void main(String[]args)
   {
      Object exception = new Integer(42);
      System.out.println((String)exception);
   }
}
