package receiver;

public class Buffer {
	private StringBuffer contenu;
	
	/**
	 * @param contenu
	 */
	public Buffer(StringBuffer contenu) {
		super();
		this.contenu = contenu;
	}

	/**
	 * Constructeur Initialise le contenu du buffer
	 * 
	 * @param texte
	 *            Nouveau contenu du buffer
	 */
	public Buffer(String texte) {
		contenu = new StringBuffer(texte);
	}
	
	/**
	 * Retourne le texte du contenu du buffer
	 * 
	 * @return Le contenu textuel du buffer
	 */
	public String getBufferTexte() {
		return contenu.toString();
	}
	/**
	 * Recup�re le contenu du buffer
	 * 
	 * @return Le contenu (StringBuffer)
	 */
	public StringBuffer getContenu() {
		return contenu;
	}

	/**
	 * Retourne une partie du contenu du buffer dans les limites indiqu�es
	 * 
	 * @param indiceDebut
	 * @param indiceFin
	 * @return Un sous ensemble du texte du buffer
	 */
	public String recuperer(int indiceDebut, int indiceFin) {
		return this.contenu.substring(indiceDebut, indiceFin);
	}

	/**
	 * D�finit le contenu de la zone de travail
	 * 
	 * @param Texte
	 *            � ins�rer dans le buffer
	 */
	public void setContenu(StringBuffer sBuffer) {
		this.contenu = sBuffer;
	}

	/**
	 * Supprime une partie du contenu du buffer
	 * 
	 * @param indiceDebut
	 * @param indiceFin
	 */
	public void supprimer(int indiceDebut, int indiceFin) {
		this.contenu.delete(indiceDebut, indiceFin);
	}

	/**
	 * Insert du texte  (le contenu present dans le buffer)
	 * 
	 * @param caractere
	 */
	public void inserer(char caractere) {
		this.contenu.append(caractere);
	}

	/**
	 * Insert du texte dans le buffer � partir d'une position d�finie
	 * 
	 * @param indiceDebut
	 * @param caractere
	 */
	public void inserer(int indiceDebut, char caractere) {
		this.contenu.insert(indiceDebut, caractere);
	}

	/**
	 * Remplace une partie du contenu, dont les limites sont renseign�es, par un
	 * texte sp�cifi�
	 * 
	 * @param inDiceDebut
	 * @param indiceFin
	 * @param texte
	 *            Texte de remplacement
	 */
	public void remplacer(int inDiceDebut, int indiceFin, String texte) {
		this.contenu.replace(inDiceDebut, indiceFin, texte);
	}

	

}
