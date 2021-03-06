/**
 * 
 */
package command;

import memento.CommandeEnregistrable;
import memento.MementoCopier;
import memento.Memento;
import receiver.Enregistreur;
import receiver.MoteurEditeur;

/**
 * @author Chris_Gea
 *
 */
public class EnregRetourArriere extends RetourArriere implements CommandeEnregistrable {

	Enregistreur recorder;
	
	public EnregRetourArriere(MoteurEditeur me, Enregistreur enregistreur) {
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
		// Aucun Etat � Restaurer
		super.execute();
	}



}
