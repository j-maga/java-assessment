package test22;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Pro10 
{
	public static void main(String[] args)
	{
		SimpleDateFormat sd = new SimpleDateFormat("EEEE");
		Date dt = new Date(1/7/2022);

		Calendar cd = Calendar.getInstance();
		System.out.println(sd.format(cd.getTime()));
		//System.out.println(sd.format(cd.setTime(18d)));
		System.out.println(sd.format(dt));		
	}
}
