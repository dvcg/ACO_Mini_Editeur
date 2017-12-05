/**
 * 
 */
package receiver;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author DIANA
 *
 */
public class BufferTest {
	
	Buffer buffer;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		buffer = new Buffer();
	}

	/**
	 * Test method for {@link receiver.Buffer#Buffer()}.
	 */
	@Test
	public void testBuffer() {
		assertNotNull("L'objet n'a pas �t� instanci�", buffer);		
	}

	/**
	 * Test method for {@link receiver.Buffer#Buffer(java.lang.String)}.
	 */
	@Test
	public void testBufferString() {
		String resultat = "test";
		buffer = new Buffer(resultat);
		assertNotNull("L'objet est null apr�s instanciation", buffer);		
		assertTrue("Contenu du buffer diff�rent de la valeur attendu", buffer.getContenuTexte().equals(resultat));
	}

	
	
	/**
	 * Test method for {@link receiver.Buffer#recuperer(int, int)}.
	 */
	@Test
	public void testRecuperer() {
		buffer = new Buffer("test recup");
		assertTrue("La chaine recup�r�e ne correspond pas � la chaine attendu", buffer.recuperer(0, 4).equals("test"));
	}

	/**
	 * Test method for {@link receiver.Buffer#setContenu(java.lang.StringBuffer)}.
	 */
	@Test
	public void testSetContent() {
		StringBuffer Buffer = new StringBuffer();
		buffer.setContenu(Buffer);
		assertSame("Objet ins�r� diff�rent de l'objet r�cup�r�", Buffer, buffer.getContent());
	}

	/**
	 * Test method for {@link receiver.Buffer#supprimer(int, int)}.
	 */
	@Test
	public void testSupprimer() {
		buffer = new Buffer("Tester ma classe");
		buffer.supprimer(6, 17);
		String attendu = "Tester";
		assertEquals("Borne inferieur < borne sup�rieur", attendu, buffer.getContenuTexte());
	}

	/**
	 * Test method for {@link receiver.Buffer#inserer(char)}.
	 */
	@Test
	public void testInsererChar() {
		buffer.inserer('t');
		assertEquals("Premier caract�re non ins�r�", "t", String.valueOf(buffer.recuperer(0, 1)));

		buffer.inserer('e');
		assertEquals("Second caract�re non ins�r�", "e", String.valueOf(buffer.recuperer(1, 2)));
	}

	/**
	 * Test method for {@link receiver.Buffer#inserer(int, char)}.
	 */
	@Test
	public void testInsererIntChar() {
		buffer.inserer(0, 't');
		buffer.inserer(1, 'e');
		assertEquals("Premier caract�re non ins�r� � la position indiqu�e", "t", String.valueOf(buffer.recuperer(0, 1)));
		assertEquals("Second caract�re non ins�r� � la position indiqu�e", "e", String.valueOf(buffer.recuperer(1, 2)));
	}

	/**
	 * Test method for {@link receiver.Buffer#remplacer(int, int, java.lang.String)}.
	 */
	@Test
	public void testRemplacer() {
		buffer = new Buffer("Tester ma classe");
		buffer.remplacer(7, 17, "mon objet");
		String attendu = "Tester mon objet";
		assertEquals("Texte non remplac�", attendu, buffer.getContenTTexte());
	}

}
