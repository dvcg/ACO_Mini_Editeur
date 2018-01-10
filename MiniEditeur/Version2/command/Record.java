/**
 * 
 */
package command;

import receiver.Enregistreur;
/**
 * @author Chris_Gea
 *
 */

public class Record implements Command {
	
	Enregistreur recorder;
	
	/**
	 * Constructor
	 */
	public Record(Enregistreur recorder){
		this.recorder = recorder;
	}
	
	@Override
	public void execute() {
		recorder.demarrer();
	}

}