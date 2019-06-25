// Study6 Junichi Koyama
// 複数条件分岐

import java.io.Console;

public class Study6{
	public static void main(String[]args)throws Exception{
		Console console = System.console();
		int b = Integer.parseInt(console.readLine());
		if (0 > b || 100 < b){
			System.out.println("異常な点数です");
		}else if (0 < b && 60 > b){
			System.out.println("赤点です");
		}else if (60 <= b && 100 > b){
			System.out.println("優秀です");
		}else if (b == 100){
			System.out.println("満点だZE★！");
		}
	}
} 