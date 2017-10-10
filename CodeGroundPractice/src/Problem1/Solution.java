package Problem1;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * program is receives N numbers.
 * And output is result of XOR operation use only odd(th) appear numbers among n numbers.
 * 
 * All test case Num : <= 20
 * All run time Limit : <= 1s (Java : <=2s)
 * 
 * Output : Case #T (T:test case number)
 * 			test case answer
 */

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int test_case = 0; test_case < T; test_case++) {
			
			int Ansewer = 0;
			
			int testElementNum = sc.nextInt();
			sc.nextLine();

			String test = sc.nextLine();
			Ansewer = runSoultion(test, testElementNum);

			System.out.println("Case #" + (test_case + 1));
			System.out.println(Ansewer);
		}

	}

	private static int runSoultion(String test, int size) {

		StringTokenizer stringTokenizer = new StringTokenizer(test, " ");
		
		int result = Integer.parseInt(stringTokenizer.nextToken());
		while(stringTokenizer.hasMoreTokens()) {
			
			result = result ^ Integer.parseInt(stringTokenizer.nextToken());

		}

		return result;
	}

}
