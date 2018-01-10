package receiver;

/**
 * @author DIANA
 * 
 * Elle contient temporairement le texte slectionner que l'utilisateur desire couper ou coller 
 */
public class PressePapier {
private String content;

public PressePapier() {
	super();
	this.content="";
	
}

/**
 * retourne le contenu du presse papier
 * 
 * @return Retourne le texte contenu dans le presse papier
 */
 
public String getContent() {
	return content;
}


/**
 * Définit le contenu du presse papier
 * 
 * @param texte
 *            Le texte à insérer dans le presse papier
 */
public void setContent(String content) {
	this.content = content;
}



}
