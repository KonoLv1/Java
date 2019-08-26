package p1;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("空白区切りで3つの数字と１つの文字列を入力してください。");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String s = sc.next();
		System.out.println("数字の合計は" + (a + b + c) + "で入力された文字列は" + s + "です。");
	}
}
