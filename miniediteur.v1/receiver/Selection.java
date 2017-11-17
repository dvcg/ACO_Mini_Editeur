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
	public Selection(int debut, int fin) {
		super();
		this.debut = debut;
		this.fin = fin;
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
		this.debut = debut;
	}

	/**
	 * Met à jour la position de fin de la selection
	 * @param fin (position de fin)
	 * @return
	 */
	public void setFin(int fin) {
		this.fin = fin;
	}
}
