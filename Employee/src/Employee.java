public class Employee 
{
  
   private int empIdNumber;
   private Name name;
   private Address address;
   private Date hireDate;
  
   public Employee(int empIdNumber, Name name, Address address, Date hireDate) 
   {
       super();
       this.empIdNumber = empIdNumber;
       this.name = name;
       this.address = address;
       this.hireDate = hireDate;
   }
   
   public int getEmpIdNumber()
   {
       return empIdNumber;
   }
  
   public Name getName() 
   {
       return name;
   }
 
   public Address getAddress() 
   {
       return address;
   }
 
   public Date getHireDate() 
   {
       return hireDate;
   }
 
   public void setEmpIdNumber(int empIdNumber) 
   {
       this.empIdNumber = empIdNumber;
   }
   
   public void setName(Name name) 
   {
       this.name = name;
   }
 
   public void setAddress(Address address) 
   {
       this.address = address;
   }
   
   public void setHireDate(Date hireDate) 
   {
       this.hireDate = hireDate;
   }
  
   public void Display() 
   {
	   System.out.println("Employee Id Number: "+empIdNumber);
       System.out.println("Name: "+name.toString());
       System.out.println("Address:  "+address.toString());
       System.out.println("Hire Date: "+hireDate.toString());
       
      }
}