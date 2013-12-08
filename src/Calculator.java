
public class Calculator {
	
	public int Add(String input)
	{
		if(input.isEmpty())
			return 0;
		
		String numbers[]=input.split(","); //split string to array of strings
		
		if(numbers.length>1)
			return (Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
		
		return Integer.parseInt(input);
	}

}
