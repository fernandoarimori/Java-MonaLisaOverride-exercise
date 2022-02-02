package Hierarchy;

public class ObjectCreation {

	public static void main(String[] args) {
		//Mother
		Animal x = new Animal();
		x.status();
		x.fazersom();
		System.out.println("\n======================\n");
		
		//Dog
		Dog y = new Dog();
		y.status();
		y.fazersom();
	
		//Horse
		System.out.println("\n======================\n");
		Horse z = new Horse();
		z.status();
		z.fazersom();
		
		//Sloth
		System.out.println("\n======================\n");
		Sloth q = new Sloth();
		q.status();
		q.fazersom();

	}

}
