
public class Calculator {
	
	public int Add(String input)
	{
		if(input.isEmpty())
			return 0;
		
		String numbers[]=SplitStringToArray(input); //split string to array of strings
		
		if(numbers.length>1)
		{
			int sum=0;
			
			for(int i=0; i<numbers.length; i++)
				sum+=String2Int(numbers[i]);
			
			return sum;
		}
		
		return String2Int(numbers[0]);
	}
	
	private int String2Int(String number)
	{
		return Integer.parseInt(number);
	}
	
	private String[] SplitStringToArray(String input)
	{
		String numbers[]=input.split(",");
		
//		System.out.println(input + " Num of cells: " + numbers.length);
//		
//		for(int i=0; i<input.length(); i++)
//			System.out.println(numbers[i] + " ");
		
		return numbers;
	}
}
