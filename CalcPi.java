// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	int num = Integer.parseInt(args[0]);
	double sum =1;
	double base = 1;
	int minus = -1;
	for (int i = 1; i <num; i++) 
	{
		base +=2;
		sum += (minus*((double)(1/(base))));
		minus = minus *(-1);
	}
	System.out.println("pi according to java : " + Math.PI);
	System.out.println("pi, approximated: " + sum*4);

	}
}
