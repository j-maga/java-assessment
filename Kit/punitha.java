package Kit;

public class punitha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java";
		int count[] = new int[4];
		int i;
		for(i=0;i<str.length();i++) {
				count[(int)str.charAt(i)]++;
		}
		if(count[str.charAt(i)]<=1) {		
			System.out.println("Unique Char : " +"\n" +(char)i);
		}
		else {
			System.out.println("Duplicate Char :" +"\n" +(char)i);
		}
	}
}