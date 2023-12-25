public class Checkerboard{
	public static void main(String[] args){
		
		double n = Double.parseDouble(args[0]);
		
		StdDraw.setXscale(0.0,n);
		StdDraw.setYscale(0.0,n);
		
		StdDraw.enableDoubleBuffering();
		
		for (double y = 0; y<= n; y++){
			for (double x = 0; x<=n; x++){
				
				if((x+y)%2== 0){
				//Draw a red Square
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.filledSquare(x, y, 1.0);
				}
				
				else{
				//Draw a black square
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledSquare(x, y, 1.0);
				}
			}
		}
		
		StdDraw.show();
	}
}