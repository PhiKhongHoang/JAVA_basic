
public class Dog extends Animal{
	public Dog() {
		super("Dog");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog eating");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Dog make sounding");
	}
}
