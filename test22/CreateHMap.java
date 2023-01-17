package test22;

import java.util.HashMap;

public class CreateHMap
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		
		HashMap<Integer, String> h2 = new HashMap<Integer, String>(2);
		
		HashMap<Integer, String> h3 = new HashMap<Integer, String>(2, 0.15f){{put(1, "apple"); put(2, "orange");}};

		h2 = (HashMap<Integer, String>) h3.clone();
		h1 = (HashMap<Integer, String>) h3.clone();
		
		System.out.println("H1 "+h1);
		System.out.println("H2 "+h2);
		System.out.println("H3 "+h3);
	}

}
