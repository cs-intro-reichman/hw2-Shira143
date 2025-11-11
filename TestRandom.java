public  class  TestRandom {
	public static void main(String[]  args) {
		int num = Integer.parseInt(args[0]);
		int sumBigger = 0;
		int sumElse = 0;
		for (int i = 0; i < num; i++)
		 {
			double Ran = Math.random();
			if (Ran>0.5)
			sumBigger++;
			else
			sumElse++;
		}

		if ((sumBigger == 0) || (sumElse == 0))
		{
			System.out.println("> 0.5: " + sumBigger + " times");
			System.out.println("<= 0.5: " + sumElse + " times");
			System.exit(0);

		}
		double Ratio = (double) sumBigger / (double) sumElse;
		System.out.println("> 0.5: " + sumBigger + " times");
		System.out.println("<= 0.5: " + sumElse + " times");
		System.out.println("Ratio: " + Ratio);
		
	}
}
