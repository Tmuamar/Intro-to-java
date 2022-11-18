/**
 * This will read the changed text file that was produced by the 
 * other programing when inputing two run time parameters that are the
 * txt file name and number of records.
 */
package module10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadText {
   public static void main(String[] args) {
       if(args.length != 2)
       {
           System.out.println("SmallAreaIncomePovertyEstDataChangev2.txt 56");
           System.exit(1);
       }
       
       BufferedReader newFile;
       File changedFile = new File(args[0]);
       System.out.println("File: " + changedFile.getAbsolutePath() + "\n");
       int state;
       int population; 
       int childPopulations; 
       int childPovertyPopulations;
       double percentChildPoverty;
       String line;
       try 
       {
          newFile = new BufferedReader(new FileReader(changedFile));
          System.out.printf("State %12s %20s %25s %17s\n", "Population", "Child Population", "Child Poverty Population", "% Child Poverty");
          System.out.printf("----- %12s %20s %25s %16s\n",
                   "-----------", "-----------------", "------------------------", "  ----------------");
          while((line = newFile.readLine()) != null)
          {
             String[] value = line.split("( )+");
             state = Integer.parseInt(value[0]);
             population = Integer.parseInt(value[1]);
             childPopulations = Integer.parseInt(value[2]);
             childPovertyPopulations = Integer.parseInt(value[3]);
             percentChildPoverty = Double.parseDouble(value[4]);
             line = String.format(" %02d", state);
             line += String.format(" %,13d", population);
             line += String.format(" %,15d", childPopulations);
             line += String.format(" %,20d", childPovertyPopulations);
             line += String.format(" %22.2f", percentChildPoverty);
             System.out.println(line);
             
          }
          
          newFile.close();
          }catch (Exception except){
             System.out.println(except.getMessage());  
       }
       
       
   }
   
}