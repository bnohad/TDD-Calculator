import static org.junit.Assert.*;

import org.junit.Test;


public class StringCalcTester {

	@Test
	public void EmptyString() 
	{
		//arrange
		Calculator calc=new Calculator();
		//act
		int actual=calc.Add("");
		//assert
		assertEquals(0, actual);
	}

}
