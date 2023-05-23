package panelEcurie;

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
import javax.swing.SwingUtilities;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import classesFenetres.UI;
import net.miginfocom.swing.MigLayout;
import javax.swing.Action;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

//Panel
public class PAjouterEcurie extends JPanel {
	private static final long serialVersionUID = 1L;
	//Attribut d'instance graphique
	private JPanel panel_menu;
	private JButton btnActionSauvegarder;
	private JPanel panel_principal;
	private JPanel panel_circuit;
	private JLabel lblNom;
	private JLabel lblSponsort;
	private JLabel lblMotoriste;
	private JLabel lblMessage;
	private JLabel lblAjouteEcurie;
	private JTextField textFieldMotoriste;
	private JTextField textFieldNom;
	private JTextField textFieldSponsort;
	private JPanel panel_circuit_1;
	private JLabel lblLesPersonnels;
	private JList listPersonnels;
	
	
	//constructeur
	public PAjouterEcurie() {
		
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
		
		lblAjouteEcurie = new JLabel("Ajouter une écurie");
		lblAjouteEcurie.setForeground(Color.GRAY);
		lblAjouteEcurie.setFont(new Font("Dialog", Font.BOLD, 16));
		GridBagConstraints gbc_lblAjouteEcurie = new GridBagConstraints();
		gbc_lblAjouteEcurie.insets = new Insets(0, 0, 5, 0);
		gbc_lblAjouteEcurie.gridx = 0;
		gbc_lblAjouteEcurie.gridy = 0;
		panel_menu.add(lblAjouteEcurie, gbc_lblAjouteEcurie);
        
		
		
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
				panel_circuit = new JPanel();
				panel_circuit.setOpaque(false);
				panel_circuit.setBorder(new CompoundBorder(
						new CompoundBorder(	new EmptyBorder(5, 5, 5, 5), 
											new TitledBorder(
													new LineBorder(new Color(0, 0, 0), 1, true),
													"Ecurie", TitledBorder.LEADING, TitledBorder.TOP, null, Color.GRAY)),
						new EmptyBorder(5, 5, 5, 5)));
				panel_principal.add(panel_circuit, "cell 0 1,grow");
				GridBagLayout gbl_panel_circuit = new GridBagLayout();
				gbl_panel_circuit.columnWidths = new int[] { 56, 146, 34, 146, 0 };
				gbl_panel_circuit.rowHeights = new int[] { 26, 26, 0, 0 };
				gbl_panel_circuit.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0,
						Double.MIN_VALUE };
				gbl_panel_circuit.rowWeights = new double[] { 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panel_circuit.setLayout(gbl_panel_circuit);

				//Champs espece
				lblNom = new JLabel("Nom");
				lblNom.setFont(new Font("Roboto Lt", Font.PLAIN, 13));
				GridBagConstraints gbc_lblNom = new GridBagConstraints();
				gbc_lblNom.anchor = GridBagConstraints.WEST;
				gbc_lblNom.insets = new Insets(0, 0, 5, 5);
				gbc_lblNom.gridx = 0;
				gbc_lblNom.gridy = 0;
				panel_circuit.add(lblNom, gbc_lblNom);
				UI.habiller(lblNom);
				
				textFieldNom = new JTextField();
				GridBagConstraints gbc_textFieldNom = new GridBagConstraints();
				gbc_textFieldNom.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldNom.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldNom.gridx = 1;
				gbc_textFieldNom.gridy = 0;
				panel_circuit.add(textFieldNom, gbc_textFieldNom);
				textFieldNom.setColumns(10);
		        
				//Champs nom
				lblSponsort = new JLabel("Sponsort");
				lblSponsort.setFont(new Font("Roboto Lt", Font.PLAIN, 13));
				GridBagConstraints gbc_lblSponsort = new GridBagConstraints();
				gbc_lblSponsort.anchor = GridBagConstraints.EAST;
				gbc_lblSponsort.insets = new Insets(0, 0, 5, 5);
				gbc_lblSponsort.gridx = 2;
				gbc_lblSponsort.gridy = 0;
				panel_circuit.add(lblSponsort, gbc_lblSponsort);
				UI.habiller(lblSponsort);
				
				textFieldSponsort = new JTextField();
				GridBagConstraints gbc_textFieldSponsort = new GridBagConstraints();
				gbc_textFieldSponsort.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldSponsort.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldSponsort.gridx = 3;
				gbc_textFieldSponsort.gridy = 0;
				panel_circuit.add(textFieldSponsort, gbc_textFieldSponsort);
				textFieldSponsort.setColumns(10);
		        
				//Champs adresse
				lblMotoriste = new JLabel("Motoriste");
				lblMotoriste.setFont(new Font("Roboto Lt", Font.PLAIN, 13));
				GridBagConstraints gbc_lblMotoriste = new GridBagConstraints();
				gbc_lblMotoriste.anchor = GridBagConstraints.WEST;
				gbc_lblMotoriste.insets = new Insets(0, 0, 5, 5);
				gbc_lblMotoriste.gridx = 0;
				gbc_lblMotoriste.gridy = 1;
				panel_circuit.add(lblMotoriste, gbc_lblMotoriste);
				UI.habiller(lblMotoriste);
				
				textFieldMotoriste = new JTextField();
				textFieldMotoriste.setColumns(10);
				GridBagConstraints gbc_textFieldMotoriste = new GridBagConstraints();
				gbc_textFieldMotoriste.insets = new Insets(0, 0, 5, 5);
				gbc_textFieldMotoriste.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldMotoriste.gridx = 1;
				gbc_textFieldMotoriste.gridy = 1;
				panel_circuit.add(textFieldMotoriste, gbc_textFieldMotoriste);
				
				panel_circuit_1 = new JPanel();
				panel_circuit_1.setOpaque(false);
				panel_circuit_1.setBorder(new CompoundBorder(
										new CompoundBorder(	new EmptyBorder(5, 5, 5, 5), 
															new TitledBorder(
																	new LineBorder(new Color(0, 0, 0), 1, true),
																	"Personnel", TitledBorder.LEADING, TitledBorder.TOP, null, Color.GRAY)),
										new EmptyBorder(5, 5, 5, 5)));
				panel_principal.add(panel_circuit_1, "cell 0 2,growx,aligny top");
				GridBagLayout gbl_panel_circuit_1 = new GridBagLayout();
				gbl_panel_circuit_1.columnWidths = new int[]{56, 146, 34, 146, 0};
				gbl_panel_circuit_1.rowHeights = new int[]{26, 26, 0, 0};
				gbl_panel_circuit_1.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
				gbl_panel_circuit_1.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
				panel_circuit_1.setLayout(gbl_panel_circuit_1);
				
				lblLesPersonnels = new JLabel("Les pesonnels");
				lblLesPersonnels.setFont(new Font("Dialog", Font.PLAIN, 13));
				GridBagConstraints gbc_lblLesPersonnels = new GridBagConstraints();
				gbc_lblLesPersonnels.anchor = GridBagConstraints.WEST;
				gbc_lblLesPersonnels.insets = new Insets(0, 0, 5, 5);
				gbc_lblLesPersonnels.gridx = 0;
				gbc_lblLesPersonnels.gridy = 0;
				panel_circuit_1.add(lblLesPersonnels, gbc_lblLesPersonnels);
				
				listPersonnels = new JList();
				GridBagConstraints gbc_listPersonnels = new GridBagConstraints();
				gbc_listPersonnels.insets = new Insets(0, 0, 5, 5);
				gbc_listPersonnels.fill = GridBagConstraints.BOTH;
				gbc_listPersonnels.gridx = 1;
				gbc_listPersonnels.gridy = 0;
				panel_circuit_1.add(listPersonnels, gbc_listPersonnels);			
				
	}
	


    
 
}
