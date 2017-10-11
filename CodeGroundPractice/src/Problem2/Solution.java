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
		
		int []lastScore = new int[size];
		int count = 0;
		int winPoint = -1;
		
		// 최하위부터 최상위까지 역순으로 마지막 라운드 점수를 가지는 것이 이상적임
		for(int i=0; i<size; i++) {
			
			lastScore[i] = participant[i] + (size-i);
			
			if(lastScore[i] > winPoint){
				winPoint = lastScore[i];
			}
		}
		
		//모든 원소가 최고 점수를 가지게 되었을떄 max 값보다 크거나 같다면 우승 가능성이 있음
		for(int i=0; i<size; i++) {
			if(participant[i] + size >= winPoint) {
				count++;
			}
		}
		
		return count;
	}

}
