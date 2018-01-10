package receiver;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionTest {
	
	private Selection selection;
	
	@Test
	public void testSetPosition(){
		selection = new Selection();
		
		int debut = 5;
		int fin = 10;
		selection.setPosition(debut, fin);		
		assertEquals("Cas 0 < debut < fin | D�but diff�rents", debut, selection.getDebut());
		assertEquals("Cas 0 < debut < fin | Fin diff�rentes", fin, selection.getFin());

		debut = 10;
		fin = 5;
		selection.setPosition(debut, fin);
		assertEquals("Cas 0 < fin < debut | D�but diff�rents", fin, selection.getDebut());
		assertEquals("Cas 0 < fin < debut | Fin diff�rentes", debut, selection.getFin());
		
		debut = -5;
		fin = -1;
		selection.setPosition(debut, fin);
		assertEquals("Cas debut < fin < 0 | D�but diff�rents de 0", 0, selection.getDebut());
		assertEquals("Cas debut < fin < 0 | Fin diff�rentes de 0", 0, selection.getFin());
		
	}
	
	@Test
	public void testSetDebut() {
		selection = new Selection();
		assertNotNull("L'objet est null lors de l'initialisation", selection);
		assertEquals("Le d�but � l'initialisation est diff�rente de 0", 0, selection.getDebut());
		
		selection.setDebut(-5);
		assertEquals("Cas debut < 0 | D�but diff�rents de 0", 0, selection.getDebut());
		
		selection.setDebut(10);
		assertEquals("Cas 0 < debut | D�but diff�rents", 10, selection.getDebut());
		
	}

	@Test
	public void testSetFin() {
		selection = new Selection();
		assertNotNull("L'objet est null lors de l'initialisation", selection);
		assertEquals("La fin � l'initialisation est diff�rente de 0", 0, selection.getFin());
		
		selection.setFin(-5);
		assertEquals("Cas fin < 0 | Fin diff�rentes de 0", 0, selection.getFin());
		
		selection.setFin(10);
		assertEquals("Cas 0 < fin | Fin diff�rentes", 10, selection.getFin());
	}
}
