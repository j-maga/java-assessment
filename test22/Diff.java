package test22;

import java.time.Duration;
import java.time.LocalDate;

public class Diff
{

	public static void main(String[] args)
	{
		
		LocalDate ld1 = LocalDate.now();
		LocalDate ld2 = LocalDate.now().minusDays(2);
        
		Duration d = Duration.between(ld1, ld2);
		 long diff = Math.abs(d.toDays());
		
        System.out.println(diff);
	}

}
