package Problem4;

import java.util.Scanner;

/*
 * Problem 4. Dart Game
 * 
 * The center coordinate of the dartboard is set (0,0).
 * 
 * dartboard scores >> SINGLE, DOUBLE, TRIPLE, OUT BOARD, BULL
 * 
 * SINGLE : original score
 * DOUBLE : 2x score
 * TRIPLE : 3x score
 * OUT BOARD : 0 score
 * BULL : 50 score
 * 
 * INPUT : T , A : Bull radius, B : Triple start radius, C : Triple end radius, 
 * 		   D : Double start radius, E : Double end radius
 * 			, N : thrown times (1<= N <= 10000), x/y : dart location (-30000 <= x,y <= 30000)
 * OUTPUT : Score when darts are thrown N times;
 * 
 * All test case Num : 1<= T <= 20
 * All run time Limit : <= 1s (Java : <=2s)
 * 
 */

public class Solution {

	static int Answer;
	static int[] points = {6, 13, 4, 18, 1, 20, 5, 12, 9, 14, 11, 8, 16, 7, 19, 3, 17, 2, 15, 10, 6};

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {

			Answer = 0;
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			int E = sc.nextInt();
			int N = sc.nextInt();
			
			A = A * A;
			B = B * B;
			C = C * C;
			D = D * D;
			E = E * E;
			
			
			for(int i=0; i<N; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int dis = x*x + y*y;
				
				if(dis < A) {
					
					Answer += 50;
					
				}else if(dis < B) {
					
					Answer += scores(x, y);
					
				}else if(dis < C) {
					
					Answer += (scores(x, y) * 3);
					
				}else if(dis < D) {
					
					Answer += scores(x, y);
					
				}else if(dis < E) {
					
					Answer += (scores(x, y) * 2);
					
				}else {
					
				}
				
			}
			
			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}

	private static int scores(int x, int y) {
		
		double disY = y;
		double disX = x;
		
		double angle = Math.atan(disY/disX) * (180.0 / Math.PI);
		if(disX < 0) {
			angle += 180;
		}else {
			if(disY < 0) {
				angle += 360;
			}
		}
		
		double index = angle/9/2;	
		return points[(int) Math.round(index)];
	}
	
}