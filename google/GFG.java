// Java Program for sleeping the main thread.

// import java.io.*;
package google;
import java.lang.Thread;
class GFG {
	public static void main(String[] args)
	{
		// we can also use throws keyword followed by
		// exception name for throwing the exception
	
		try {
			for (int i = 0; i < 5; i++) {
			
				// it will sleep the main thread for 1 sec
				// ,each time the for loop runs
				Thread.sleep(100);
			
				// printing the value of the variable
				System.out.println(i);
			}
		}
		catch (Exception e) {
		
			// catching the exception
			System.out.println(e);
		}
	}
}
