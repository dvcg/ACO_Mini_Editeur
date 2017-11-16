package command;

/**
 * @author Chris_Gea
 *
 */
import receiver.MoteurEditeur;

public class Supprimer implements Command {

	MoteurEditeur me;
	
	/**
	 * Constructeur
	 * @param me Moteur �dition
	 */
	public Supprimer(MoteurEditeur me) {
		this.me = me;
	}

	@Override
	public void execute() {
		me.supprimer();
	}

}
