package Main;

import command.EnregColler;
import command.EnregCopier;
import command.EnregCouper;
import command.EnregInsererTexte;
import command.EnregRetourArriere;
import command.EnregSelectionner;
import command.EnregSupprimer;
import command.Record;
import command.Stop;
import command.Replay;
import invoker.Ihm;
import invoker.Ihm_impV2;
import receiver.Enregistreur;
import receiver.Enregistreur_Impl;
import receiver.MoteurEditeur;
import receiver.MoteurEditeur_Impl;

public class MainV2 {

	public static void main(String[] args) {
		Enregistreur enregistreur = new Enregistreur_Impl();
		MoteurEditeur moteur = new MoteurEditeur_Impl();
		Ihm ihm = new Ihm_impV2();
		
		ihm.addCommand("Save", new Record(enregistreur));
		ihm.addCommand("arreter", new Stop(enregistreur));
		ihm.addCommand("rejouer", new Replay(enregistreur));
		
		ihm.addCommand("copier", new EnregCopier(moteur, enregistreur));
		ihm.addCommand("couper", new EnregCouper(moteur, enregistreur));
		ihm.addCommand("coller", new EnregColler(moteur, enregistreur));
		ihm.addCommand("RetourArriere", new EnregRetourArriere(moteur, enregistreur));
		ihm.addCommand("supprimer", new EnregSupprimer(moteur, enregistreur));
		ihm.addCommand("selectionner", new EnregSelectionner(moteur, ihm, enregistreur));
		ihm.addCommand("insererTexte", new EnregInsererTexte(moteur, ihm, enregistreur));		
		
		
		moteur.register(ihm);
	}

}
