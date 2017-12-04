package command;

/**
 * @author Chris_Gea
 *
 */

import memento.MementoCopier;
import memento.Memento;
import memento.CommandeEnregistrable;
import receiver.Enregistreur;
import receiver.MoteurEditeur;

public class EnregCopier extends Copier implements CommandeEnregistrable {
	
	Enregistreur recorder;
	
	public EnregCopier(MoteurEditeur me, Enregistreur enregistreur) {
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
		return new MementoCopier();
	}

	@Override
	public void setMemento(Memento m) {
		
		super.execute();
	}

}
