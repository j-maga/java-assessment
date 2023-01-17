package test22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pro13
{
	public static void main(String[] args)
	{
		SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
		Date dt = new Date();
		
		System.out.println(sd.format(dt));
		
	}

}
