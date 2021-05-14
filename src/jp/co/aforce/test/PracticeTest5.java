package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest5 {
	
	public static void main(String[] args) {
		Random random = new Random();
		int fortune = random.nextInt(10);
	
		switch (fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println("7の倍数の総合計は" + sum);
		
		
		for (int i =1; i <= 9; i++) {
			for(int j= 1; j<= 9; j++) {
				int result = i * j;
				
				System.out.print(" ");
				
				if (10 > result)
					System.out.print(" ");
				
				System.out.print(result);
			}
			
			System.out.println();
		}
	}
	
}
