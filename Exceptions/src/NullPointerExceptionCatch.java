public class NullPointerExceptionCatch 
{
   public static void main(String[] args) 
   {
       try 
       {
          Integer num = null;
          Integer num2 = 5;
          System.out.println(num + num2);
       }
       catch (Exception e) {
           System.out.println("NullPointerException caught: " + "\n"
                   + " Exception was thrown because while putting num and num2 together the num was a null value");
       }
   }
}
