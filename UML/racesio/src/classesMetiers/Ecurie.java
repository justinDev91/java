package classesMetiers;

import java.util.ArrayList;

public class Ecurie {
	private String nom;
	private String sponsort;
	private String motoriste;
	private ArrayList<Personnel> lesPersonnels;
	
	//Les constructeur
	public Ecurie(String nom, String sponsort, String motoriste) {
		super();
		this.nom = nom;
		this.sponsort = sponsort;
		this.motoriste = motoriste;
		this.lesPersonnels = new ArrayList<Personnel>();
	}

	public String getNom() {
		return nom;
	}

	public String getSponsort() {
		return sponsort;
	}

	public String getMotoriste() {
		return motoriste;
	}

	
	//Méthode d'instance
	public boolean ajouterPersonnel(Personnel unPersonnel) {
		boolean ver = false;
		
		//vérifier si le personell existe déja
		if (!this.lesPersonnels.contains(unPersonnel)) {
			this.lesPersonnels.add(unPersonnel);
			ver = true;
		}
		return ver;
	}

	public ArrayList<Personnel> getLesPersonnels() {
		return lesPersonnels;
	}

	//Méthode toSVG
	
	


}
