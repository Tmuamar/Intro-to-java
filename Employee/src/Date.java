/* this is a class constructor to produce the hiring date */

class Date
{
   //stating variables
   private int month;
   private int day;
   private int year;
   
   public Date( int month, int day, int year )
   {
      super();
     this.month = month;
     this.day = day;
     this.year = year;
   }
   // through out this i use setters and getter methods for this program.
   public int getMonth()
   {
	   return month;
   }
   public void setMonth(int month)
   {
	   if (month <1 || month > 12) {
		   System.out.println("invalid month entered");
	   }
	   else if(month >= 12 && month <= 12) {
		   this.month=month;
	   }
   }
   public int getDay()
   {
	   return day;
   }
   public void setDay(int day)
   {
	   if (day < 1 || day > 31) {
		   System.out.println("invalid day entered");
	   }
	   else {
		   this.day = day;
	   }
   }
   public int getYear()
   {
	   return year;
   }
   public void setYear(int year)
   {
	   if (year <1900 || year > 2020) {
		   System.out.println("invalid year entered");
	   }
	   else {
		   this.year = year;
	   }
   }
   // returns the value the user has inputed in this format for hire date.
   public String toString() {
	   return day + "/" + month + "/" + year;
   }
 }// end class date
      