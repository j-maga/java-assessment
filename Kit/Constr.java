package Kit;

class Dog
{
	
	Dog (boolean unused)
	{
	}
	
	Dog()
	{
		System.out.println("Parent");
	}
	
	Dog(String name)
	{
		System.out.println("Parent " + name);
	}
}

class Puppy extends Dog
{
	Puppy()
	{
		super("Leo");
		System.out.println("Child");
	}
}

public class Constr {
	public static void main(String[] args) {
		Dog dog = new Dog();
	}

}
