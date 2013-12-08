
public class Calculator {
	
	public int Add(String input)
	{
		if(input.isEmpty())
			return 0;
		
		String numbers[]=SplitStringToArray(input); //split string to array of strings
		
		if(numbers.length>1)
			return (Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
		
		return Integer.parseInt(numbers[0]);
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
