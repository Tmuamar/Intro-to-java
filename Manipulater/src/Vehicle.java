
public class Vehicle extends Read
{
   public String name;
   public int age;
   
   public Vehicle (String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   public int getAge()
   {
      return age;
   }
   public void setAge(int age)
   {
      this.age = age;
   }
   public String getName()
   {
      return name;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public void resizeObject()
   {
      System.out.println("Resizing an "+ name +" "+ age);
   }
   public void playSounds()
   {
      System.out.println( name +" "+ age +" sound");
   }
   public void rotateObject()
   {
      System.out.println("Rotate an " + name +" "+ age);
   }
   public void drawObjects()
   {
      System.out.println("Drawing a "+ name +" "+ age);
   }
}
