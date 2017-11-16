/**
 * 
 */
package command;

import receiver.MoteurEditeur;

/**
 * @author Chris_Gea
 *
 */

public class Couper implements Command {


MoteurEditeur me;	
	
	/**
	 * Constructeur
	 * @param me Moteur éditeur
	 */
	public Couper(MoteurEditeur me) {
		this.me = me;
	}

	@Override
	public void execute() {
		me.couper();
	}

}

