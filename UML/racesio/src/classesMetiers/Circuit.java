package classesMetiers;

import java.util.ArrayList;

public class Circuit {
	private String nom;
	private Double taille;
	private String pays;
	private ArrayList<Circuit> lesCircuts;
	
	
	//Le constructeur
	public Circuit(String nom, Double taille, String pays) {
		this.nom = nom;
		this.taille = taille;
		this.pays = pays;
		this.lesCircuts = new ArrayList<Circuit>();
	}

	//Accesseurs
	public  ArrayList<Circuit> getLesCircuts() {
		return lesCircuts;
	}

	
	public String getNom() {
		return nom;
	}

	public Double getTaille() {
		return taille;
	}

	public String getPays() {
		return pays;
	}
	
	//M�thode de la collection
	
	public boolean ajouterCircuit(Circuit unCircuit) {
		boolean ver = false;
		
		if(!this.lesCircuts.contains(unCircuit)) {
			this.lesCircuts.add(unCircuit);
			ver = true;
		}
		
		return ver;
	}
	
	
}
