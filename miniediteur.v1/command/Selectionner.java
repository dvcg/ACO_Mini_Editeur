package command;

import invoker.Ihm;
import receiver.MoteurEditeur;
import receiver.Selection;

/**
 * @author Chris_Gea
 *
 */
public class Selectionner implements Command {
	
	MoteurEditeur me;
	Ihm ihm;
	
	/**
	 * Constructeur
	 * @param me Moteur éditeur
	 */
	public Selectionner(MoteurEditeur me, Ihm ihm) {
		this.me = me;
		this.ihm = ihm;
	}

	@Override
	public void execute() {
		Selection selection = ihm.getSelection();
		me.selectionner(selection.getDebut(), selection.getFin());
	}

}
