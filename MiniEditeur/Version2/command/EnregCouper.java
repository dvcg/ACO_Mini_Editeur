/**
 * 
 */
package command;

/**
 * @author Chris_Gea
 *
 */

import memento.CommandeEnregistrable;
import memento.MementoCouper;
import memento.Memento;
import receiver.Enregistreur;
import receiver.MoteurEditeur;

public class EnregCouper extends Couper implements CommandeEnregistrable {
	
	Enregistreur recorder;
	
	public EnregCouper(MoteurEditeur me, Enregistreur enregistreur) {
		super(me);
		this.recorder = enregistreur;
	}
	
	@Override
	public void execute(){
		recorder.enregistrer(this);
		super.execute();
	}

	@Override
	public Memento getMemento() {
		return new MementoCouper();
	}

	@Override
	public void setMemento(Memento m) {
		// Aucun état à restaurer
		super.execute();
	}

}



