package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {
	
	public static void main(String[] args) {
		/*練習問題1 ②でコーディングするのが適切
		 * ①だと文字列ではなく変数の比較になり、文字列自体の比較ができないため。
		 */
	
		ArrayList<String> animals = new ArrayList<>();
		
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
		String cat = animals.get(1);
		
	
		System.out.println(cat + "はリストに含まれています");
		
		
		int birthMonth = 9;
		
		switch (birthMonth) {
		case 1:
			System.out.println("元日、成人の日");
			break;
		case 2:
			System.out.println("建国記念日、天皇誕生日");
			break;
		case 3:
			System.out.println("春分の日");
			break;
		case 4:
			System.out.println("昭和の日");
			break;
		case 5:
			System.out.println("憲法記念日、緑の日、こどもの日");
			break;
		case 6:
			System.out.println("(なし)");
			break;
		case 7:
			System.out.println("海の日、スポーツの日");
			break;
		case 8:
			System.out.println("山の日");
			break;
		case 9:
			System.out.println("敬老の日、春分の日");
			break;
		case 10:
			System.out.println("(なし)");
			break;
		case 11:
			System.out.println("文化の日、勤労感謝の日");
			break;
		default:
			System.out.println("(なし)");
			break;
		}
		
		/*	ifよりもswitchならcaseを書くことで
		 * 月が見やすく管理しやすいと思ったから。
		 */
	}
}
