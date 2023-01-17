package test22;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHash 
{
	public static void main(String[] args)
	{
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("a", "Home");
		hash.put("c", "Alt");
		hash.put("b", "Ctrl");
		hash.put("f", "Space");
		hash.put("d", "Delete");
		hash.put("g", "Escape");
		hash.put("e", "Tab");
		
		System.out.println(hash);
		
	}
}
