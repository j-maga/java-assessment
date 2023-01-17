package test06;

import java.util.HashSet;

public class Permutation
{
	public static void main(String[] args)
	{
		String s = "ABC", op, sub;
		int rep = s.length()-1;
		int num = s.length()*rep;
		
		int k;
		HashSet<String> hm = new HashSet();
				
		for(int i=0; i<num; i++)
		{
			//sub = s.replace(s.charAt(i), "");
			op=""+s.charAt(i);
			for (int j=0; j<rep; j++)
			{
				if(s.charAt(j)==s.charAt(i))
					continue;
				else
					op = op+s.charAt(j);
			}
			System.out.println(op);
		}
	}
}
