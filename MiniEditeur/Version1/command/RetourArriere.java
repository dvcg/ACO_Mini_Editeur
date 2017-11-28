package command;

import receiver.MoteurEditeur;

/**
 * @author Chris_Gea
 *
 */
public class RetourArriere implements Command {

	MoteurEditeur me;
	
	/**
	 * Constructeur
	 * @param me Moteur éditeur
	 */
	public RetourArriere(MoteurEditeur me) {
		this.me = me;
	}

	@Override
	public void execute() {
		me.retourArriere();
	}

}
