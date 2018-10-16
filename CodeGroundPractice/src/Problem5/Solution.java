package Problem5;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception {
		
		/*
		 * The method below means that the program will read from input.txt, instead of
		 * standard(keyboard) input. To test your program, you may save input data in
		 * input.txt file, and call below method to read from the file when using
		 * nextInt() method. You may remove the comment symbols(//) in the below
		 * statement and use it. But before submission, you must remove the freopen
		 * function or rewrite comment symbols(//).
		 */

		
		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		int N = 0; 
		int M = 0;
		
		for (int test_case = 0; test_case < T; test_case++) {

			Answer = 0;
			
			N = sc.nextInt();
			M = sc.nextInt();
			
			for(int j=0; j <=M; j++) {
		         for(int i=0; i<=N; i++) {
			    	Answer += CombinationNum(i+j, i);
			    }
			}
			
            Answer %= 1000000007;
            
			// Print the answer to standard output(screen).
			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}

	private static int CombinationNum(int n, int r)  {
		if(n == r || r ==0) {
			return 1;
		}else {
			return CombinationNum(n-1,  r-1)+CombinationNum(n-1, r);	
		}
	}
}