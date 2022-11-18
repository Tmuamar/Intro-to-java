class Address
{
   private String street;
   private int zip;
   private int streetNumber;
   private String city;
   private String state;
   
   public Address(String street, String city, String state, int zip, int streetNumber)
   {
      super();
      this.street = street;
      this.state = state;
      this.city = city;
      this.zip = zip;
      this.streetNumber = streetNumber;
   }
   // returns streetnumber
   public int getStreetNumber()
   {
      return streetNumber;
   }
   // street number to set
   public void setStreetNumber(int streetNumber)
   {
      this.streetNumber = streetNumber;
   }
   //returns the street
   public String getStreet()
   {
      return street;
   }
   // street to set
   public void setStreet(String street)
   {
      this.street = street;
   }
   // returns the state
   public String getState()
   {
      return state; 
   }
   // state to set
   public void setState(String state)
   {
      this.state = state;
   }
   // returns city
   public String getCity()
   {
      return city;
   }
   // city to set
   public void setCity(String city)
   {
      this.city = city;
   }
   // returns zip
   public int getZip()
   {
      return zip; 
   }
   // zip to set
   public void setZip(int zip)
   {
      this.zip = zip;
   }
   // returns the inputs that user put for each of the values for the address
   public String toString() 
   {
       return streetNumber+" "+street+", "+city+", "+state+"-"+zip;
   }
}// end class address