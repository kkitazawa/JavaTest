package jp.co.aforce.test;

public class PracticeTest1 {
	
	private static final double TAX = 0.1;
	int x = 480;
	
	public static void main(String[] args) {
	System.out.println("消費税は" + TAX);	
	int price = (int)(480 * (1 + TAX));
	System.out.println("この商品の値段は" + price +"円です");
	
	
	String name = ("北澤広大");
	System.out.println(name);
	}
}
