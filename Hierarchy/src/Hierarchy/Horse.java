package Hierarchy;

public class Horse extends Animal {
	boolean veloz;
	
	@Override
	public void fazersom() {
		System.out.println("*Som de cavalo*");
	}
	
	public Horse() 
	{
		this.veloz=true;
	}
	
	public void status() {
		System.out.println("O nome do animal � " + this.nome);
		System.out.println("Sua idade � " + this.idade);
		System.out.println("Faz barulho? "+this.som);
		System.out.println("Pode correr? "+this.veloz);
	}

}
