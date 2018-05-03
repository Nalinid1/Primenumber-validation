package Project1;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberDriver {
	public static void main(String args[])
	{
		List<Integer> result=new ArrayList<>();
		PrimeNumber pm = new PrimeNumber();
		result = pm.generate(Integer.parseInt(args[0]), Integer.parseInt(args[1])); //Inverse is allowed, For instance 1 10 & 10 1 both yeild same output
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i));
		}
	}

}
