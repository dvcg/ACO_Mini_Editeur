package command;

import receiver.MoteurEditeur;
import receiver.MoteurEdition;

/**
 * @author Chris_Gea
 *
 */
public class RetourArriere implements Command {

	MoteurEditeur me;
	
	/**
	 * Constructeur
	 * @param me Moteur d'édition
	 */
	public RetourArriere(MoteurEdition me) {
		this.me = me;
	}

	@Override
	public void execute() {
		me.retourArriere();
	}

}
