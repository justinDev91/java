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
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import classesFenetres.UI;
import net.miginfocom.swing.MigLayout;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

//Panel
public class PSupprimerEcurie extends JPanel {
	private static final long serialVersionUID = 1L;
	//Attribut d'instance graphique
	private JPanel panel_menu;
	private JButton btnActionSupprimer;
	private JButton btnAnnuler;
	private JPanel panel_principal;
	private JPanel panel_circuit;
	private JLabel lblLesecuties;
	private JLabel lblMessage;
	private JLabel lblSupprimerEcurie;
	private JButton btnRetour;
	private JList listEcuries;
	
	
	//constructeur
	public PSupprimerEcurie() {
		
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
		
		lblSupprimerEcurie = new JLabel("Supprimer les écuries ");
		lblSupprimerEcurie.setForeground(Color.WHITE);
		lblSupprimerEcurie.setFont(new Font("Dialog", Font.BOLD, 16));
		GridBagConstraints gbc_lblSupprimerEcurie = new GridBagConstraints();
		gbc_lblSupprimerEcurie.insets = new Insets(0, 0, 5, 0);
		gbc_lblSupprimerEcurie.gridx = 0;
		gbc_lblSupprimerEcurie.gridy = 0;
		panel_menu.add(lblSupprimerEcurie, gbc_lblSupprimerEcurie);
        
		
		
		//Action Sauvegarder
		btnActionSupprimer = new JButton("Supprimer");
		
		btnActionSupprimer.setForeground(Color.BLACK);
		btnActionSupprimer.setFont(new Font("Roboto Lt", Font.BOLD, 14));
		//configureAction(btnAction);
		btnActionSupprimer.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnActionSupprimer = new GridBagConstraints();
		gbc_btnActionSupprimer.anchor = GridBagConstraints.LINE_START;
		gbc_btnActionSupprimer.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnActionSupprimer.insets = new Insets(0, 0, 5, 0);
		gbc_btnActionSupprimer.gridx = 0;
		gbc_btnActionSupprimer.gridy = 1;
		btnActionSupprimer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		panel_menu.add(btnActionSupprimer, gbc_btnActionSupprimer);
		
		
		lblMessage = new JLabel("Séléctionner les écuries");
		lblMessage.setForeground(Color.WHITE);
		lblMessage.setFont(new Font("Dialog", Font.PLAIN, 15));
		GridBagConstraints gbc_lblMessage = new GridBagConstraints();
		gbc_lblMessage.insets = new Insets(0, 0, 5, 0);
		gbc_lblMessage.gridx = 0;
		gbc_lblMessage.gridy = 3;
		panel_menu.add(lblMessage, gbc_lblMessage);
		
		//Action annuler
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.setFont(new Font("Roboto Lt", Font.BOLD, 14));
		btnAnnuler.setForeground(Color.BLACK);
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.insets = new Insets(0, 0, 5, 0);
		gbc_btnAnnuler.weighty = 1.0;
		gbc_btnAnnuler.anchor = GridBagConstraints.NORTH;
		gbc_btnAnnuler.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAnnuler.gridx = 0;
		gbc_btnAnnuler.gridy = 4;
		btnAnnuler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		panel_menu.add(btnAnnuler, gbc_btnAnnuler);
		UI.deshabillerBouton(btnAnnuler, "Cancel");
		
		btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRetour.setForeground(Color.BLACK);
		btnRetour.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_btnRetour = new GridBagConstraints();
		gbc_btnRetour.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRetour.insets = new Insets(0, 0, 5, 0);
		gbc_btnRetour.gridx = 0;
		gbc_btnRetour.gridy = 5;
		panel_menu.add(btnRetour, gbc_btnRetour);

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
													"Circuit", TitledBorder.LEADING, TitledBorder.TOP, null, Color.GRAY)),
						new EmptyBorder(5, 5, 5, 5)));
				panel_principal.add(panel_circuit, "cell 0 1,grow");
				GridBagLayout gbl_panel_circuit = new GridBagLayout();
				gbl_panel_circuit.columnWidths = new int[] { 56, 146, 34, 146, 0 };
				gbl_panel_circuit.rowHeights = new int[] { 26, 26, 0, 0 };
				gbl_panel_circuit.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0,
						Double.MIN_VALUE };
				gbl_panel_circuit.rowWeights = new double[] { 1.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panel_circuit.setLayout(gbl_panel_circuit);

				//Champs espece
				lblLesecuties = new JLabel("Les écuries");
				lblLesecuties.setFont(new Font("Roboto Lt", Font.PLAIN, 13));
				GridBagConstraints gbc_lblLesecuties = new GridBagConstraints();
				gbc_lblLesecuties.anchor = GridBagConstraints.WEST;
				gbc_lblLesecuties.insets = new Insets(0, 0, 5, 5);
				gbc_lblLesecuties.gridx = 0;
				gbc_lblLesecuties.gridy = 0;
				panel_circuit.add(lblLesecuties, gbc_lblLesecuties);
				UI.habiller(lblLesecuties);
				
				listEcuries = new JList();
				GridBagConstraints gbc_listEcuries = new GridBagConstraints();
				gbc_listEcuries.insets = new Insets(0, 0, 5, 5);
				gbc_listEcuries.fill = GridBagConstraints.BOTH;
				gbc_listEcuries.gridx = 1;
				gbc_listEcuries.gridy = 0;
				panel_circuit.add(listEcuries, gbc_listEcuries);
				
				
				SwingUtilities.invokeLater(
						() -> btnAnnuler.requestFocusInWindow()		
				);
				
				
	}
	
	//Action annuler
	void setActionAnnuler(Action action) {
		btnAnnuler.setAction(action);
		UI.deshabillerBouton(btnAnnuler, "Cancel");
	}

    
 
}
