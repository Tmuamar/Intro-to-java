/**
 * produces changed a new text file that has the changed values for the population sizes.
 */

package module10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataCreate {
   public static void main(String[] args) 
   {
      // allows for the three run time parameters to be read.
      if(args.length != 3)
      {
         System.out.println("File: SmallAreaIncomePovertyEstDatav2.txt SmallAreaIncomePovertyEstDataChangev2.txt 13486");
         System.exit(1);
      }
      int[] state = new int[13487];

      int[] population = new int[13487];

      int[] childPopulation = new int[13487];

      int[] childPovertyPopulation = new int[13487];
        
      int changeState = 0;
     
      for (int i = 0; i < 13487; i++)
      {
         state[i] = 0;
         population[i] = 0;
         childPopulation[i] = 0;
         childPovertyPopulation[i] = 0;
         
      }
      try {
         changeState = changeFile(state, population, childPopulation, childPovertyPopulation);
         makeNewFile(args[1], changeState, state, population, childPopulation, childPovertyPopulation);
         } catch (FileNotFoundException except) {
            System.out.println(except.getMessage());
            } catch (IOException except) {
               System.out.println(except.getMessage());
               
            }
      
   }
   /**
    * 
    * @param state array for the stateid
    * @param population array for population
    * @param childPopulation array for child population
    * @param childPovertyPopulation array for child poverty population
    * @return numState
    * @throws FileNotFoundException
    */
   private static int changeFile(int[] state, int[] population, int[] childPopulation, int[] childPovertyPopulation) throws FileNotFoundException
   
   {
      String fileName = "SmallAreaIncomePovertyEstDatav2.txt";
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      String line;
      String num;
      int stateCode = 0;
      int numState = 0;
      try 
      {
         while ((line = br.readLine()) != null)
         {
            // using the Layout text to produce these outputs
            //gets the state code
            num = line.substring(0, 2).trim();
            stateCode = Integer.parseInt(num);
            state[stateCode] = stateCode;
            
            //gets total for the population
            num = line.substring(82, 90).trim();
            population[stateCode] += Integer.parseInt(num);
            
            //gets children population
            num = line.substring(91, 99).trim();
            childPopulation[stateCode] += Integer.parseInt(num);
            
            //gets child poverty population
            num = line.substring(100, 108).trim();
            childPovertyPopulation[stateCode] += Integer.parseInt(num);
            
            if(stateCode > numState)
            {
               numState = stateCode;
               
            }
            
         }
         
         br.close();
         } catch (IOException e) {
            System.out.println("Exception occured." + e.getMessage());
            
         }
      return numState;
      
   }
   /**
    * 
    * @param fileName string for the new filename
    * @param numState is the value produced by the changeFile
    * @param state number of state
    * @param population size
    * @param childPopulation size
    * @param childPovertyPopulation size
    * @throws IOException
    */
   private static void makeNewFile(String fileName, int numState, int[] state, int[] population, int[] childPopulation, int[] childPovertyPopulation) throws IOException
   {
      File f = new File(fileName);
      BufferedWriter bw = new BufferedWriter(new FileWriter(f));
      double percent;
      String line;
      for(int i = 1; i <= numState; i++ )
       {
         if(state[i] == 0) continue; //no data for the state code
         //calculate percentages
         percent = childPovertyPopulation[i] * 100.0 / childPopulation[i];
         line = String.format("%02d %15d %15d %15d %10.2f", state[i], population[i], childPopulation[i], childPovertyPopulation[i], percent);
         bw.write(line + "\n");
         
       }
      bw.close();
      System.out.println("Report generated in file: " + f.getAbsolutePath());
            
   }
}