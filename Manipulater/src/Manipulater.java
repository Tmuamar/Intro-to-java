
public class Manipulater 
{
   public static void main(String[]args)
   {
      Read [] drawableObjects = {new Animal("Animal"), new Animal("Animal"), new Vehicle("Vehicle", 2020), new Vehicle("Vehicle", 2020)};
      
      for(int i = 0; i<drawableObjects.length; i++)
      {
         drawableObjects[i].drawObjects();
         drawableObjects[i].playSounds();
         drawableObjects[i].resizeObject();
         drawableObjects[i].rotateObject();
      }
   }
}
