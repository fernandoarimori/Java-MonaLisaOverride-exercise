package Hierarchy;

public class Sloth extends Animal {
	boolean arvore;
	
	@Override
	public void fazersom() {
		System.out.println("*Som de pregui�a*");
	}
	
	public Sloth() 
	{
		this.arvore=true;
	}
	
	public void status() {
		System.out.println("O nome do animal � " + this.nome);
		System.out.println("Sua idade � " + this.idade);
		System.out.println("Faz barulho? "+this.som);
		System.out.println("Consegue subir em �rvore? "+this.arvore);
	}

}


