package memento;

import command.Command;

/**
 * @author Chris_Gea
 *
 */

public interface CommandeEnregistrable extends Command {
	public void execute();
	public Memento getMemento();
	public void setMemento(Memento m);
}
