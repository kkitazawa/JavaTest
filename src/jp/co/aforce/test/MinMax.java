package jp.co.aforce.test;

public class MinMax {
	
	public int getMaxValue(int a, int b, int c) {
		int maxValue = a;
		if (b > a) {
			maxValue = b;
			 
		 } else if (c > b) {
			maxValue = c;
		 }
		return maxValue;
	}
	
	public int getMinValue(int a, int b, int c) {
		int minValue = a;
		
		if (a > b) {
			minValue = b;
			 
		 } else if (c < b) {
			minValue = c;
		 }
		return minValue;
	}

}
