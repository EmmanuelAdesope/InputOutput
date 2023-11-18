public class Average
{
	public static void main (String[] args)
	{ //Average the numbers on the input stream.
	
		double sum = 0.0;
		int cnt = 0;
		while (!StdIn.isEmpty())
		{ //Read a number and cummulate the sum.
			double value = StdIn.readDouble();
			sum += value;
			cnt++;
		}
		double average = sum /cnt ; 
		StdOut.println("Average is " + average);
	}
	
}