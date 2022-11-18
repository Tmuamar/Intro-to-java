public class SalariedEmployee extends Employee {
   private double annualSalary;

   public SalariedEmployee(double annualSalary, int empIdNumber, Name name, Address address, Date hireDate) {
       super(empIdNumber, name, address, hireDate);
       this.annualSalary = annualSalary;
   }

   public double getAnnualSalary() {
       return annualSalary;
   }

   public void setAnnualSalary(double annualSalary) {
       this.annualSalary = annualSalary;
   }
   public String toString() {

      return super.toString()+"\nAnnual Salary="+annualSalary;
   }
}