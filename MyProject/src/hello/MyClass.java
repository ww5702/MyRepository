//������ test
package hello;

public class MyClass {

	public static int larger(int a, int b) {
		if (a > b)				// 1
			return a;			// 2
		else				
			return b;			// 3	
	}							// 4

	public static int abs(int a) {
		if (a >= 0) 			// 1
			return a; 			// 2
		else
			return -a; 			// 3
	}							// 4
	
	public static int median(int a, int b, int c) {
		if (a <= b) { 			// 1
			if (b <= c) 		// 2
				return b; 		// 3
			else if (a <= c)	// 4
				return c;		// 5
			else
				return a; 		// 6
		} else {
			if (a <= c) 		// 7
				return a; 		// 8
			else if (b <= c) 	// 9
				return c; 		// 10
			else
				return b; 		// 11
		}
	} 							// 12

}
