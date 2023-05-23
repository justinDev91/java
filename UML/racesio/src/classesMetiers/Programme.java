package classesMetiers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Programme {

	public static void main(String[] args) {
		
		//Instancier un Spectateur
		Spectateur unSpectateur = new Spectateur("katasi", "Justin", 20);
		Spectateur uneSpectatrice = new Spectateur("Planche", "Cathy", 20);
		
		//instancier un circuit
		Circuit unCircuit = new Circuit("RayPlay", 500, "France");
		Circuit uCircuit = new Circuit("Bunch", 400, "Belgique");
		
		//instancier une course
		//créer une date;
		String date = "10-Oct-2020";
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		
		Date uneDate = new Date();
		
		try {
		    uneDate = formatter.parse(date);
		    formatter.format(date);
		} catch (ParseException e) {
		    System.out.println("Erreur de date");
		}
		
		
		Course uneCourse = new Course("voiture", "Rally", 20, uneDate, unCircuit);
		Course uneAutreCourse = new Course("Moto", "race", 30, uneDate, uCircuit);
		
		//Ajouter les spactateur
		uneCourse.ajouterSpectateur(unSpectateur);
		uneAutreCourse.ajouterSpectateur(uneSpectatrice);
		
		//instancier les Ecuries
		

		//Ajouter les spactateur
		Ecurie unEcurie = new Ecurie("DrayBool", "orange", "pirate");
		
		//Ajouter des personnels de l'écurie
			//instancier des personnels 
				//instancier une voiture
				Voiture uneVoiture = new Voiture("Peugeot", "5008", 500);
			Pilote unPilote = new Pilote("Deleor", "Jean", "20 rue de la breux", "fleury", "91701", unEcurie, 4570, "TZ40X", uneVoiture);
		
		unEcurie.ajouterPersonnel(unPilote);
		
		//Ajouter l'écurie à la course
		uneCourse.ajouterEcurie(unEcurie);
		
			
		System.out.println(uneCourse.toXml());
		
		//Ajouter un spectateur dans la liste de collection

		
		ModelDB db = new ModelDB();
		
		
		boolean ver = db.ConnexionUtilisateur("Katasi", "123456");
		
		System.out.println(ver);
		
		db.fermerConnexion();
		
	}

}
