package test22;

import java.util.Calendar;


public class Equal 
{
	public static void main(String[] args)
	{
		Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        
        c1.set(2022, 8, 20);
        c2.set(2022, 8, 26);
        
        System.out.println("\n\nDay 1 - 20 Aug 2022 \nDay 2 - 26 Aug 2022\n");
        System.out.println("Before ?  "+ c1.before(c2) + "\t\tAfter ?  "+c1.after(c2) + "\t\tEqual ?  "+c1.equals(c2));
	}

}
