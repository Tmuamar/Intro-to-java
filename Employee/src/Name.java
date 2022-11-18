/* class construct to produce users first and last name */

class Name
{
   private String firstName;
   private String lastName;
   
   public Name(String firstName, String lastName) 
   {
      super();
	   this.firstName = firstName;
	   this.lastName = lastName;
   }

public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public void setFirstName (String firstName)
   {
      this.firstName = firstName;
   }
   public void setLastName (String lastName)
   {
      this.lastName = lastName;
   }
   public String toString() {
       return firstName+" "+lastName;
   }
}// end class name