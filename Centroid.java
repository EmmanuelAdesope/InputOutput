public class Centroid{
	public static void main(String[] args){
	
		//degenrate case when no input is detected
		while(StdIn.isEmpty()){
			StdOut.println("No user input or file detected");
			return;
		}
		
		double totalMass = 0;
		double xCentroid = 0;
		double yCentroid = 0;
			
		while(!StdIn.isEmpty()){
		
			// reads the mass of the object
			double mass = StdIn.readDouble();
			
			totalMass += mass;
			
			// reads the xCoordinate of the object
			double xCoordinate = StdIn.readDouble();
			
			 xCentroid += mass * xCoordinate;
			
			// reads the yCoordinate of the object
			double yCoordinate = StdIn.readDouble();
			
			 yCentroid += mass * yCoordinate;
			
		}
		
		double averageX = xCentroid/totalMass ;
		double averageY = yCentroid/totalMass ;
		
		StdOut.printf("The centroid is given by =(%.3f ,%.3f ,%.3f)", averageX, averageY, totalMass);
		
	}
}