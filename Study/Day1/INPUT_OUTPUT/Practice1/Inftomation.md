## 概要

標準入力と標準出力を確認するプログラムです。
３つの数値と１つの文字列を入力し、数値の合計と文字列を出力します。

## 注意

こちらのフォルダはEclipseを利用して生成しています。

## ソースコード



```java
package p1;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("空白区切りで3つの数字と１つの文字列を入力してください。");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String s = sc.next();
		System.out.println("数字の合計は" + (a + b + c) + "で入力された文字列は" + s + "です。");
	}
}


```

## 解説



```java

// パッケージはjavaクラスをまとめて分類する仕組み、未指定であればデフォルトパッケージになる。
// デフォルトパッケージは基本的に推奨されないため、今回はp1というパッケージにPractice1というクラスを生成した。
package p1;

// 標準入力を可能にするために "java.util.Scanner"をインポートする。
import java.util.Scanner;

// "Practice1"というクラスを生成する
public class Practice1 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

// "空白区切りで3つの数字と１つの文字列を入力してください。"と標準出力している。
// 改行が不要な場合はSystem.out.printで良い
		System.out.println("空白区切りで3つの数字と１つの文字列を入力してください。");

// scに入力を受け付ける
		Scanner sc = new Scanner(System.in);

// a.b.cに数値を入力、sに文字列を入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String s = sc.next();

// a.b.cの合計値と文字列sを標準出力している。
		System.out.println("数字の合計は" + (a + b + c) + "で入力された文字列は" + s + "です。");
	}
}


```