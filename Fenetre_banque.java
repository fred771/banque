import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
import java.io.* ;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class Fenetre_banque extends JFrame {
	/**
	*
	*	JMenuBar permet de créer les menus actifs .
	*	JMenuItem représentent les différentes options du menu.
	*/
	JTextField champstexte
	JButton quitter ;
	JMenuBar  menubar , base , compte , operation , sauve ;
	JMenuItem mCharger , mQuitter , mAjout , mSupp , mCredite , mDebite , mFerme , mSauve ;


	/**
	*
	*JTextArea permet de créer des zones de texte qui permettent d'enregistrer des données.
	*
	*/

	// Pour creer des fenêtres différentes pour chaque opération différente, utiliser
		JFrame.setcontentpane(jpanel);

	/**
	*
	*JButton permet de créer des boutons.
	*
	*/	

	// Début d'initialisation de la fenêtre
	public Fenetre_banque(String name){
		// Réglage de la taille et de la croix
		setDefaultCloseOperation(EXIT_ON_CLOSE) ; /** Fonction permettant de fermer un programme en cliquant sur la croix de la fenêtre */
		setTitle(name) ;
		setSize(1100,700);
		setResizable(false) ; /** La fenêtre ne pourra pas être redimensionnée */
		quitter = new JButton("Quitter") ;

		Container cont = getContentPane() ;
		setLayout(new BorderLayout()) ;
		JPanel baspage = new JPanel() ;
		cont.add("South" , baspage) ;
		baspage.add(quitter) ;		// ajout du bouton Quitter
		
		
		
		// JLabel id = new JLabel("Id ") ;
		// JTextField idText = new JTextField(5) ;
		// idText.setMaximumSize(idText.getPreferredSize()) ;

		// Box hbox = Box.createHorizontalBox() ;
		// hbox.add(id) ;
		// hbox.add(Box.createHorizontalStrut(5)) ;
		// hbox.add(idText) ;

		// Box vBox = Box.createVerticalBox() ;
		// vBox.add(hbox) ;

		/** Placement du menu et défintion de son contenu */
		menubar = new JMenuBar() ;
		JMenu m1 = new JMenu("Menu") ;
		JMenu m2 = new JMenu("Comptes") ;
		JMenu m3 = new JMenu("Operations") ;
		JMenu m4 = new JMenu("Sauvegarde") ;

		menubar.add(m1) ;
		menubar.add(m2) ;
		menubar.add(m3) ;
		menubar.add(m4) ;

		mCharger = new JMenuItem("Charger les comptes") ;
		mQuitter = new JMenuItem("Quitter") ;
		mAjout = new JMenuItem("Ajouter un compte") ;
		mSupp = new JMenuItem("Supprimer un compte") ;
		mCredite = new JMenuItem("Crediter") ;
		mDebite = new JMenuItem("Debiter") ;
		mFerme = new JMenuItem("Fermer un compte") ;
		mSauve = new JMenuItem("Sauvegarder") ;

		m1.add(mCharger) ;
		m1.add(mQuitter) ;
		m2.add(mAjout) ;
		m2.add(mSupp) ;
		m3.add(mCredite) ;
		m3.add(mDebite) ;
		m3.add(mFerme) ;
		m4.add(mSauve) ;

		
		quitter.addActionListener(new Quitter(this));
		mQuitter.addActionListener(new Quitter(this));


		setJMenuBar(menubar) ;
		setVisible(true) ;
	}

	/*		CLASS QUITTER  */
	class Quitter implements ActionListener{
		Fenetre_banque f ;
		Quitter(Fenetre_banque f ) {
			this.f = f ;
		}

		public void actionPerformed(ActionEvent e ){
			f.dispose() ;
			System.exit(0) ;
		}
	}

	public static void main(String[] args) {
		new Fenetre_banque("Ma banque") ;
	}
}