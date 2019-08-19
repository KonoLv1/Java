import java.io.Console;

public class Test{
	public static void main(String[]args)throws Exception{
		System.out.println("メインメソッドを通過しました。");
		System.out.print("数値を入力してください：");
		Console console = System.console();
		int num = Integer.parseInt(console.readLine());
		twice(num);
		treble(num);
	}
	public static void twice(int num){
		num = num * 2;
		System.out.println("2倍した数値は" + num + "です");
	}
	public static void treble(int num){
		num = num * 3;
		System.out.println("3倍した数値は" + num + "です");
	}
}