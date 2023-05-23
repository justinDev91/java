package main;

import classesMetiers.ModelDB;

public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModelDB con = new ModelDB();
		
		//boolean verCircuit = con.ajouterCircuit("tatasi", 50, "france");
		//boolean verEcurie  = con.ajouterEcurie("startup", "mrRobot", "izzy", 1);
		//boolean verCourse  = con.ajouterCourse("CarDix", "voiture", 420);
		//boolean verPersonnel  = con.ajouterPersonnel("etshumba", "daisy", "dandas-street", "toronto", "1050", 1);
		//boolean verMecanicien = con.ajouterMecanicien(3, "Mécanicien des pièces", "2019-05-20");
		//boolean verVoiture = con.ajouterVoiture("peugeot", "208", 50, 2, 2);
		
		boolean verSpectateur = con.ajouterSpectateur("esthumba", "daisy", 1);
		
		if (verSpectateur) {
			System.out.println("Ligne inséreée");
		} else {
			System.out.println("Insértion échoué");
		}
		

	}

}
