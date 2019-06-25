// Study5 Junichi Koyama
// 数値の入力受付と条件分岐
import java.io.Console;

public class Study5{
	public static void main(String[]args)throws Exception{
		Console console = System.console();
		int a = Integer.parseInt(console.readLine());
		if (100 < a){
			System.out.println("入力値は100より大きい");
		}else{
			System.out.println("入力値は100以下");
		}
	}
}