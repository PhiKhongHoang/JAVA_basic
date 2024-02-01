
public class Cat extends Animal{
	public Cat() {
		super("Cat");
	}
	
	@Override
	public void eat() {
		System.out.println("Cat eating");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Cat make sounding");
	}
}
