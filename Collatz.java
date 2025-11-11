// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];	
		int count = 0;
		int seed = 1;
		boolean letter = mode.equals("v");
	for (int j = 1; j <= N; j++)
		{
		seed = j;
		if (letter)
		{
		System.out.print(seed + " ");
		count++;
		do
		{
		if (seed%2 == 0)
		{
			seed = seed/2;
		}
		else
		{
			seed = (seed*3)+1;
		}
		if (letter)
		{
		System.out.print(seed + " ");	
		}
		count++;
		}
		while (seed != 1);
		
		System.out.print("(" + count + ")")	;
		System.out.println("");
		count = 0;
		}}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
		
		

}





