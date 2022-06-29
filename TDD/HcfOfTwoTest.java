import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HcfOfTwoTest {

	@Test
	void test() {
		
		HcfOFTwo hs = new HcfOFTwo();
		int expected =12;
		
		int actual = hs.findHcf(36,60);
		
		assertEquals(expected, actual);
	}
	


}
