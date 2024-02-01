
public class Bird extends Animal{
	public Bird() {
		super("Bird");
	}
	
	@Override
	public void eat() {
		System.out.println("Bird eating");
	}

	@Override
	public void makeSound() {
		System.out.println("Bird make sounding");
	}

}
