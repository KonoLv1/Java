// Study5 Junichi Koyama
// ���l�̓��͎�t�Ə�������
import java.io.Console;

public class Study5{
	public static void main(String[]args)throws Exception{
		Console console = System.console();
		int a = Integer.parseInt(console.readLine());
		if (100 < a){
			System.out.println("���͒l��100���傫��");
		}else{
			System.out.println("���͒l��100�ȉ�");
		}
	}
}