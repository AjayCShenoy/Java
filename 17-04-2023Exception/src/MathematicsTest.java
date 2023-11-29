import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathematicsTest {

	Mathematics obj;
	
	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("before:setup method is called");
		obj=new Mathematics();
		obj.setNo1(5);
		obj.setNo2(4);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		obj=null;
		System.out.println("this is after");
	}

	@Test
	void testAdd() {
		int actual=obj.add();
		assertEquals(9,actual);
	}

	@Test
	void testSubstract() {
		int actual=obj.substract();
        assertEquals(1,actual);
        
	}

	@Test
	void testProduct() {
		int actual=obj.product();
		assertEquals(20,actual);
	}

}
