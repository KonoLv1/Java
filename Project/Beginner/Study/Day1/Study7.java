// Study7 Junichi Koyama
// switch文

import java.io.Console;

public class Study7{
	public static void main(String[]args)throws Exception{
		Console console = System.console();
		int a = Integer.parseInt(console.readLine());
		switch(a){
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("0と1と2以外が入力されました");
			break;
		}
	}
}