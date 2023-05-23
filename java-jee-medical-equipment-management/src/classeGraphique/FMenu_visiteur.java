package classeGraphique;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;
import java.awt.Font;
import panneauVisiteurMedical.PEmprunt;
import panneauVisiteurMedical.PRechercheMateriel;
import panneauVisiteurMedical.PRetourEmprunt;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JSpinner;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;


public class FMenu_visiteur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputNomLivre;
	private final Action actionRechercher = new ActionRechercher();
	private final Action actionAccueil = new ActionAccueil();
	private final Action actionEmprunt = new ActionEmprunt();
	private final Action actionRetourEmprunt = new ActionRetourEmprunt();
	private final Action actionDeconnexion = new ActionDeconnexion();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FMenu_visiteur frame = new FMenu_visiteur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FMenu_visiteur() {
		setTitle("Accuel");
		setIconImage(Toolkit.getDefaultToolkit().getImage(FMenu_visiteur.class.getResource("/images/accueil/People-128-actif.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 462);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuParametre = new JMenu("Paramètres");
		menuBar.add(menuParametre);
		
		JMenuItem mm_parametre = new JMenuItem("Changer l'utilisateur");
		menuParametre.add(mm_parametre);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mm_accueil = new JMenuItem("Accueil");
		mm_accueil.setAction(actionAccueil);
		mnMenu.add(mm_accueil);
		
		JMenuItem mm_emprunt = new JMenuItem("Emprunt");
		mm_emprunt.setAction(actionEmprunt);
		mnMenu.add(mm_emprunt);
		
		JMenuItem mm_retourEmprunt = new JMenuItem("Retour-Emprunt");
		mm_retourEmprunt.setAction(actionRetourEmprunt);
		mnMenu.add(mm_retourEmprunt);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRecherche = new JButton("Recherche");
		btnRecherche.setAction(actionRechercher);
		btnRecherche.setForeground(Color.WHITE);
		btnRecherche.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnRecherche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRecherche.setIcon(new ImageIcon(FMenu_visiteur.class.getResource("/images/gestion/Search-48.png")));
		btnRecherche.setBounds(27, 254, 164, 54);
		UI.deshabillerBouton(btnRecherche, "gestion", "Search", 48);
		btnRecherche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		contentPane.add(btnRecherche);
		
		JButton btnDeconnexion = new JButton("Déconnexion");
		btnDeconnexion.setAction(actionDeconnexion);
		btnDeconnexion.setFont(new Font("Roboto", Font.PLAIN, 11));
		btnDeconnexion.setForeground(Color.WHITE);
		btnDeconnexion.setIcon(new ImageIcon(FMenu_visiteur.class.getResource("/images/connection/Power-48.png")));
		btnDeconnexion.setBounds(10, 11, 191, 50);
		UI.deshabillerBouton(btnDeconnexion, "connection", "Power", 48);
		btnDeconnexion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));	
		contentPane.add(btnDeconnexion);
		
		JButton btnPret = new JButton("");
		btnPret.setAction(actionEmprunt);
		btnPret.setIcon(new ImageIcon(FMenu_visiteur.class.getResource("/images/accueil/pretIcon-128.png")));
		btnPret.setOpaque(false);
		btnPret.setBounds(559, 55, 136, 116);
		UI.deshabillerBouton(btnPret, "accueil", "pretIcon", 128);
		btnPret.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));	
		contentPane.add(btnPret);
		
		JSpinner duree = new JSpinner();
		duree.setToolTipText("Duree");
		duree.setBounds(350, 223, 67, 20);
		contentPane.add(duree);
		
		JLabel lblNewLabel = new JLabel("Quel est votre pays ?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto Lt", Font.PLAIN, 20));
		lblNewLabel.setBounds(59, 152, 283, 31);
		contentPane.add(lblNewLabel);
		
		JLocaleChooser localeChooser = new JLocaleChooser();
		localeChooser.setBounds(59, 182, 287, 20);
		contentPane.add(localeChooser);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(228, 223, 84, 20);
		contentPane.add(dateChooser);
		
		inputNomLivre = new JTextField();
		inputNomLivre.setForeground(Color.LIGHT_GRAY);
		inputNomLivre.setText("type de materiel");
		inputNomLivre.setBounds(93, 223, 94, 20);
		contentPane.add(inputNomLivre);
		inputNomLivre.setColumns(10);
		
		JLabel BarreRecherche = new JLabel("");
		BarreRecherche.setForeground(Color.LIGHT_GRAY);
		BarreRecherche.setIcon(new ImageIcon(FMenu_visiteur.class.getResource("/images/barreblanche Edited.png")));
		BarreRecherche.setBackground(Color.WHITE);
		BarreRecherche.setBounds(59, 213, 371, 41);
		contentPane.add(BarreRecherche);
		
		JButton btnRetour = new JButton("");
		btnRetour.setAction(actionRetourEmprunt);
		btnRetour.setOpaque(false);
		btnRetour.setIcon(new ImageIcon(FMenu_visiteur.class.getResource("/images/accueil/retourIcon-128.png")));
		btnRetour.setBounds(320, 55, 136, 116);
		UI.deshabillerBouton(btnRetour, "accueil", "retourIcon", 128);
		btnRetour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));	
		contentPane.add(btnRetour);
		
		JLabel background_img = new JLabel("");
		background_img.setIcon(new ImageIcon(FMenu_visiteur.class.getResource("/images/bg_visiteur.jpg")));
		background_img.setBounds(0, 0, 818, 433);
		contentPane.add(background_img);
	}
	
	private class ActionRechercher extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public ActionRechercher() {
			putValue(NAME, "Rechercher");
			putValue(SHORT_DESCRIPTION, "Recherches les matériels disponibles");
		}
		public void actionPerformed(ActionEvent e) {
			//changer de panel
			PRechercheMateriel uneRchercherMateriel = new PRechercheMateriel();
			changerPanneau(uneRchercherMateriel, "Panneau de recherche");
		}
	}
	
	
	//Changer de panneau 
	private void changerPanneau(JPanel panneau, String titre) { 
	     setContentPane(panneau); 
	     setTitle(titre); 
	     revalidate(); 
	 }
	private class ActionAccueil extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public ActionAccueil() {
			putValue(NAME, "Accueil");
			putValue(SHORT_DESCRIPTION, "Retourner à l'accueil");
		}
		public void actionPerformed(ActionEvent e) {
			//changer de panneau
			
			changerPanneau(contentPane, "Accueil");
		}
	}
	private class ActionEmprunt extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public ActionEmprunt() {
			putValue(NAME, "Emprunt");
			putValue(SHORT_DESCRIPTION, "La liste des emprunts");
		}
		public void actionPerformed(ActionEvent e) {
			//changer de panneau
			PEmprunt unPEmprunt = new PEmprunt();
			changerPanneau(unPEmprunt, "Emprunt");
		}
	}
	
	private class ActionRetourEmprunt extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public ActionRetourEmprunt() {
			putValue(NAME, "Retour-Emprunt");
			putValue(SHORT_DESCRIPTION, "Retouner les emprunts");
		}
		public void actionPerformed(ActionEvent e) {
			//changer de panneau
			PRetourEmprunt unPRetourEmprunt = new PRetourEmprunt();
			changerPanneau(unPRetourEmprunt, "Retour-Emprunt");
			
		}
	}
	
	private class ActionDeconnexion extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public ActionDeconnexion() {
			putValue(NAME, "Déconnexion");
			putValue(SHORT_DESCRIPTION, "Cliquer pour se déconnecter du programme");
		}
		public void actionPerformed(ActionEvent e) {
			//rediriger vers la fenetre de connexion
			FMenu_visiteur.this.dispose();
		}
	}
}
