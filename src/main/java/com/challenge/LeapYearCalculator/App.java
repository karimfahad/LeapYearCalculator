package com.challenge.LeapYearCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	boolean valid; 
    	valid = isLeapYear(2000);
    	System.out.println( "is 2000 leap year: " +  valid);
    }
    
    public static boolean isLeapYear(int year) {
    	
    	boolean valid = false;
    	if (year < 1 || year > 9999)
    		valid = false;
    	else if (year > 1 || year < 9999) {
    		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
    			valid = true;
    		else valid = false;
    	}
    		
    	return valid;
    		
    }
    
}
