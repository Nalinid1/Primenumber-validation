package Project1;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.assertEquals;

interface PrimeNumberGenerator
{
	List<Integer> generate(int startingValue,int endingValue);
	boolean isPrime(int Value);
}
public class PrimeNumber implements PrimeNumberGenerator {
	
	List<Integer> result=new ArrayList<>();
	static ArrayList<Integer> target= new ArrayList<>();
	public List<Integer> generate(int sValue, int eValue)
	{
		 if (sValue > eValue)
		 {
			 int temp = sValue;
		     sValue = eValue;
		     eValue = temp;
		 }
		 for(int i=sValue;i<=eValue;i++)
		 {
			 if(isPrime(i))
			 {
				 result.add(i);
			 }
		 }
		 return result;
		 
	}
	
	@BeforeClass
	public static void primeNumberInitialize()
	{
	target.add(7901);
	target.add(7908);
	target.add(7919);
	}
	@Before
	public void primeNumberTestIntialize()
	{
		result.clear();	
		
	}
	public boolean isPrime(int value){
		if (value <= 1)
		{
			return false;
			
		}
		else
		{
			for(int i=2;i<=value/2;i++)
			{
				if(value%i==0)
					return false;
			}
			return true;
		}
		
	}
	@Test
	public void promeNumberTest()
	{
		PrimeNumber pm = new PrimeNumber();
		result= (ArrayList<Integer>)pm.generate(7900,7920);
		assertEquals("Prime Number Test" ,result,target);
		result.clear();
		result=(ArrayList<Integer>)pm.generate(7920,7900);
		assertEquals("Inverse List Testing",result,target);
	}
}

			