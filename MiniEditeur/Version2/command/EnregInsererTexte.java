/**
 * 
 */
package command;

import invoker.Ihm;
import memento.ConcretMemento;
import memento.MementoInsererTexte;
import memento.Memento;
import memento.CommandeEnregistrable;
import receiver.Enregistreur;
import receiver.MoteurEditeur;

/**
 * @author Chris_Gea
 *
 */
public class EnregInsererTexte extends InsererTexte implements CommandeEnregistrable {

	Enregistreur recorder;
	
	public EnregInsererTexte(MoteurEditeur me, Ihm ihm, Enregistreur enregistreur) {
		super(me, ihm);
		this.recorder = enregistreur;
	}

	@Override
	public void execute() {
		recorder.enregistrer(this);
		super.execute();
	}

	@Override
	public Memento getMemento() {
		 ConcretMemento memento = new MementoInsererTexte();
		 memento.setState(ihm.getInputCharacter()); // Retrieves the last character entered
		 return memento;
	}

	@Override
	public void setMemento(Memento m) {
		ConcretMemento cm = (ConcretMemento) m;
		ihm.setInputCharacter((String) cm.getState());
		super.execute();
	}

}
