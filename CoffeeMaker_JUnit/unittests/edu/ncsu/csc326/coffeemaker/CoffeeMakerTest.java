package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

/**
 * 
 * @author Sarah Heckman
 *
 * Unit tests for CoffeeMaker class.
 */
public class CoffeeMakerTest extends TestCase {
	
	private CoffeeMaker cm;
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;
	private Recipe r5;
	protected void setUp() throws Exception {
		cm = new CoffeeMaker();
		
		//Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setAmtChocolate("0");
		r1.setAmtCoffee("3");
		r1.setAmtMilk("1");
		r1.setAmtSugar("1");
		r1.setPrice("50");
		
		//Set up for r2
		r2 = new Recipe();
		r2.setName("Mocha");
		r2.setAmtChocolate("20");
		r2.setAmtCoffee("3");
		r2.setAmtMilk("1");
		r2.setAmtSugar("1");
		r2.setPrice("75");
		
		//Set up for r3
		r3 = new Recipe();
		r3.setName("Latte");
		r3.setAmtChocolate("0");
		r3.setAmtCoffee("3");
		r3.setAmtMilk("3");
		r3.setAmtSugar("1");
		r3.setPrice("100");
		
		//Set up for r4
		r4 = new Recipe();
		r4.setName("Hot Chocolate");
		r4.setAmtChocolate("4");
		r4.setAmtCoffee("0");
		r4.setAmtMilk("1");
		r4.setAmtSugar("1");
		r4.setPrice("65");
		
		
		//set up for r5
		//r5 = new Recipe();
		//r5.setName("white chocolate");
		//r5.setAmtChocolate("0");
		//r5.setAmtCoffee("-3");
		//r5.setAmtMilk("1");
		//r5.setAmtSugar("1");
		//r5.setPrice("50");
		super.setUp();
	}
	
	public void testAddInventory() {
		try {
			cm.addInventory("4","7","0","9");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}
	
	public void testAddInventoryException() {
		try {
			cm.addInventory("4", "-1", "asdf", "3");
			
		} catch (InventoryException e) {
			//success if thrown
			fail("InventoryException should be thrown");
		}
	}
	
	
	public void testAddInventoryException2() {
		try {
			cm.addInventory("4", "1", "-1", "3");
			
		} catch (InventoryException e) {
			//success if thrown
			fail("InventoryException should be thrown");
		}
	}
	public void testMakeCoffee() {
		cm.addRecipe(r1);
		assertEquals(25, cm.makeCoffee(0, 75));
	}

	public void addReceipe() {
		try {
			r5 = new Recipe();
			r5.setName("white chocolate");
			r5.setAmtChocolate("0");
			r5.setAmtCoffee("-3");
			r5.setAmtMilk("1");
			r5.setAmtSugar("1");
			r5.setPrice("50");
		}
		catch (RecipeException e) {
			//success if thrown
			fail("Receipe Exception should be thrown");
		}
		}
		
	}
