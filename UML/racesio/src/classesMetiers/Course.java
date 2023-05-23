package classesMetiers;

import java.util.ArrayList;
import java.util.Date;

public class Course {
	//Attributs d'instance
	private String nom;
	private String typeCourse;
	private int nbrSpectateurs;
	private Circuit unCircuit;
	private ArrayList<Spectateur> lesSpectateus;
	private ArrayList<Ecurie> lesEcuries;
	
	
	
	//Constructeur
	public Course(String nom, String typeCourse, int nbrSpectateurs, Circuit unCircuit) {
		this.nom = nom;
		this.typeCourse = typeCourse;
		this.nbrSpectateurs = nbrSpectateurs;
		this.unCircuit = unCircuit;
		this.lesSpectateus = new ArrayList<Spectateur>();;
		this.lesEcuries = new ArrayList<Ecurie>();
	}
	
	
	//Les accesseurs des attributs d'instance
	public String getNom() {
		return nom;
	}


	public String getTypeCourse() {
		return typeCourse;
	}


	public int getNbrSpectateurs() {
		return nbrSpectateurs;
	}

	public Circuit getUnCircuit() {
		return unCircuit;
	}
	

	
	//Les accesseurs des de la collection de spécateurs
	
	//La taille 
	public int nombreSpectateurs() {
		if(this.lesSpectateus.size() != 0) {
			this.nbrSpectateurs = lesSpectateus.size();
		}
		return nbrSpectateurs;
	}
	
	//Ajouter un spéctateur
	public boolean ajouterSpectateur(Spectateur unSpectateur) {
		boolean verification = false;
		//vérifier si le spéctateur existe déja dans la collection
		if(!this.lesSpectateus.contains(unSpectateur)) {
			this.lesSpectateus.add(unSpectateur);
			verification = true;
		}
		
		return verification;
	}
	
	//Surcharge ajouter un spéctateur
	public boolean ajouterSpectateur(String unNom, String unPrenom, int unAge) {
		boolean verification = false;
		//vérifier si le spéctateur existe déja dans la collection
		
		if(!this.lesSpectateus.contains(new Spectateur(unNom, unPrenom,unAge))) {
			this.lesSpectateus.add(new Spectateur(unNom, unPrenom,unAge));
			verification = true;
		}
		
		return verification;
	}
	
	
	//supprimer un spéctateur
	public boolean supprimerSpectateur(Spectateur unSpectateur) {
		boolean verification = false;
		
		//vérifier si l'utilisateur existe
		if(!this.lesSpectateus.contains(unSpectateur)) {
			this.lesSpectateus.remove(unSpectateur);
			verification = true;
		}
		return verification;
	}
	
	
	//Supprimer à partir d'un nom du spéctateur
	public boolean supprimerSpectateur(String unNom) {
		boolean verification = false;
		//vérififier si l'utilisateur existe dans la colelction et récupérer son index
		
		int index = rechercheSpectateur(unNom);
		
		if(index != 0) {
			this.lesSpectateus.remove(index);
			verification = true;
		}
		
		return verification;
		
	}

	
	//Recherche 
	public int rechercheSpectateur(String unNom) {
		int index = 0;
		int i = 0;
		
		while(i < this.lesSpectateus.size() && !this.lesSpectateus.get(i).getNom().equals(unNom)) {
			i++;
		}
		
		if(i < this.lesSpectateus.size()) {
			index = i;
		}
		
		return index;
	}
	
	//Surcharge Recherche renvoie un Spectateur
	public Spectateur rechercheSpectateurA(String unNom){
		Spectateur unSpectateur = null;
	
		int i = 0;
		
		while(i < this.lesSpectateus.size() && !this.lesSpectateus.get(i).getNom().equals(unNom)) {
			i++;
		}
		
		if(i < this.lesSpectateus.size()) {
			unSpectateur = this.lesSpectateus.get(i);
		}
		
		return unSpectateur;
		
	}
	
	
	//Ajouter un écurie
	public boolean ajouterEcurie(Ecurie unEcurie) {
		boolean ver = false;
		
		if(!this.lesEcuries.contains(unEcurie)) {
			this.lesEcuries.add(unEcurie);
			ver = true;
		}
		
		return ver;
		
	}
	
	//Méthode toXml
	public String toXml() {
		String course = "";
		String courses = "";
		
		if (this.lesSpectateus.size() != 0) {
			courses +="<courses>\n";
			course +="<course>\n";
			course += "<nomcourse>" + this.getNom() + "<nomcourse> \n" ;
			course += "<typecourse>" + this.getTypeCourse() + "<typecourse> \n" ;
			course += "<nbrspectateurs>" + this.getNbrSpectateurs() + "<nbrspectateurs> \n" ;
			course += "<nomcircuit>" + this.unCircuit.getNom() + "<nomcircuit> \n";
			course += "<taillecircuit>" + this.unCircuit.getTaille()+ "<taillecircuit> \n";
			course += "<payscircuit>" + this.unCircuit.getPays() + "<payscircuit> \n";
			for(Spectateur unSpectateur : lesSpectateus) {
				course += "<nomspectateur>" + unSpectateur.getNom() + "<nomspectateur> \n" ;
				course += "<prenomspectateur>" + unSpectateur.getPrenom() + "<prenomspectateur> \n" ;
				course += "<agespectateur>" + unSpectateur.getAge() + "<agespectateur> \n" ;
			}
			for(Ecurie unEcurie : lesEcuries) {
				course += "<nomecurie>" + unEcurie.getNom() + "<nomecurie> \n" ;
				course += "<sponsortecurie>" + unEcurie.getSponsort() + "<sponsortecurie> \n" ;
				course += "<motoriste>" + unEcurie.getMotoriste() + "<motoriste> \n" ;
				for(Personnel unPersonnel : unEcurie.getLesPersonnels()) {
					course += "<nompersonnel>" + unPersonnel.getNom() + "<nompersonnel> \n" ;
					course += "<prenompersonnel>" + unPersonnel.getPrenom() + "<prenompersonnel> \n" ;
					course += "<adressepersonnel>" + unPersonnel.getAdresse() + "<adressepersonnel> \n" ;
					course += "<cppersonnel>" + unPersonnel.getCp() + "<cppersonnel> \n" ;
					course += "<villepersonnel>" + unPersonnel.getVille() + "<villepersonnel> \n" ;
				}
			}
			course += "<course>\n";
			courses += course;
			courses += "<courses>\n";
		}
		
		return courses;
		
	}
	
}
