import static org.junit.Assert.*;

import org.junit.Test;

public class circumference {

	@Test
	public void test() {
		assertEquals(12.566370614359172,
				Geometry.circumference(2)
				,0);
	}

}
