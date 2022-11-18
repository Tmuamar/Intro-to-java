public class population
{
  public static void main( String [] args)
  {
 int time = 3600*24*365; // 1 year in seconds
    int born = time/7; // Birth rate in one year
    System.out.println("birth rate is : " + (born));
    int death = time/13; // Death rate in 1 year
    System.out.println("Death rate is : " + (death));
    int immigrant = time/45; // immigrant rate in 1 year
    System.out.println("immigrant rate is : " + (immigrant));
    int currentpopulation = 312032543;
    System.out.println("current population is : " +(currentpopulation));
    int populationrate = born + immigrant - death;// provides the rate per year
    
    currentpopulation = currentpopulation + populationrate; // calculates the population for the end of the first year
    System.out.println("1 year population is : " + (currentpopulation));
    System.out.println("2 year population is : " + (currentpopulation+(1*populationrate)));
    System.out.println("3 year population is : " + (currentpopulation+(2*populationrate)));
    System.out.println("4 year population is : " + (currentpopulation+(3*populationrate)));
    System.out.println("5 year population is : " + (currentpopulation+(4*populationrate)));
    }
}