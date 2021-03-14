package secondpartofjava;

public class dog {
	String breed;
	String name;
	String color;
	String size;
	
	public static void main(String[] args) {
		
		dog dog1= new dog();
		dog dog2= new dog();
		dog dog3 = new dog();
		
		dog1.breed= "Husky";
		dog2.breed= "Bulldog";
		dog3.breed= "Labrador";
		
		dog1.bark();
		dog1.run();
		dog1.play();
		
		dog2.bark();
		dog2.run();
		dog2.play();
		
		dog3.bark();
		dog3.run();
		dog3.play();
	}
		void bark() {
			System.out.println(breed + " can bark");
		}
		void run() {
			System.out.println(breed + " can run");
		}
		void play() {
			System.out.println(breed + " can play");
		}
		
		
		
	

	}


