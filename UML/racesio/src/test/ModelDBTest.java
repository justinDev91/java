package test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classesMetiers.ModelDB;



/**
 * @author jkatasi
 *
 */
class ModelDBTest {
	//M�tode d'instance
	private ModelDB modele; 
	
	@BeforeEach
	void setUp() throws Exception {
		modele = new ModelDB();
	}

	/*
	*Option 1
	@Test
	void testPersonne() {
		if (! p.getLogin().equals("lmartin"))
			fail ("Pas de majuscules !!");
	}
	*/
	
	//Option 2
	@Test
	void testConnexion() {
		//Utilisation d'une méthode statique de la classe Assert
		//la fonction connexion doit tjrs renvoyer une booléen 
		
		System.out.println();
		
		boolean ver = modele.ConnexionUtilisateur("katasi", "5555");
		
		if (ver != true && ver != false) {
			System.out.println("Format non entendu");
		}
		
	}
	
	
	/*
	@Test
	void testGetLogin() {
		fail("Not yet implemented");
	}

	*/
	
	@Test
	void testAjoutCircuit() {
		//Assert.assertNotNull("Attributs non initialis�s",p.toStr
	}
	
	
}
