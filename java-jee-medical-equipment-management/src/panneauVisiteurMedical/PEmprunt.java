package panneauVisiteurMedical;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;


public class PEmprunt extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PEmprunt() {
		setLayout(null);
		
		JLabel titre = new JLabel("Mes emprunts");
		titre.setIcon(new ImageIcon(PEmprunt.class.getResource("/images/gestion/article/Product-64-actif.png")));
		titre.setForeground(Color.WHITE);
		titre.setFont(new Font("Roboto", Font.PLAIN, 14));
		titre.setBounds(26, 31, 281, 79);
		add(titre);
		
		JLabel background_img = new JLabel("");
		background_img.setBounds(-2, 5, 820, 478);
		background_img.setIcon(new ImageIcon(PEmprunt.class.getResource("/images/bg_recherche.png")));
		add(background_img);

	}
}
