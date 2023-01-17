package test04;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rege {
	public static void main(String[] args) {
		List<String> emails = new ArrayList();
		emails.add("sairamkrishna@tutorialspoint.com");
		emails.add("kittuprasad700@gmail.com");
		emails.add("sairamkrishna_mammahe%google-india.com");
		emails.add("sairam.krishna@gmail-indai.com");
		emails.add("sai#@youtube.co.in");
		emails.add("kittu@domaincom");
		emails.add("kittu#gmail.com");
		emails.add("@pindom.com");
		 
		String regex = "^[a-z0-9+_.-]+@[a-z0-9-_.].(.+)$";
		//String regex = "^[A-Za-z0-9_.-]+@[A-Za-z0-9_.-](.)[A-Za-z0-9_.-]$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String email : emails)
		{
		  Matcher matcher = pattern.matcher(email);
		  System.out.println(email +"\t\t "+ matcher.matches());
		}
	}
}
