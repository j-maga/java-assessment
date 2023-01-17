package Kit;

public class FoodParentObj {
	 String name;
	 int price;
	 FoodParentObj()
	 {
		 
	 }

	FoodParentObj(String n,int p)
	{
		this.name=n;
		this.price=p;
		System.out.println(name+" - "+price);
	}
	
	private void briyani()
	{
		System.out.println("\nnon veg");		
	}

	public static void main(String[] args)
	{
	
		FoodParentObj obj1 = new FoodParentObj();
		FoodParentObj obj2 = new FoodParentObj("briyani",120);
		FoodParentObj obj3 = new FoodParentObj("chicken briyani",150);
		Vegnonveg obj4 = obj1.new Vegnonveg();
		obj1.briyani();
		
		try
		{
			((FoodParentObj.Vegnonveg) obj1).sambar();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

		obj4.sambar();
		obj4.briyani();
		
	}
	
	class Vegnonveg extends FoodParentObj
	{
		public void sambar()
		{
			System.out.println("\nnamepure veg=sambar");	
		}
		public void briyani()
		{
			System.out.println("\nveg- kuska");		
		}
	}
}
