package fr.adaming.ecole.humain;

public class Eleve extends Humain {
	
	String classe;
	int niveau;
	
	public Eleve() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Eleve(String classe, int niveau) {
		super();
		this.classe = classe;
		this.niveau = niveau;
	}

	public void apprendre() {
		System.out.println("J apprends ...");
	}

}
