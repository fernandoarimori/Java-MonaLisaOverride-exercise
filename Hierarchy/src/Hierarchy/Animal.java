package Hierarchy;

import java.util.Scanner;

public class Animal {
	String nome;
	int idade;
	boolean som;
	
	public void fazersom() {
		System.out.println("*Som de animal*");
	}
	

	Scanner x= new Scanner(System.in);
	Scanner y= new Scanner(System.in);
	
	public Animal() {
		System.out.println("Digite o nome do animal: ");
		nome=y.nextLine();
		System.out.println("Digite a idade do animal: ");
		idade=x.nextInt();
		this.som=true;

	}
		
	public void tempo(){
		if(idade<=0) {
			System.out.print("Idade indefinida\n");
		}
		else {
			System.out.print("A idade do cachorro � de "+this.idade);
		}
	}


	
	
	public void status() {
		System.out.println("O animal � " + this.nome);
		tempo();
		System.out.println("Faz barulho? "+this.som);

		
		
	}
}	



