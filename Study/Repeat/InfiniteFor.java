// Junichi Koyama
// For�ɂ�閳�����[�v���w��

public class InfiniteFor{
	public static void main(String[]args){
		int i = 0;
		for (;;){
			System.out.println(i);
			i++;
			if ( i > 10){
				System.out.println("�L�����Ȃ��̂ŏI��");
				break;
			}
		}
	}
}
		