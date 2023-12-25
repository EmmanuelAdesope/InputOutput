public class MaxMin {
	public static void main (String[] args){
	
		// reads in first input from user
		int no = StdIn.readInt(); 
		
		int min = no ;
		int max = (int) Double.NaN;
		
		// reads in corresponding input from user or file
		
		while(!StdIn.isEmpty()){
		
			int next = StdIn.readInt();
			
			if(next < min ) min = next;
			if(max < next ) max = next;
			
			
			
		}
	
	
		StdOut.println("minimum value is "+ min);
		StdOut.print("maximum value is "+ max);
	}
		
}