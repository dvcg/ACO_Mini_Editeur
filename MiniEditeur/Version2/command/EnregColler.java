package command;

import memento.MementoColler;
import memento.CommandeEnregistrable;
import memento.Memento;
import receiver.Enregistreur;
import receiver.MoteurEditeur;

/**
 * @author Chris_Gea
 *
 */

public class EnregColler extends Coller implements CommandeEnregistrable {
	
	Enregistreur recorder;
	
	public EnregColler(MoteurEditeur me, Enregistreur enregistreur) {
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
		return new MementoColler();
	}

	@Override
	public void setMemento(Memento m) {
		// pas d'état à restaurer
		super.execute();
	}
	
}


