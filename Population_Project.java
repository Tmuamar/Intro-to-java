public class Population_Project {
    public static void main(String[] args) {
        System.out.println("current population is 312032486");
        //Store current population as variable intPop
        double intPop = 312032486;

        //add one birth every 7 seconds; subtract one death every 13 seconds; add one immigrant every 45 seconds.
        // 365 days = 1 year | 1 day = 24 hours | 1 hour = 60 minutes | 1 minute = 60 seconds
            // 7 seconds = 1 birth | 13 seconds = 1 death | 45 seconds = 1 immigrant

        // 365days * 24hours * 60minutes * 60seconds = 31536000 seconds
        double numberOfSecondsInYear = 31536000;

        //After 1 year, number of births (7 seconds = 1 birth | plus)
        double birthsPerYear = numberOfSecondsInYear / 7;
        System.out.println("brithsPerYear: " + birthsPerYear);

        //After 1 year, number of deaths (13 seconds = 1 death | minus)
        double deathsPerYear = numberOfSecondsInYear / 13;
        System.out.println("deathsPerYear: " + deathsPerYear);

        //After 1 year, number of immigrants (45 seconds = 1 immigrant | plus)
        double immigrantsPerYear = numberOfSecondsInYear / 45;
        System.out.println("immigrantsPerYear: " + immigrantsPerYear);

        //Rate per year
        double ratePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;
        System.out.println("ratePerYear: " + ratePerYear);

        System.out.println("End of year 1 the population is " + (int)(intPop + (1 * ratePerYear)));
        System.out.println("End of year 2 the population is " + (int)(intPop + (2 * ratePerYear)));
        System.out.println("End of year 3 the population is " + (int)(intPop + (3 * ratePerYear)));
        System.out.println("End of year 4 the population is " + (int)(intPop + (4 * ratePerYear)));
        System.out.println("End of year 5 the population is " + (int)(intPop + (5 * ratePerYear)));
    }
}