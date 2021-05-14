package jp.co.aforce.test;

public class PracticeTest3 {
	
	public static void main(String[] ars) {
		/*
		int numbers[] = {1, 2, 3};
		String names[] = {"田中太郎", "佐藤花子","鈴木次郎"};
		String sexes[] = {"男性", "女性", "男性"};
		int ages[] = {27, 22, 31};
		*/
		
		String tanaka[] = {"1", "田中太郎", "男性", "27"};
		
		System.out.println(tanaka[1]);
		
		HashMap<int, String, String, int> employees = new HashMap<>();
		
		employees.put(0, 1);
		employees.put(1, 2);
		employees.put(2, 3);
		
		employees.put(0, "田中太郎");
		employees.put(0, "佐藤花子");
		employees.put(0, "鈴木次郎");
		
		employees.put(0, "男性");
		employees.put(0, "女性");
		employees.put(0, "男性");
	}
}