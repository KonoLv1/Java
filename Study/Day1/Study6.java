// Study6 Junichi Koyama
// ������������

import java.io.Console;

public class Study6{
	public static void main(String[]args)throws Exception{
		Console console = System.console();
		int b = Integer.parseInt(console.readLine());
		if (0 > b || 100 < b){
			System.out.println("�ُ�ȓ_���ł�");
		}else if (0 < b && 60 > b){
			System.out.println("�ԓ_�ł�");
		}else if (60 <= b && 100 > b){
			System.out.println("�D�G�ł�");
		}else if (b == 100){
			System.out.println("���_��ZE���I");
		}
	}
} 