package receiver;

import memento.CommandeEnregistrable;

/**
 *  Caretaker
 * @author Chris_Gea
 *
 */

public interface Enregistreur {
	public void enregistrer(CommandeEnregistrable c);
	public void demarrer();
	public void arreter();
	public void rejouer();

}
