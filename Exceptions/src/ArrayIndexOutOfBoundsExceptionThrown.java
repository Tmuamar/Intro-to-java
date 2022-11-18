
public class ArrayIndexOutOfBoundsExceptionThrown 
{
 public static void main(String []args)
 {
    String[] animals = {"cat", "dog"};
    for (int i = 2; i <= animals.length; i++) 
    {
       System.out.println(animals[i]);
    }
 }
}
