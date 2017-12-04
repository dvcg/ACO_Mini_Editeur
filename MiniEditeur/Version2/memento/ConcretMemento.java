package memento;

/**
 * @author Chris_Gea
 *
 */
public abstract class ConcretMemento implements Memento {

	private Object state;

	public Object getState() {
		return state;
	}

	public void setState(Object s) {
		state = s;
	}

}
