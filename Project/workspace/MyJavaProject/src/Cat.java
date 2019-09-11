
public class Cat extends Animal {

	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cat mews");
	}
	
	public void eat(){
		System.out.println("Cat eats rat");
	}
	
	
	public static void main(String[] agrs){
		
		Cat c = new Cat();
		Dog d = new Dog();
		d.eat();
		d.sound();
		c.sound();
		c.eat();
	}
	
	

}
