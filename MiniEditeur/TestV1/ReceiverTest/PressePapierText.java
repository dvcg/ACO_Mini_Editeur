import static org.junit.Assert.*;

import org.junit.Test;

public class PressePapierText {

	private PressePapier pressePapier;

	@Before
	public void setUp() throws Exception {
		pressePapier = new PressePapier();
	}
	
	@Test
	/**
	 * Test sur le contenu du pp
	 */
	public void testSetTextePP() throws Exception
	{
		String Param;
		assertNotNull("Le presse papier est null lors de l'initialisation", pressePapier);
		
		Param = "test";		
		pressePapier.setContenu(Param);
		assertNotNull("Le presse papier reste null après insertion de texte", pressePapier);
		assertTrue("Le contenu du presse papier est différent de celui du texte inséré", pressePapier.getContenu().toString().equals(monParam));
	}

}
