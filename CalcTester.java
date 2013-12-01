/*
 * HW3: TDD calculator 
 * Git username:bnohad
 * JCE User: ohadbe
 * ID: 300393121
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalcTester {

	Calculator calc;
	
	@Before
	public void init()
	{
		calc=new Calculator();
	}
	
	@Test
	public void EmptyString() throws Exception { //check that 0 is return when string is empty
		assertEquals(0, calc.Add(""));
	}
	
	@Test
	public void OneNumberInString()  throws Exception { //check that the number is return when only one number in string
		assertEquals(1, calc.Add("1"));
	}
	
	@Test
	public void TwoNumbersInStringCommaSeparated() throws Exception  { //check if two numbers separated in comma are summed 
		assertEquals(3, calc.Add("1,2"));
	}
	
	@Test
	public void UnknownAmountOfNumbersCommaSeparated() throws Exception  { //check if unknown amount of numbers are summed
		assertEquals(10, calc.Add("1,2,3,4"));
	}
	
	@Test
	public void BothDelimiters() throws Exception  {
		assertEquals(15, calc.Add("1,2\n3\n4,5"));
	}
	
	@Test
	public void DelimiterInBeginingOfString() throws Exception  {
		assertEquals(15, calc.Add("\n,1,2\n3\n4,5"));
	}
	
	@Test
	public void DelimiterInEndOfString() throws Exception  {
		assertEquals(21, calc.Add("1,2\n3\n4,5,6,"));
	}
	
	@Test
	public void OneNumberWithDelimiters() throws Exception  {
		assertEquals(3, calc.Add("\n\n,3,,"));
	}
	
	@Test
	public void DifferentDelimiters() throws Exception  {
		assertEquals(18, calc.Add("//;\n10;;3,5"));
	}
	
	@Test
	public void HandleNegatives() throws Exception  {
		try{
		assertEquals(18, calc.Add("-10,3,-5"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}
