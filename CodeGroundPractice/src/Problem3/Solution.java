package Problem3;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Problem 3. Test Study
 * 
 * Some school testing N subject.
 * And Some person have to study only K of N subjects.
 * This person always gets the same grade for the subject when he or she studies a subject.
 * 
 * 
 * INPUT : T, N, K, Scores
 * OUTPUT : Print the maximum score when this person has studied K subjects;
 * 
 * All test case Num : 1<= T <= 20
 * All run time Limit : <= 1s (Java : <=2s)
 */

public class Solution {

	static int Answer;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {

			Answer = 0;
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[] score = new int[N];
			
			for(int i = 0; i<N; i++) {
				score[i] = sc.nextInt();
			}
			
			Arrays.sort(score);
			
			for(int i=0; i<K; i++) {
				Answer += score[N-i-1];
			}
			
			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}

}
