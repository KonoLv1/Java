// Junichi Koyama
// Forによる無限ループを学ぶ

public class InfiniteFor{
	public static void main(String[]args){
		int i = 0;
		for (;;){
			System.out.println(i);
			i++;
			if ( i > 10){
				System.out.println("キリがないので終了");
				break;
			}
		}
	}
}
		