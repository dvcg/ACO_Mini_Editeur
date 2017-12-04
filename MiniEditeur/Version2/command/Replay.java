/**
 * 
 */
package command;

import receiver.Enregistreur;

/**
 * @author Chris_Gea
 *
 */

public class Replay implements Command {

	Enregistreur recorder;
	
	/**
	 * Constructor
	 */
	public Replay(Enregistreur recorder){
		this.recorder = recorder;
	}
	
	@Override
	public void execute() {
		recorder.rejouer();
	}

}