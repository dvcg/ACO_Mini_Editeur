/**
 * 
 */
package Main;
import command.Coller;
import command.Copier;
import command.Couper;
import command.InsererTexte;
import command.RetourArriere;
import command.Selectionner;
import command.Supprimer;
import invoker.Ihm;
import invoker.Ihm_ImpV1;
import receiver.MoteurEditeur;
import receiver.MoteurEditeur_Impl;

/**
 * @author DIANA
 *
 */
public class MainV1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MoteurEditeur moteur = new MoteurEditeur_Impl();
		Ihm ihm = new Ihm_ImpV1();		
		System.out.println("ca marche");
		ihm.addCommand("copier", new Copier(moteur));
		ihm.addCommand("couper", new Couper(moteur));
		ihm.addCommand("coller", new Coller(moteur));
		ihm.addCommand("RetourArriere", new RetourArriere(moteur));
		ihm.addCommand("supprimer", new Supprimer(moteur));
		ihm.addCommand("selectionner", new Selectionner(moteur, ihm));
		ihm.addCommand("insererTexte", new InsererTexte(moteur, ihm));		
		
		moteur.register(ihm);
		 
	}

}
