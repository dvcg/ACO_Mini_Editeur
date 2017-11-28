/**
 * 
 */
package command;

import receiver.MoteurEditeur;

/**
 * @author Chris_Gea
 *
 */

public class Copier implements Command {
	
	MoteurEditeur me;
	
	/**
	 * Constructeur
	 * @param me Moteur éditeur
	 */
	public Copier(MoteurEditeur me) {
		this.me = me;
	}

	@Override
	public void execute() {
		me.copier();
	}

}

