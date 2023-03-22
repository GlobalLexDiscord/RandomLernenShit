package uebung;

import static org.junit.Assert.*;

import org.junit.Test;

public class RechnerTest {

	@Test
	public void testAdd() {
		Rechner r = new Rechner();
		assertEquals(4, r.add(1, 3));
	}

}
