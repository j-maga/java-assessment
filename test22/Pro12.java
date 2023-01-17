package test22;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Pro12
{
	public static void main(String[] args)
	{
		SimpleDateFormat sd = new SimpleDateFormat();
		LocalDate ld = LocalDate.now();
		ld.getMonth().plus(2);
		
		System.out.println(ld);
		System.out.println(ld.getMonth().plus(2));
	}

}
