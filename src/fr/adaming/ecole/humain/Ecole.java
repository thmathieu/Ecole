package fr.adaming.ecole.humain;

public class Ecole {

	public static void main(String[] args) {
		
		// On crée des instances d'Eleve
		Eleve leMeilleur = new Eleve();
		Eleve lePire = new Eleve();
		Eleve leTricheur = new Eleve();
		
		// On crée des instances de Prof
		Prof leProf = new Prof();
		Prof leProfMath = new Prof("Master de Mathematiques", 2500);
		Prof leProfTechno = new Prof(2200);
		
		// Informations du prof de Maths
		leProfMath.adresse = "24 rue des oliviers 4150 DjerbaLaDouce";
		leProfMath.age = 120;
		leProfMath.nom = "Dumbledore";
		leProfMath.prenom = "Albus";
		leProfMath.sex = 'H'; // H = Homme
		
		System.out.println(leProfMath.toString());
		
		leProfMath.enseigner();
		leMeilleur.apprendre();

	}

}
