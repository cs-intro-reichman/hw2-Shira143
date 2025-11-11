
import javax.lang.model.util.ElementScanner14;

// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];	
		int count = 1;
		boolean a = true;
		int seed = N;
	if (mode.equals("v"))
	{
		for (int i = 1; i <= N; i++)
		 {
			seed = i;
			System.out.print(seed + " ");
	while ((seed != 1) || (a))
	{
		if (seed%2 == 0)
		{
			seed = seed/2;
			count++;
		}
		else
		{
			seed = (seed*3)+1;
			count++;
		}
		a = false;
		System.out.print(seed + " ");	
	}
		System.out.print("(" + count + ")")	;
		System.out.println("");
		count = 1;
	}	
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");

		
}
	else
		{
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");

		}

}}


