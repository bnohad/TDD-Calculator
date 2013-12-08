import static org.junit.Assert.*;

import org.junit.Test;


public class StringCalcTester {

	@Test
	public void AddEmptyString_returnZero() 
	{
		//arrange
		Calculator calc=new Calculator();
		//act
		int actual=calc.Add("");
		//assert
		assertEquals(0, actual);
	}
	
	@Test
	public void AddOneNumber_returnNumber()
	{
		//arrange
		Calculator calc=new Calculator();
		//act
		int actual=calc.Add("1");
		//assert
		assertEquals(1, actual);
	}
}
