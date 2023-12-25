public class WordCount{
	public static void main(String[] args){
		
		//degenerate case with no input text
		if(StdIn.isEmpty()){
			StdOut.println("no text detected");
			return;
		}
		
		int count = 0;
		
		while(!StdIn.isEmpty()){
		// read in word in text
		
		String text = StdIn.readString();
		count++ ;	
		}
		
		//output
		StdOut.print("total count of words is "+ count);
	}
}