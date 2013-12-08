import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringCalcTester {
	
	Calculator calc;
	int actual;
	
	@Before
	public void init()
	{
		calc=new Calculator();
	}

	@Test
	public void AddEmptyString_returnZero() 
	{
		//act
		actual=calc.Add("");
		//assert
		assertEquals(0, actual);
	}
	
	@Test
	public void AddOneNumber_returnNumber()
	{
		//act
		actual=calc.Add("1");
		//assert
		assertEquals(1, actual);
	}
	
	@Test
	public void AddTwoNumbersCommaSeparated_returnSum()
	{
		//act
		actual=calc.Add("1,2");
		//assert
		assertEquals("3", actual);
	}
}
