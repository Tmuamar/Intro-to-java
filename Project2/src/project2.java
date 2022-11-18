public class project2
{
   public static void main(String [] args)
   {
      int tortoise = 1;
      int hare = 1;
      int endRace = 50;
      
      System.out.println("AND THEY’RE OFF!!");
      race(tortoise, hare, endRace);
      do
      {
            tortoise += tortoiseMovement();
            hare += hareMovement();
         if (tortoise <0){
            tortoise = 0;
         }else if (hare < 0){
            hare = 0; 
         }
      }while(tortoise < endRace && hare < endRace);
      
      if(tortoise >= endRace && hare >= endRace){
            System.out.println("IT’S A TIE!!");
         }else if (tortoise >= endRace && hare <= endRace){
            System.out.println("TORTOISE WINS!!");
         }else if (hare >= endRace && hare <= endRace){
            System.out.println("HARE WINS!!!");
         }
   }
   public static int tortoiseMovement()
   {
	  int movement = (int) (Math.random() ) + 1;
      
      if (movement <= 5){
         return +3;
      }else if (movement == 6 || movement == 7 || movement == 8){
         return +1;
      }else{
         return -6;
      }
   }
   public static int hareMovement()
   {
	  int movement2 = (int) (Math.random() ) + 1;
	   
      if (movement2 <= 2){
         return +9;
      } else if (movement2 == 3 || movement2 == 4 || movement2 == 5){
         return +1;
      }else if (movement2 == 6){
         return -12;
      }else if (movement2 == 7 || movement2 == 8){
         return -2;
      }else {
         return 0;
      }
   }
   public static void race(int tortoise, int hare, int endRace)
   {
      for ( int x = 1; x <= endRace; x++){
         if (tortoise == hare && hare == x){
            System.out.println("OUCH!!");
         }else if (tortoise == x){
            System.out.println("T");
         }else if (hare == x){
            System.out.println("H");
         }else{
            System.out.println(" ");
         }
      }
   }
}
