package Problem2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Problem 2. Favorite Num.
 * 
 * In the programming competition, participants get a points for each round.
 * 1st gets N points , 2nd gets N-1 point and bottom gets 1 point.
 * There is no tie. And the person with the highest total score wins.
 * 
 * Input : the score before the last round points.
 * Output : print the number of people who are likely to win.
 * 
 */

public class Solution {

	static int Answer;
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 0; test_case < T; test_case++) {
			
			Answer = 0;
			
			int N = sc.nextInt();
			
			int []participant = new int[N];
			
			for(int i=0; i<N; i++) {
				participant[i] = sc.nextInt();
			}
			
			//오름차순 정렬
			Arrays.sort(participant);
			
			Answer = findFavoriteNumber(participant, N);
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
		
	}

	private static int findFavoriteNumber(int[] participant, int size) {
		
		int count = size;
		int max;
		
		for(int i=0; i<size-2; i++) {
			
			max = participant[i] + size;
			
			if(max < participant[size-1] + 1 || max < participant[i+1] + size - 1){
				count--;
				break;
			}
		}
		
		return count;
	}

}
