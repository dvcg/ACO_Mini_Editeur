/**
 * 
 */
package command;

import receiver.Enregistreur;

/**
 * @author Chris_Gea
 *
 */
public class Stop implements Command {
	
	Enregistreur recorder;
	
	/**
	 * Constructor
	 */
	public Stop(Enregistreur recorder){
		this.recorder = recorder;
	}
	
	@Override
	public void execute() {
		recorder.arreter();
	}


}
