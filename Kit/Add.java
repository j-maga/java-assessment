package Kit;

public class Add 
{
    static int x; 
    static boolean func()
    {
        x++; 
        return true; 
    } 
    public static void main(String[] args)
    {
        System.out.println(x);
    	x=0; 
        if ((func() | func()) | func()) 
            x++; 
        System.out.println(x); 
    } 
}