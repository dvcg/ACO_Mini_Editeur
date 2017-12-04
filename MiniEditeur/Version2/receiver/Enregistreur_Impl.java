package receiver;


import java.util.ArrayList;
import java.util.List;

import memento.Memento;
import memento.CommandeEnregistrable;

/**
 * CARETAKER pour le pattern MEMENTO
 * et RECEIVER pour le pattern COMMAND
 * @author Chris_Gea
 *
 */

public class Enregistreur_Impl implements Enregistreur {

	private boolean recording;	
	private List<CommandeEnregistrable> cmds;
	private List<Memento> mementos;
	
	
	/**
	 * Constructor
	 */
	public Enregistreur_Impl() {
		cmds = new ArrayList<>();
		mementos = new ArrayList<>();
		recording = false;
	}
		
	/**
	 * Start recording by emptying the memento collection
       and passing the recording to true
	 */
	@Override
	public void demarrer() {
		cmds.clear();
		mementos.clear();
		recording = true;
	}

	/**
	 * Stop recording by passing the recording to false
	 */
	@Override
	public void arreter() {
		recording = false;
	}
	
	/**
	 * Add an originator to command collection
	 * @param c
	 */
	public void enregistrer(CommandeEnregistrable c) {
		if(recording) {
			cmds.add(c);
			mementos.add(c.getMemento());
		}
	}

	/**
	 * Restore saved states
	 */
	@Override
	public void rejouer() {
		this.arreter();
		if(cmds.size() == mementos.size())
		{
			for(int i = 0, j = cmds.size(); i<j; i++)
			{
				cmds.get(i).setMemento(mementos.get(i));
			}
		}
	}

}
