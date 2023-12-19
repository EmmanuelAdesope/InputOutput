public class Stats{
	public static void main(String[] args){
	
	int n = Integer.parseInt(args[0]);  	// initializes value n from command line argument
	
	double num [] = new double [n];	   // creates array of size n
	
	int sum = 0;
	double sumSquare = 0;
	
	StdOut.println("user to input floating-point numbers"); // Displays message prompt to user
	
	for(int i = 0 ; i< n; i++) {			//initializes the array 
		
		num[i] = StdIn.readDouble();		// read in floating-point values from user   
		
		sum += num[i];
	}
	
	double Ave = sum/n ;
	
	
	for(int i = 0; i < n; i++){             // calculates the square of the differences between the values and  Average value
		
		 sumSquare += Math.pow((num[i] - Ave),2) ;	
	} 
	
	double dev = Math.sqrt(sumSquare)/(n-1);
	
	
	StdOut.printf("%s %.4f", "Standard deviation is", dev);
	
	}

}