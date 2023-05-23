package panelSpectateur;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import classesFenetres.UI;
import net.miginfocom.swing.MigLayout;


//Panel
public class PAjouterSpectateur extends JPanel {
	private static final long serialVersionUID = 1L;
	//Attribut d'instance graphique
	private JPanel panel_menu;
	private JButton btnActionSauvegarder;
	private JPanel panel_principal;
	private JPanel panel_identite;
	private JLabel lblNom;
	private JLabel lblPrenom;
	private JLabel lblAge;
	private JLabel lblMessage;
	private JLabel lblAjouterSpectateur;
	private JTextField textFielAge;
	private JTextField textFieldNom;
	private JTextField textFieldPrenom;
	private JLabel lblVille;
	private JTextField textFieldVille;
	private JPanel panel_fonction;
	
	
	//constructeur
	public PAjouterSpectateur() {
		
		//propriétés panneau principal
		setBackground(Color.LIGHT_GRAY);
		setBorder(null);
		setLayout(new BorderLayout(0, 0));
        
		//Panneau menu situé à gauche du panneau principal
		panel_menu = new JPanel();
		panel_menu.setForeground(Color.WHITE);
		panel_menu.setBackground(Color.DARK_GRAY);
		add(panel_menu, BorderLayout.WEST);
		panel_menu.setBorder(new CompoundBorder(null, new EmptyBorder(5, 5, 5,
				5)));
		GridBagLayout gbl_panel_menu = new GridBagLayout();
		gbl_panel_menu.columnWidths = new int[] { 0, 0 };
		gbl_panel_menu.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_menu.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel_menu.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_menu.setLayout(gbl_panel_menu);
		
		lblAjouterSpectateur = new JLabel("Ajouter un spéctateur");
		lblAjouterSpectateur.setForeground(Color.LIGHT_GRAY);
		lblAjouterSpectateur.setFont(new Font("Dialog", Font.BOLD, 16));
		GridBagConstraints gbc_lblAjouterSpectateur = new GridBagConstraints();
		gbc_lblAjouterSpectateur.insets = new Insets(0, 0, 5, 0);
		gbc_lblAjouterSpectateur.gridx = 0;
		gbc_lblAjouterSpectateur.gridy = 0;
		panel_menu.add(lblAjouterSpectateur, gbc_lblAjouterSpectateur);
        
		
		
		//Action Sauvegarder
		btnActionSauvegarder = new JButton("Sauvegarder");
		
		btnActionSauvegarder.setForeground(Color.GRAY);
		btnActionSauvegarder.setFont(new Font("Roboto Lt", Font.BOLD, 14));
		//configureAction(btnAction);
		btnActionSauvegarder.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnActionSauvegarder = new GridBagConstraints();
		gbc_btnActionSauvegarder.anchor = GridBagConstraints.LINE_START;
		gbc_btnActionSauvegarder.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnActionSauvegarder.insets = new Insets(0, 0, 5, 0);
		gbc_btnActionSauvegarder.gridx = 0;
		gbc_btnActionSauvegarder.gridy = 1;
		btnActionSauvegarder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		panel_menu.add(btnActionSauvegarder, gbc_btnActionSauvegarder);
		
		
		lblMessage = new JLabel("Remplier le formulair ");
		lblMessage.setForeground(Color.LIGHT_GRAY);
		lblMessage.setFont(new Font("Dialog", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMessage = new GridBagConstraints();
		gbc_lblMessage.insets = new Insets(0, 0, 5, 0);
		gbc_lblMessage.gridx = 0;
		gbc_lblMessage.gridy = 3;
		panel_menu.add(lblMessage, gbc_lblMessage);

		//Panneau central au centre du panneau principal
				panel_principal = new JPanel();
				panel_principal.setBackground(Color.LIGHT_GRAY);
				add(panel_principal, BorderLayout.CENTER);
				panel_principal.setLayout(new MigLayout("", "[grow]", "[][][grow][grow]"));
				
				
				//Panneau Etat-civil situ� dans le panneau formulaire
				panel_identite = new JPanel();
				panel_identite.setOpaque(false);
				panel_identite.setBorder(new CompoundBorder(
						new CompoundBorder(	new EmptyBorder(5, 5, 5, 5), 
											new TitledBorder(
													new LineBorder(new Color(0, 0, 0), 1, true),
													"Identité", TitledBorder.LEADING, TitledBorder.TOP, null, Color.GRAY)),
						new EmptyBorder(5, 5, 5, 5)));
				panel_principal.add(panel_identite, "cell 0 1,grow");
				GridBagLayout gbl_panel_identite = new GridBagLayout();
				gbl_panel_identite.columnWidths = new int[] { 56, 146, 34, 146, 0 };
				gbl_panel_identite.rowHeights = new int[] { 26, 26, 0, 0, 0 };
				gbl_panel_identite.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0,
						Double.MIN_VALUE };
				gbl_panel_identite.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panel_identite.setLayout(gbl_panel_identite);

				//Champs espece
				lblNom = new JLabel("Nom");
				lblNom.setFont(new Font("Dialog", Font.PLAIN, 13));
				GridBagConstraints gbc_lblNom = new GridBagConstraints();
				gbc_lblNom.anchor = GridBagConstraints.WEST;
				gbc_lblNom.insets = new Insets(0, 0, 5, 5);
				gbc_lblNom.gridx = 0;
				gbc_lblNom.gridy = 0;
				panel_identite.add(lblNom, gbc_lblNom);
				UI.habiller(lblNom);
				
				textFieldNom = new JTextField();
				GridBagConstraints gbc_textFieldNom = new GridBagConstraints();
				gbc_textFieldNom.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldNom.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldNom.gridx = 1;
				gbc_textFieldNom.gridy = 0;
				panel_identite.add(textFieldNom, gbc_textFieldNom);
				textFieldNom.setColumns(10);
		        
				//Champs nom
				lblPrenom = new JLabel("Prénom");
				lblPrenom.setFont(new Font("Roboto Lt", Font.PLAIN, 13));
				GridBagConstraints gbc_lblPrenom = new GridBagConstraints();
				gbc_lblPrenom.anchor = GridBagConstraints.EAST;
				gbc_lblPrenom.insets = new Insets(0, 0, 5, 5);
				gbc_lblPrenom.gridx = 2;
				gbc_lblPrenom.gridy = 0;
				panel_identite.add(lblPrenom, gbc_lblPrenom);
				UI.habiller(lblPrenom);
				
				textFieldPrenom = new JTextField();
				GridBagConstraints gbc_textFieldPrenom = new GridBagConstraints();
				gbc_textFieldPrenom.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldPrenom.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldPrenom.gridx = 3;
				gbc_textFieldPrenom.gridy = 0;
				panel_identite.add(textFieldPrenom, gbc_textFieldPrenom);
				textFieldPrenom.setColumns(10);
		        
				//Champs adresse
				lblAge = new JLabel("Age");
				lblAge.setFont(new Font("Dialog", Font.PLAIN, 13));
				GridBagConstraints gbc_lblAge = new GridBagConstraints();
				gbc_lblAge.anchor = GridBagConstraints.WEST;
				gbc_lblAge.insets = new Insets(0, 0, 5, 5);
				gbc_lblAge.gridx = 0;
				gbc_lblAge.gridy = 1;
				panel_identite.add(lblAge, gbc_lblAge);
				UI.habiller(lblAge);
				
				textFielAge = new JTextField();
				textFielAge.setColumns(10);
				GridBagConstraints gbc_textFielAge = new GridBagConstraints();
				gbc_textFielAge.insets = new Insets(0, 0, 5, 5);
				gbc_textFielAge.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFielAge.gridx = 1;
				gbc_textFielAge.gridy = 1;
				panel_identite.add(textFielAge, gbc_textFielAge);
				
				lblVille = new JLabel("Ville");
				lblVille.setFont(new Font("Dialog", Font.PLAIN, 13));
				GridBagConstraints gbc_lblVille = new GridBagConstraints();
				gbc_lblVille.anchor = GridBagConstraints.WEST;
				gbc_lblVille.insets = new Insets(0, 0, 5, 5);
				gbc_lblVille.gridx = 2;
				gbc_lblVille.gridy = 1;
				panel_identite.add(lblVille, gbc_lblVille);
				
				textFieldVille = new JTextField();
				GridBagConstraints gbc_textFieldVille = new GridBagConstraints();
				gbc_textFieldVille.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldVille.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldVille.gridx = 3;
				gbc_textFieldVille.gridy = 1;
				panel_identite.add(textFieldVille, gbc_textFieldVille);
				textFieldVille.setColumns(10);
				
				panel_fonction = new JPanel();
				panel_fonction.setOpaque(false);
				panel_fonction.setBorder(new CompoundBorder(

										new CompoundBorder(	new EmptyBorder(5, 5, 5, 5), 

															new TitledBorder(

																	new LineBorder(new Color(0, 0, 0), 1, true),

																	"Fonctions", TitledBorder.LEADING, TitledBorder.TOP, null, Color.GRAY)),

										new EmptyBorder(5, 5, 5, 5)));
				panel_principal.add(panel_fonction, "cell 0 2,grow");
				GridBagLayout gbl_panel_fonction = new GridBagLayout();
				gbl_panel_fonction.columnWidths = new int[]{56, 146, 34, 146, 0};
				gbl_panel_fonction.rowHeights = new int[]{26, 26, 0, 0, 0};
				gbl_panel_fonction.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
				gbl_panel_fonction.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				panel_fonction.setLayout(gbl_panel_fonction);
	}
	

    
 
}
