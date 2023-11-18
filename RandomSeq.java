public class RandomSeq
{
	public static void main(String[] args)
	{ //Print a random sequence of N real values in [0,1)
		int N = Integer.parseInt(args[0]);
		for (int i = 0; i< N; i++)
			StdOut.printf("%3.2f\n", Math.random());
	}
}