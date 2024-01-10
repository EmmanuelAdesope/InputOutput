public class Rose{
	public static void main(String[] args){
		
		int n = Integer.parseInt(args[0]);
		
		// if n is odd
		if ((n & 1) == 1){
		
		double [] x = new double [n+1];
		double [] y = new double [n+1];
		
		// generate points
		for(int i = 0; i<=n; i++){
			x[i]= 2*Math.PI*i/n;
			y[i]= Math.sin(n * x[i]);
			
			StdOut.print(x[i]+" ");
			StdOut.print(y[i]+" ");
		}
		
		
		
		//rescale the coordinate system
		StdDraw.setXscale(0, 2*Math.PI);
		StdDraw.setYscale(-5.0, 5.0);
		
		// plots the graph 
		for(int i = 0; i<n; i++)
			StdDraw.line(x[i],y[i], x[i+1],y[i+1]);
		
		}
	
	}
}