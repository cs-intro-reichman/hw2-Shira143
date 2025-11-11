
import javax.lang.model.util.ElementScanner14;

// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];	
		long seed = N;
		boolean letter = mode.equals("v");
		for (int i = 1; i <= N; i++)
		 {
			long currentNum = seed;
			int count = 0;
			if (letter)
			{
				System.out.print(seed);
			}
		while ((currentNum != 1))
	{
		if (currentNum%2 == 0)
		{
			currentNum = currentNum/2;
		}
		else
		{
			currentNum = (currentNum*3)+1;
		}
		count++;
		if (letter)
		{
			System.out.println(" " + currentNum);
		}
	}
		if (letter)
		{
			System.out.println("(" + count + "()");
		}	
	System.out.print("(" + count + ")")	;
	}	
	if (letter && N >0 )
	{
	System.out.println();	

	}
	System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		
}

}


