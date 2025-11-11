// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];	
		int count = 0;
		int seed = N;
		boolean letter = mode.equals("v");
		while (letter && seed !=1)
	{
		for (int i = 1; i <= N; i++)
		 {
			seed = i;
			count++;
			System.out.print(seed + " ");
		
		if (seed%2 == 0)
		{
			seed = seed/2;
		}
		else
		{
			seed = (seed*3)+1;
		}
		System.out.print(seed + " ");	
		count++;
	}
		System.out.print("(" + count + ")")	;
		System.out.println("");

	}	

}


}


