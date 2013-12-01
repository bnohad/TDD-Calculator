/*
 * HW3: TDD calculator 
 * Git username:bnohad
 * JCE User: ohadbe
 * ID: 300393121
 */

public class Calculator {
	public int Add(String input) throws Exception
	{
		if(input.isEmpty()) //if string is empty
			return 0;

		String numbers[]=SplitString(input);

		if(numbers.length>0)
			return SumAllNumbers(numbers);

		return -1;
	}

	private int String2Int(String num) //convert string to int
	{
		return Integer.parseInt(num);
	}

	private String[] SplitString(String input) //split the input string to array of strings
	{
		//check for a different delimiter
		String temp[]=input.split("\n",2);

		if(input.contains("//"))
		{
			temp[0]=temp[0].substring(2); //remove the chars "//"

			input=temp[1]; //set the new input

			input=input.replace(temp[0], ","); //remove the new delimiter
		}

		input=input.replace('\n', ',');
		String numbers[]=input.split(",");

		return numbers;
	}

	private int SumAllNumbers(String numbers[]) throws Exception //sum all numbers in string array
	{
		int sum=0;

		String negatives="";

		for (int i=0; i<numbers.length; i++) //sum numbers in array
		{
			if(!numbers[i].isEmpty())
				if(String2Int(numbers[i])<0) //is a negative number?
					negatives+=numbers[i] + " ";
				else
					sum+=String2Int(numbers[i]);
		}

		//check if there are negatives
		if(!negatives.isEmpty())
			throw new Exception("negatives not allowed " + negatives);
		
		return sum;
	}
}
