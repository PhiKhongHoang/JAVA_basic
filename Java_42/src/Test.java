
public class Test {
	public static void main(String[] args) {
		Animal animal = new Animal("Animal");
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		System.out.println("Animal");
		animal.eat();
		animal.makeSound();
		animal.sleep();

		System.out.println("\nDog");
		dog.eat();
		dog.makeSound();
		dog.sleep();

		System.out.println("\nCat");
		cat.eat();
		cat.makeSound();
		cat.sleep();

		System.out.println("\nBird");
		bird.eat();
		bird.makeSound();
		bird.sleep();
	}
}
