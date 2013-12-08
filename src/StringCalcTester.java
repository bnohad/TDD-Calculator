import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringCalcTester {
	
	Calculator calc;
	
	@Before
	public void init()
	{
		calc=new Calculator();
	}

	@Test
	public void AddEmptyString_returnZero() 
	{
		//act
		int actual=calc.Add("");
		//assert
		assertEquals(0, actual);
	}
	
	@Test
	public void AddOneNumber_returnNumber()
	{
		//act
		int actual=calc.Add("1");
		//assert
		assertEquals(1, actual);
	}
}
