package AptitudeQuestions;


import java.time.Clock;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class GetLocalTimeDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method1");
		
		//Today date
		//LocalDate todayDate = java.time.LocalDate.now(); //using local time
		Date date = new Date(); 
		
		System.out.println(date);
		
		//Timestamp
		Timestamp ts = new Timestamp(System.currentTimeMillis()); 		
		System.out.println(ts);
		
		//passing the time value to the date class
		Date dt = new Date(ts.getTime()); 
		System.out.println(dt);
		
		//Calendar instance 
		Calendar cl = Calendar.getInstance(); 
		System.out.println(cl.getCalendarType());
	}
	

}

