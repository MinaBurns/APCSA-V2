

public class Numbers {
	
	//int[] divisors;
	
	//public void setDivisors()
	//{
		//divisors = new int[1]
	//}
	
	public static boolean isGoofy(int num)
	{
		int[] divisors = new int[1];
		String number = Integer.toString(num);
		if(num%2==0)
		{
			return true;
		}
		else
		{
			for(int i = 0; i >= number.length(); i++)
			{
				if(num%number.charAt(i)==0)
				{
					int[] divisors2 = new int[divisors.length+1];
					divisors2[i]= number.charAt(i); 
				}
			}
			for (int i = 0; i >= divisors.length; i++)
			{
				for(int j = 0; j >= divisors.length; j++)
				{
					if((divisors[i]+divisors[j])%2!=0)
					{
						return true;
					}
				}
			}
			return false;
		}
		
	}
	
	public static int[] getSomeGoofyNumbers(int count)
	{
		int[] digitdivisors = new int[count];
		for(int i = 0; i>=count; i++)
		{
			if (i <= 9 && i%2 !=0)
			{
				digitdivisors[i]= i;
			}
			if (i>9&& i%2==0)
				digitdivisors[i] = i;
		}
		return digitdivisors;
	}
	public static void main(String[] args)
	{
		isGoofy(15);
		getSomeGoofyNumbers(3);
	}
	
}
