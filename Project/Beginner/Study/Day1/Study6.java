// Study6 Junichi Koyama
// ¡ðªò

import java.io.Console;

public class Study6{
	public static void main(String[]args)throws Exception{
		Console console = System.console();
		int b = Integer.parseInt(console.readLine());
		if (0 > b || 100 < b){
			System.out.println("ÙíÈ_Å·");
		}else if (0 < b && 60 > b){
			System.out.println("Ô_Å·");
		}else if (60 <= b && 100 > b){
			System.out.println("DGÅ·");
		}else if (b == 100){
			System.out.println("_¾ZEI");
		}
	}
} 