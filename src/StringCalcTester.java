import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringCalcTester {
	
	Calculator calc;
	int actual;
	
	@Before
	public void init()
	{
		//arrange
		calc=new Calculator();
	}

	@Test
	public void AddEmptyString_returnZero() throws Exception
	{
		//act
		actual=calc.Add("");
		//assert
		assertEquals(0, actual);
	}
	
	@Test
	public void AddOneNumber_returnNumber() throws Exception
	{
		//act
		actual=calc.Add("1");
		//assert
		assertEquals(1, actual);
	}
	
	@Test
	public void AddTwoNumbersCommaSeparated_returnSum() throws Exception
	{
		//act
		actual=calc.Add("1,2");
		//assert
		assertEquals(3, actual);
	}
	
	@Test
	public void AddOneNumberCommaSeparated_returnNumber() throws Exception
	{
		//act
		actual=calc.Add("3,");
		//assert
		assertEquals(3, actual);
	}
	
	@Test
	public void UnknownAmountOfNumbersCommaSeparated() throws Exception
	{
		//act
		actual=calc.Add("1,2,3");
		//assert
		assertEquals(6, actual);
	}
	
	@Test
	public void UnknownAmountOfNumbersDoubleCommaSeparated() throws Exception//solves delimiters in beginning & end of string
	{
		//act
		actual=calc.Add("1,2,,3,4");
		//assert
		assertEquals(10, actual);
	}
	
	@Test
	public void CommaAndNewlineDelimiters() throws Exception
	{
		//act
		actual=calc.Add("1\n2,3,4,5");
		//assert
		assertEquals(15, actual);
		
	}
	
	@Test
	public void DifferentDelimiter() throws Exception
	{
		//act
		actual=calc.Add("//;\n10;;3,5");
		//assert
		assertEquals(18, actual);
	}
	
	@Test(expected = Exception.class)
	public void AddNegatives_returnException() throws Exception
	{
		//act
		calc.Add("10,-5,-4");	
	}
}
