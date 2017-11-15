package receiver;

/**
 * @author DIANA
 * Elle contient temporairement le texte slectionner que l'utilisateur desire couper ou coller 
 */
public class PressePapier {
private String content;

public PressePapier(String content) {
	super();
	this.content = content;
}
// retourne le contenu du presse papier
public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}



}
