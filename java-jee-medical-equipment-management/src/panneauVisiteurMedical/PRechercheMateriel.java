package panneauVisiteurMedical;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class PRechercheMateriel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PRechercheMateriel() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setOpaque(false);
		scrollPane.setBounds(39, 107, 441, 306);
		add(scrollPane);
		
		JButton btnNewButton = new JButton("Emprunter");
		btnNewButton.setFont(new Font("Roboto", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(389, 39, 89, 23);
		add(btnNewButton);
		
		JLabel emprunterMat = new JLabel("Nom de matériel à emprunter : ");
		emprunterMat.setForeground(Color.WHITE);
		emprunterMat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		emprunterMat.setBounds(39, 41, 203, 14);
		add(emprunterMat);
		
		JLabel titre = new JLabel("Résultat de la recherche");
		titre.setForeground(Color.WHITE);
		titre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		titre.setBounds(39, 80, 203, 14);
		add(titre);
		
		/*
		for(int i = 100; i < 500; i++) {

			JPanel panelMateriel = new JPanel();
			panelMateriel.setOpaque(false);
			panelMateriel.setBounds(25, 48+i, 448, 98);
			add(panelMateriel);
			panelMateriel.setLayout(null);
			
			JButton btnNewButton = new JButton("Emprunter");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBackground(new Color(0, 206, 209));
			btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 13));
			btnNewButton.setBounds(120, 64, 100, 23);
			panelMateriel.add(btnNewButton);
			
			JLabel typeMateriel = new JLabel("Type de matériel : ");
			typeMateriel.setForeground(Color.WHITE);
			typeMateriel.setFont(new Font("Roboto", Font.PLAIN, 12));
			typeMateriel.setBounds(120, 45, 163, 14);
			panelMateriel.add(typeMateriel);
			
			JLabel disponibiliteMateriel = new JLabel("Disponible : ");
			disponibiliteMateriel.setForeground(Color.WHITE);
			disponibiliteMateriel.setFont(new Font("Roboto", Font.PLAIN, 12));
			disponibiliteMateriel.setBounds(120, 28, 163, 14);
			panelMateriel.add(disponibiliteMateriel);
			
			JLabel nomMateriel = new JLabel("Nom matériel :\r\n");
			nomMateriel.setForeground(Color.WHITE);
			nomMateriel.setFont(new Font("Roboto", Font.PLAIN, 12));
			nomMateriel.setBounds(120, 11, 162, 14);
			panelMateriel.add(nomMateriel);
			
			JLabel img_materiel = new JLabel("");
			img_materiel.setIcon(new ImageIcon(RechercheMateriel.class.getResource("/images/animal.png")));
			img_materiel.setBounds(10, 11, 100, 74);
			panelMateriel.add(img_materiel);
			
			i = i +100;
		}
		*/
		
		
		JLabel background_recherche = new JLabel("");
		background_recherche.setIcon(new ImageIcon(PRechercheMateriel.class.getResource("/images/bg_recherche.png")));
		background_recherche.setBounds(0, 0, 811, 424);
		add(background_recherche);
		
		textField = new JTextField();
		textField.setBounds(240, 38, 120, 20);
		add(textField);
		textField.setColumns(10);

	}
}
