import static org.junit.Assert.*;

import org.junit.Test;

public class hexagonPerimeter {

	@Test
	public void test() {
		assertEquals(12.6,
				Geometry.hexagonPerimeter(2.1),
				0.1);
	}

}
