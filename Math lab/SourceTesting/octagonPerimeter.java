import static org.junit.Assert.*;

import org.junit.Test;

public class octagonPerimeter {

	@Test
	public void test() {
		assertEquals(16,
				Geometry.octagonPerimeter(2)
				,0);
	}

}
