import java.util.Scanner;

public class Output
{
   public static void main(String [] args)
   {
         System.out.println("Salaried Employee Information"); 
         System.out.println("------------------------------");
         SalariedEmployee salaried=new SalariedEmployee(50000, 0, null, null, null);
         salaried.setEmpIdNumber(185231);
         salaried.setName(new Name("Nick", "Harden"));
         salaried.setAddress(new Address("Romar", "Northridge", "CA", 91324, 18276));
         salaried.setHireDate(new Date(3, 5, 2020));
         System.out.println("Employee Id :"+salaried.getEmpIdNumber());
         System.out.println("Employee Name :"+salaried.getName().getFirstName() + " "+ salaried.getName().getLastName());
         System.out.println("Employee Address :"+salaried.getAddress().getStreetNumber() + 
               " " +salaried.getAddress().getStreet() + " " + salaried.getAddress().getCity()
               + " " + salaried.getAddress().getState() + " " + salaried.getAddress().getZip());
         System.out.println("Joining Date :"+salaried.getHireDate());
         System.out.println("The Annual Salary :"+salaried.getAnnualSalary());
        
        
         System.out.println("\nHourly Employee Information with no Overtime");
         System.out.println("---------------------------------------------");
         HourlyEmployee hourly=new HourlyEmployee(0, null, null, null, 15,39);
         hourly.setEmpIdNumber(185233);
         hourly.setName(new Name("Joe", "Kane"));
         hourly.setAddress(new Address("Roscoe", "Canoga", "CA", 91304, 21535));
         hourly.setHireDate(new Date(12, 1, 2020));
         System.out.println("Employee Id :"+hourly.getEmpIdNumber());
         System.out.println("Employee Name :"+hourly.getName().getFirstName() + " "+ hourly.getName().getLastName());
         System.out.println("Employee Address :"+hourly.getAddress().getStreetNumber() + 
         " " +hourly.getAddress().getStreet() + " " + hourly.getAddress().getCity()
         + " " + hourly.getAddress().getState() + " " + hourly.getAddress().getZip());
         System.out.println("Hiring Date :"+hourly.getHireDate());
         System.out.println("The Earnings Of An HourlyEmployee :"+hourly.getEarnings());
         
         System.out.println("\nHourly Employee Information with Overtime");
         System.out.println("---------------------------------------------");
         HourlyEmployee hourly3=new HourlyEmployee(0, null, null, null, 15, 55);
         hourly3.setEmpIdNumber(185233);
         hourly3.setName(new Name("Dan", "Mckenzie"));
         hourly3.setAddress(new Address("Roscoe", "Canoga", "CA", 91304, 21535));
         hourly3.setHireDate(new Date(12, 1, 2020));
         System.out.println("Employee Id :"+hourly3.getEmpIdNumber());
         System.out.println("Employee Name :"+hourly3.getName().getFirstName() + " "+ hourly3.getName().getLastName());
         System.out.println("Employee Address :"+hourly3.getAddress().getStreetNumber() + 
         " " +hourly3.getAddress().getStreet() + " " + hourly3.getAddress().getCity()
         + " " + hourly3.getAddress().getState() + " " + hourly3.getAddress().getZip());
         System.out.println("Hiring Date :"+hourly3.getHireDate());
         System.out.println("The Earnings Of An HourlyEmployee :"+hourly3.getEarnings());
         
        
         System.out.println("\nHourly employee with user input");
         Scanner sc = new Scanner(System.in);
         System.out.println("input hours worked: ");
         int hours = sc.nextInt();
         HourlyEmployee hourly2=new HourlyEmployee(0, null, null, null, 15, hours);
         System.out.println("Enter Employee id Number: ");
         int empIdNumber = sc.nextInt();
         
         System.out.print("Enter Employee First Name: ");
         String firstName = sc.next();
         System.out.print("Enter Employee Last Name: ");
         String lastName = sc.next();
         Name name = new Name(firstName, lastName);
         
         System.out.print("Enter Street Number: ");
         int streetNumber = sc.nextInt();
         System.out.print("Enter street name: ");
         String street = sc.next();
         System.out.print("Enter city name: ");
         String city = sc.next();
         System.out.print("Enter State (2 letter code): ");
         String state = sc.next();
         System.out.print("Enter five digit zip code: ");
         int zip = sc.nextInt();
       Address address = new Address(street, city, state, zip, streetNumber);
       
       // inputing the employees date of higher 
       int day = 0;
       int month = 0;
       int year = 0;
       boolean valid;
       do {
            System.out.println("Enter day hired (1-31): ");
            day = sc.nextInt();
            valid = day >= 1 && day <= 31;
            if (!valid) {
              System.out.println("ERROR Please enter a valid day");
            }
       }while (!valid);
       boolean month1;
       do {
            System.out.println("Enter month hired (1-12): ");
            month = sc.nextInt();
            month1 = month >= 1 && month <= 12;
            if (!month1) {
              System.out.println("ERROR Please enter a valid month");
            }
       }while (!month1);
       
       boolean year1;
       do {
            System.out.println("Enter year hired(1901-2020): "); 
            year = sc.nextInt();
            year1 = year >= 1901 && year <= 2020;
            if (!year1) {
              System.out.println("ERROR Please enter a valid year");
            }
       }while (!year1);
          Date hireDate = new Date(day, month, year);
          
        System.out.println("The Earnings Of An Hourly Employee :"+hourly2.getEarnings());
        System.out.println("Employee Id Number: "+empIdNumber);
        System.out.println("Name: "+name.toString());
        System.out.println("Address:  "+address.toString());
        System.out.println("Hire Date: "+hireDate.toString());
         }

}