import static org.junit.Assert.*;

import org.junit.Test;

public class MoteurEdition_ImpTest {

	MoteurEdition editeur;
	
	@Before
	public void setUp() throws Exception {
		editeur = new MoteurEdition_Impl();
	}

	@Test
	public void testME_impl() {
		assertNotNull("L'objet n'a pas été instancié", editeur);
	}

	@Test
	public void testCouper() {
		fail("Not yet implemented");
	}

	@Test
	public void testCopier() {
		fail("Not yet implemented");
	}

	@Test
	public void testColler() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsererChar() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectionner() {
		fail("Not yet implemented");
	}

	@Test
	public void testSupprimer() {
		fail("Not yet implemented");
	}

}
