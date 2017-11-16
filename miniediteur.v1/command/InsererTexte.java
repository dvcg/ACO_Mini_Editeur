package command;

import invoker.Ihm;
import receiver.MoteurEdition;

/**
 * @author Chris_Gea
 *
 */

public class InsererTexte implements Command {

	MoteurEditeur me;
	Ihm ihm;
	
	/**
	 * Constructeur
	 * @param me Moteur éditeur
	 */
	public InsererTexte(MoteurEditeur me, Ihm ihm) {
		this.me = me;
		this.ihm = ihm;
	}

	@Override
	public void execute() {
		String caractereAInserer = ihm.getInputCharacter(); 
		me.insererTexte(caractereAInserer);
	}

}

