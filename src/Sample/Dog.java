package Sample;

public class Dog extends Animal{

	 public Dog(String color) {
	        super(color);
	    }

	    void speak() {
	        System.out.println("Dog is barking!");
	    }

	    void sleep() {
	        System.out.println("Dog is sleeping!");
	    }

	    void eat() {
	        System.out.println("Dog is eating.");
	    }
	    
	    void move() {
			// TODO Auto-generated method stub
			System.out.println("Walking");
		}
	
}
