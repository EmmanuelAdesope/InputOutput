public class Banner{
	public static void main(String[] args){
		
		//initial values
		double vx = Double.parseDouble(args[0]);
		double vy = Double.parseDouble(args[1]);
		double x = 0.0 ; double y = 0.0;
		
		String word = StdIn.readString();
		
		// coordinate system
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);
		StdDraw.enableDoubleBuffering();
		
		// Animation
		while(true){
		
		if(Math.abs(x + vx) > 1)  vx = -vx ;
		
		if(Math.abs(y + vy) > 1)  vy = -vy ;
		
		
		x = x + vx ;
		y = y + vy ;
		
		
		StdDraw.clear();
		
		StdDraw.text(x, y, word);
		StdDraw.show();
		StdDraw.pause(1000);
		
		}
		
		
		
		
	}
}