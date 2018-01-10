/**
 * 
 */
package command;

import invoker.Ihm;
import memento.CommandeEnregistrable;
import memento.ConcretMemento;
import memento.Memento;
import memento.MementoSelectionner;
import receiver.Enregistreur;
import receiver.MoteurEditeur;
import receiver.Selection;

/**
 * @author Chris_Gea
 *
 */
public class EnregSelectionner extends Selectionner implements CommandeEnregistrable {

	Enregistreur recorder;
	
	public EnregSelectionner(MoteurEditeur me, Ihm ihm, Enregistreur enregistreur) {
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
		 ConcretMemento memento = new MementoSelectionner();
		 memento.setState(ihm.getSelection()); //Donne des infos sur les positions de la selection
		 return memento;
	}

	@Override
	public void setMemento(Memento m) {
		ConcretMemento cm = (ConcretMemento) m;
		Selection selection = (Selection) cm.getState();
		ihm.setSelection(selection.getDebut(), selection.getFin());
		super.execute();
	}

}
