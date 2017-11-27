package command;

import receiver.MoteurEditeur;
/**
 * @author Chris_Gea
 *
 */

public class Coller implements Command {
	
	MoteurEditeur me;
			
	/**
	 * Constructeur
	 * @param me Moteur éditeur
	 */
	public Coller(MoteurEditeur me) {
		this.me = me;
	}

	@Override
	public void execute() {
		me.coller();
	}

}

