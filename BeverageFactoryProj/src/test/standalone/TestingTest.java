package test.standalone;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test.controller.MenuOrderController;

public class TestingTest {

	// sampleOrder = "Chai-sugar";
			//sampleOrder = "Chai-sugar-milk";
			// sampleOrder = "Chai";
			// sampleOrder = "Chai-sugar-milk,Chai,Coffee-milk";
			
	@SuppressWarnings("deprecation")
	@Test
	public void testPlacedOrderIsCorrect() {
		MenuOrderController tester=new MenuOrderController();
		
		 assertEquals(3.5 ,tester.placeOrder("Chai-sugar"));
		 assertEquals( 2.5d ,tester.placeOrder("Chai-sugar-milk"));
		 assertEquals( 4.0d ,tester.placeOrder("Chai"));
		 assertEquals( 9.0d ,tester.placeOrder("Chai-sugar-milk,Chai,Coffee-milk"));
		 assertEquals(2.0 ,tester.placeOrder("Chai-sugar-milk-tea-water"));

		 assertNotNull(tester.placeOrder(""));
		 assertEquals("Invalid input !!!!!" + "" ,tester.placeOrder(null));
	}

}
