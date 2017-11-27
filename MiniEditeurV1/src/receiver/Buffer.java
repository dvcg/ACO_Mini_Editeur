package receiver;

public class Buffer {
	private StringBuffer content;
	
	/**
	 * @param contenu
	 */
	public Buffer(StringBuffer content) {
		super();
		this.content = content;
	}

	/**
	 * Constructeur Initialise le contenu du buffer
	 * 
	 * @param texte
	 *            Nouveau contenu du buffer
	 */
	public Buffer() {
		content = new StringBuffer();
	}
	
	/**
	 * Retourne le texte du contenu du buffer
	 * 
	 * @return Le contenu textuel du buffer
	 */
	public String getBufferTexte() {
		return content.toString();
	}
	/**
	 * Recup�re le contenu du buffer
	 * 
	 * @return Le contenu (StringBuffer)
	 */
	public StringBuffer getContent() {
		return content;
	}

	/**
	 * Retourne une partie du contenu du buffer dans les limites indiqu�es
	 * 
	 * @param indiceDebut
	 * @param indiceFin
	 * @return Un sous ensemble du texte du buffer
	 */
	public String recuperer(int indiceDebut, int indiceFin) {
		return this.content.substring(indiceDebut, indiceFin);
	}

	/**
	 * D�finit le contenu de la zone de travail
	 * 
	 * @param Texte
	 *            � ins�rer dans le buffer
	 */
	public void setContent(StringBuffer sBuffer) {
		this.content = sBuffer;
	}

	/**
	 * Supprime une partie du contenu du buffer
	 * 
	 * @param indiceDebut
	 * @param indiceFin
	 */
	public void supprimer(int indiceDebut, int indiceFin) {
		this.content.delete(indiceDebut, indiceFin);
	}

	/**
	 * Insert du texte  (le contenu present dans le buffer)
	 * 
	 * @param caractere
	 */
	public void inserer(char caractere) {
		this.content.append(caractere);
	}

	/**
	 * Insert du texte dans le buffer � partir d'une position d�finie
	 * 
	 * @param indiceDebut
	 * @param caractere
	 */
	public void inserer(int indiceDebut, char caractere) {
		this.content.insert(indiceDebut, caractere);
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
		this.content.replace(inDiceDebut, indiceFin, texte);
	}

	

}
