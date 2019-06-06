
class Animal {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am an Animal";
	}
}

class Cow extends Animal {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am a Cow";
	}
}

public class ObjectCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animalObj;
		Cow cowObj = new Cow();
		
		System.out.println(cowObj); // prints: I am a Cow
		animalObj = cowObj; // OK
		System.out.println(animalObj); // prints: I am a Cow
		
		animalObj = new Animal();
		System.out.println(animalObj); // prints: I am a Animal
		//cowObj = animalObj; // Compile-time error, incompatible type
		//cowObj = (Cow) animalObj; // OK at Compile-time, but it throws exceptions at run time.
		
		//Casting example with the instanceof
		if(animalObj instanceof Cow) {
			cowObj = (Cow) animalObj;
			System.out.println(cowObj);
			// This lines will never be reached
		}
		
	}

}
