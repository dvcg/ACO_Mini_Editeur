package receiver;

/**
 * @author DIANA
 *
 */
public class Selection {

	private int debut;
	private int fin;
	
	/**
	 * 
	 *
	 */
	public Selection() {
		super();
		this.debut=0;
		this.fin=0;
	}

	public int getFin() {
		
		return this.fin;
	}

	/**
	 * Retourne la position de départ de la selection
	 * 
	 * @return
	 */
	public int getDebut() {
		
		return this.debut;
	}
	
	/**
	 * Sert à Mettre à jour le début et la fin de la selection
	 * 
	 * @param debut
	 * @param fin
	 */
	public void setPosition(int debut, int fin) {
		this.setDebut(Math.min(debut, fin));
		this.setFin(Math.max(debut, fin));
	}

	/**
	 * Met à jour la position de départ de la selection
	 * @param debut (position de depart)
	 * @return
	 */
	public void setDebut(int debut) {
		this.debut = (debut > 0) ? debut : 0;
	}

	/**
	 * Met à jour la position de fin de la selection
	 * @param fin (position de fin)
	 * @return
	 */
	public void setFin(int fin) {
		this.fin = (fin > 0) ? fin : 0;
	}
}
