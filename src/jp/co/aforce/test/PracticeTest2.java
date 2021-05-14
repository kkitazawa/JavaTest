package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 28;
		double z = 3.14;
		
		System.out.println(x * y);
		
		System.out.println(y / x);
		System.out.println(y % x);
		
		double result = y * z;
		
		System.out.println(result);
		
		double incrementResult = ++result;
		System.out.println(incrementResult);
		
		
		int age = 23;
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		
		if (age > randomNumber) {
			System.out.println("私の方が年上です");
		} else if(age < randomNumber) {
			System.out.println("私の方が年下です");
		} else {
			System.out.println("私と同い年です");
		}
		System.out.println(randomNumber);
		
	}
	
	
	
}
