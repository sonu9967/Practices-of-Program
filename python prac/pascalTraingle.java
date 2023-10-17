import java.util.*;
public class pascalTraingle {
	public int factorial(int i)  // for finding factorial
	{
		if (i == 0){
            return 1;
        }
        return i * factorial(i - 1);
	}
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n=sc.nextInt();
		pascalTraingle g = new pascalTraingle();
		for (int i = 0; i < n; i++) {
			// for (j = 0; j <= n - i; j++) {
			// 	// for left and right spacing
			// 	System.out.print(" ");
			// }
			for (int j = 0; j <=i; j++) {
				System.out.print(" "+ g.factorial(i)/ (g.factorial(i - j)* g.factorial(j)));   // nCr Formula = fact(n)/(fact(r)*fact(n-r))
			}
    System.out.println();
		}
	}
}

