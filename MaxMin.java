public class MaxMin {
	public static void main (String[] args){
	
		StdOut.println("úser to enter size of array"); //Displays message prompt to user
		
		int n = StdIn.readInt();  //read in array size from user input
		
		int arr [] = new int [n];  // creates array with length n 
		
		StdOut.println("user to input desired numbers"); // Displays message prompt to user
		
		for (int i = 0; i < n ; i++){   // initializes array values with user inputs
			
			arr[i] = StdIn.readInt();   // user inputs integer values
			
		}
	
		
		int min = arr[0];     			
		int max = arr[1];


		for(int i = 0; i < n; i++){
			
			if (arr[i] < min) min = arr[i]; // checks for minimum value in the array and updates accordingly 
			if (max < arr[i]) max = arr[i]; // checks for maximum value in the array and updates accordingly
		}
	
		StdOut.println("minimum value is "+ min);
		StdOut.print("maximum value is "+ max);
	}
		
}