package classesMetiers;

public class Spectateur {
	//Attributs de la classe
	private String nom;
	private String prenom;
	private int age;
	
	public Spectateur(String unNom, String unPrenom, int unAge) {
		this.nom = unNom;
		this.prenom = unPrenom;
		this.age = unAge;
	}

	//Les acceseurs
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}
	
	
	
}

