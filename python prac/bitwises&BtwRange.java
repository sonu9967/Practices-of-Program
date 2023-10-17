// Java program to find bit-wise & of all
// numbers from x to y.
import java.io.*;

class GFG {

	// Function to find Bit-wise & of along numbers from x
	// to y.
	static long andOperator(long x, long y)
	{
		// Initialize result as the first number
		long res = x;

		// Traverse from x+1 to y
		for (long i = x + 1; i <= y; i++) {
			res = res & i;
		}

		return res;
	}

	// Driver code
	public static void main(String[] args)
	{
		long x = 10, y = 15;
		System.out.print(andOperator(x, y));
	}
}

// This code is contributed by Utkarsh Kumar
