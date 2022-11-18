public class HourlyEmployee extends Employee {
   private double hourlyRate;
   private double hoursWorked;
   private double earnings;
   public HourlyEmployee(int empIdNumber, Name name, Address address, Date hireDate, double hourlyRate, double hoursWorked) {
      super(empIdNumber, name, address, hireDate);
      this.hourlyRate = hourlyRate;
      this.hoursWorked = hoursWorked;
   }
   public double getEarnings()
   {
      if(hoursWorked<=40)
      {
          earnings=hoursWorked*hourlyRate;
      }
      else if(hoursWorked>40)
      {
          earnings=40*hourlyRate+(hoursWorked-40)*hourlyRate*1.5;
      }
      return earnings;
   }
   public double getHourlyrate() {
      return hourlyRate;
   }
   public void setHourlyrate(double hourlyRate) {
      this.hourlyRate = hourlyRate;
   }
   public double getHoursWorked() {
      return hoursWorked;
   }
   public void setHoursWorked(double hoursWorked) {
      this.hoursWorked = hoursWorked;
   }
   public void setEarnings(double earnings) {
      this.earnings = earnings;
   }
   public String toString() {
   return super.toString()+"\nHours Worked="+hoursWorked+"\nHourly Pay Rate="+hourlyRate+"\nEarnings="+earnings;
}
}
