package unit12;

public class ShowCurrentTime { 
	  
    // Obtain the total milliseconds since midnight, Jan 1, 1970 
    long totalMilliseconds = System.currentTimeMillis();
      
     // Obtain the total seconds since midnight, Jan 1, 1970 
    long totalSeconds = totalMilliseconds/ 1000;
    
     // Compute the current second in the minute in the hour 
    long currentSecond = totalSeconds% 60; 
    
    // Obtain the total minutes 
    long totalMinutes = totalSeconds/ 60;
    
    // Compute the current minute in the hour 
    long currentMinute = totalMinutes% 60; 
    
    // Obtain the total hours 
    long totalHours = totalMinutes/ 60; 
    
    // Compute the current hour 
    long currentHour = totalHours% 24; 
    
    // Display results
    public String toString(){
      return "Current time is " + currentHour +":" 
       + currentMinute +":" + currentSecond + " GMT";
    }
    //public long[] getTime(){
    	//long[] temp=new long[3];
    	//long[1]
    	
    //}
   
}

