import java.io.Console;

public class Test{
	public static void main(String[]args)throws Exception{
		System.out.println("���C�����\�b�h��ʉ߂��܂����B");
		System.out.print("���l����͂��Ă��������F");
		Console console = System.console();
		int num = Integer.parseInt(console.readLine());
		twice(num);
		treble(num);
	}
	public static void twice(int num){
		num = num * 2;
		System.out.println("2�{�������l��" + num + "�ł�");
	}
	public static void treble(int num){
		num = num * 3;
		System.out.println("3�{�������l��" + num + "�ł�");
	}
}