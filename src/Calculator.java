
public class Calculator {
	
	public int Add(String input)
	{
		if(input.isEmpty())
			return 0;
		
		return SumNumbersInString(input);
	}
	
	private int SumNumbersInString(String input)
	{
		String numbers[]=SplitStringToArray(input); //split string to array of strings
		
		int sum=0;
		
		for(int i=0; i<numbers.length; i++)
			if(!numbers[i].isEmpty())
				sum+=String2Int(numbers[i]);
		
		return sum;
	}
	
	private int String2Int(String number)
	{
		return Integer.parseInt(number);
	}
	
	private String[] SplitStringToArray(String input)
	{
		String delimiter_array[];
		
		if(input.startsWith("//"))
		{
			delimiter_array=input.split("\n", 2); //split to two cells
			
			delimiter_array[0]=delimiter_array[0].substring(2); //remove '//' from string
			
			input=delimiter_array[1].replace(delimiter_array[0], ","); //can set delimiter as String and not only char
		}
		
		input=input.replace('\n', ',');
		
		String numbers[]=input.split(",");
		
//		System.out.println(input + " Num of cells: " + numbers.length);
//		
//		for(int i=0; i<input.length(); i++)
//			System.out.println(numbers[i] + " ");
		
		return numbers;
	}
}
