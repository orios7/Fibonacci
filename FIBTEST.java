//import java.util.Scanner;

public class FIBTEST {

	/**
	* Recursion function calculates a Fibonacci value using recursion. 
	* @param rec Value is provided by the main method when the call to the Recursion method is made.
	* @return Returns the calcualted Fibonacci value.
	*
	*/
	public static int recursion (int rec)  {
		
		int retrunValue = 0;
		
	    if (rec == 0 || rec == 1) {
	    	
	    	retrunValue = rec;
	    }
	    if (rec > 1) {
	    	
	    	retrunValue = recursion(rec - 1) + recursion(rec - 2);
	    }
	       
	    return retrunValue;
	}
	
	/**
	* Iteration function calculates a Fibonacci value using iteration. 
	* @param Iter Value is provided by the main method when the call to the Iteration method is made.
	* @return Returns the calcualted Fibonacci value.
	*  
	*/
		
	public static int Iteration(int Iter) {

		int valueOne = 0;
		int valueTwo = 1;
		int valueThree = 0;
		int retrunValue = 0;
		
	    if (Iter == 0 || Iter == 1) {
	    	
	    	retrunValue = Iter;
	    }
	    if (Iter >= 2) {
	    	for (int i = 2; i <= Iter; i++) {
	    		
	    		valueThree = valueOne + valueTwo;
	    		valueOne = valueTwo;
	    		valueTwo = valueThree;	
	    	}
	    	retrunValue = valueThree;
	    }
	     
		return retrunValue;	       
	}
	/**
	 * The main method contains two for loops which provides input values (from 0 to 45) to the 
	 *  Iteration and recursion functions to obtain a fibonacci value and determine the speed of the 
	 *  response for each input value.
	 * @param args
	 */
	public static void main(String[] args) {
		
	/**
	 * 	
	 */
		
		long finish;
		long totalT;
		 
		for (int i = 0; i <= 45; i++) {

			long startTime = System.nanoTime();

			System.out.println("ITERATIVE");
			System.out.println(i);
			System.out.println(Iteration(i));

			finish = System.nanoTime();
			totalT = finish - startTime; 

			System.out.println(totalT);
			System.out.println();

		} 
				
		for (int i = 0; i <= 45; i++) {

		    long startTime = System.nanoTime();

		    System.out.println("RECURSION");
		    System.out.println(i );
		    System.out.println(recursion(i));

			finish = System.nanoTime();
		    totalT = finish - startTime; 

		    System.out.println(totalT);
		    System.out.println();
		 
		}
		  
	}

}
