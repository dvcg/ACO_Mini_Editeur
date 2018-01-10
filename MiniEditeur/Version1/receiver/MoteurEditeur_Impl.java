package receiver;
import java.util.ArrayList;
import java.util.List;

import observer.Observer;
/**
 * @author DIANA
 * Cette classe est l'implementation du MoteurEditeur c'est elle 
 * qui fera tous les traitements
 */
public class MoteurEditeur_Impl implements MoteurEditeur {
	private PressePapier pressePapier;
	private Selection selection;
	private Buffer buffer;
	private List<Observer> observateurs = null;
	/**
	 * Constructeur de la classe MoteurE
	 * @param pressePapier
	 * @param selection
	 * @param buffer
	 * @param observateurs
	 */
	
	public MoteurEditeur_Impl() {
		super();
		this.pressePapier = new PressePapier();
		this.selection = new Selection();
		this.buffer = new Buffer();
		this.observateurs = new ArrayList<Observer>();
	}

	/*  
	 * Retourne le buffer
	 * @see receiver.MoteurEditeur#getBuffer()
	 */
	@Override
	public Buffer getBuffer() {
		// TODO Auto-generated method stub
		return this.buffer;
	}

	/* Retourne la selection
	 
	 * @see receiver.MoteurEditeur#getSelection()
	 */
	@Override
	public Selection getSelection() {
		
		return this.selection;
	}

	/* Retourne pressePapier
	 * @see receiver.MoteurEditeur#getPressePapier()
	 */
	@Override
	public PressePapier getPressePapier() {
		
		return this.pressePapier;
	}

	/* 
	 * @see receiver.MoteurEditeur#couper()
	 */
	@Override
	public void couper() {
		String TexteaCouper = buffer.recuperer(selection.getDebut(), selection.getFin());
		pressePapier.setContent( TexteaCouper);
		buffer.supprimer(selection.getDebut(), selection.getFin());
		selection.setFin(selection.getFin()); // Annule la selection
		notifyObservers(); //Notifie l'action aux observateurs
	}

	/**
	 * Défini le texte du presse papier à partir de la selection
	 */
	public void copier() {
		String TexteaCouper = buffer.recuperer(selection.getDebut(), selection.getFin());
		pressePapier.setContent(TexteaCouper);
		notifyObservers(); //Notifie l'action aux observateurs
	}

	/**
	 * Ajouter du texte au contenu du buffer à partir du contenu du
	 * presse-papier selon la position de début et de fin de la selection
	 */
	public void coller() {
		int debutSelect = selection.getDebut();
		int finSelect = selection.getFin();
		
        buffer.remplacer(debutSelect, finSelect, pressePapier.getContent());
		int newPosition = debutSelect + pressePapier.getContent().length();
		selection.setPosition(newPosition, newPosition); // Repositionne le curseur de selection et annule la selection
		
		notifyObservers(); //Notifie l'action aux observateurs
	}

	/**
	 * Insert du texte dans le buffer à la place de la selection courante, le
	 * cas échéant à la position du curseur
	 */
	public void insererTexte(String texte) {
	
		int debutSelect = selection.getDebut();
		int finSelect = selection.getFin();

		buffer.remplacer(debutSelect, finSelect, texte);
		
		int newPosition = debutSelect + texte.length();
		selection.setPosition(newPosition, newPosition); // Repositionne le curseur de selection et annule la selection
		
		notifyObservers(); 
	}

	/**
	 * Définit le début et la longueur de la selection
	 * 
	 * @param debut
	 *            Position de départ de la sélection
	 * @param fin
	 *            Position de fin de la selection
	 */
	public void selectionner(int debut, int fin) {
		selection.setPosition(debut, fin);
	}

	/**
	 * Supprime la selection du contenu du buffer 
	 * sinon le caractère précédent la position courante
	 */
	public void retourArriere() {
		int debutSelect = selection.getDebut();
		int finSelect = selection.getFin();
		int longueurSelect = finSelect - debutSelect;
		
		if (longueurSelect > 0) {
			buffer.supprimer(debutSelect, finSelect);
			selection.setFin(debutSelect); // Annule la selection précédente
		} else {
			if(debutSelect > 0){
				buffer.supprimer((debutSelect-1), debutSelect);
				selection.setPosition((debutSelect - 1), (debutSelect - 1)); // Repositionne le curseur
			}
		}
		notifyObservers(); //Notifie l'action aux observateurs
	}
	
	/**
	 * Supprime la selection du contenu du buffer 
	 * sinon le caractère suivant la position courante
	 */
	public void supprimer() {
		int debutSelect = selection.getDebut();
		int finSelect = selection.getFin();
		int longueurSelect = finSelect - debutSelect;
		
		if (longueurSelect > 0) {
			buffer.supprimer(debutSelect, finSelect);
			selection.setFin(debutSelect); // Annule la selection précédente
		} else {
			if(debutSelect > 0){
				buffer.supprimer(debutSelect, debutSelect+1);
				selection.setPosition(debutSelect, debutSelect); // Repositionne le curseur
			}
		}
		notifyObservers(); //Notifie l'action aux observateurs
	}
	
	/**
	 * -------------------------------------------
	* 			METHODES DE L'OBSERVER
	*  -------------------------------------------
	
	*
	 * Enregistre un nouvel observateur si celui-ci n'existe pas dans la liste des observateurs
	 */
	public void register(Observer o) {
		if (o == null) {
			throw new IllegalArgumentException("o is null");
		}
		if (observateurs.contains(o)) {
			throw new IllegalArgumentException("o is registered already");
		}
		observateurs.add(o);
	}

	/**
	 * Supprime un observateur qui exite dans la liste des observateur du moteur d'edition
	 */
	public void unregister(Observer o) {
		if (o == null) {
			throw new IllegalArgumentException("o is null");
		}
		if (!observateurs.contains(o)) {
			throw new IllegalArgumentException("o is not registered");
		}
		observateurs.remove(o);
	}

	/**
	 * Vérifie la présence d'un objet dans la collection des observateurs
	 */
	public boolean isAttach(Observer o) {
		if (o == null) {
			throw new IllegalArgumentException("o is null");
		}
		return observateurs.contains(o);
	}

	/**
	 * Mise à jour des observateurs
	 */
	public void notifyObservers() {
		for(Observer observer : observateurs){
			observer.update(this);
		}
	}
	
	/**
	 * Surchage toString
	 */
	public String toString() {
		return buffer.toString();
	}

}
