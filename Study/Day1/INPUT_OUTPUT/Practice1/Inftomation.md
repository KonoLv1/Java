## �T�v

�W�����͂ƕW���o�͂��m�F����v���O�����ł��B
�R�̐��l�ƂP�̕��������͂��A���l�̍��v�ƕ�������o�͂��܂��B

## ����

������̃t�H���_��Eclipse�𗘗p���Đ������Ă��܂��B

## �\�[�X�R�[�h



```java
package p1;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�󔒋�؂��3�̐����ƂP�̕��������͂��Ă��������B");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String s = sc.next();
		System.out.println("�����̍��v��" + (a + b + c) + "�œ��͂��ꂽ�������" + s + "�ł��B");
	}
}


```

## ���



```java

// �p�b�P�[�W��java�N���X���܂Ƃ߂ĕ��ނ���d�g�݁A���w��ł���΃f�t�H���g�p�b�P�[�W�ɂȂ�B
// �f�t�H���g�p�b�P�[�W�͊�{�I�ɐ�������Ȃ����߁A�����p1�Ƃ����p�b�P�[�W��Practice1�Ƃ����N���X�𐶐������B
package p1;

// �W�����͂��\�ɂ��邽�߂� "java.util.Scanner"���C���|�[�g����B
import java.util.Scanner;

// "Practice1"�Ƃ����N���X�𐶐�����
public class Practice1 {
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

// "�󔒋�؂��3�̐����ƂP�̕��������͂��Ă��������B"�ƕW���o�͂��Ă���B
// ���s���s�v�ȏꍇ��System.out.print�ŗǂ�
		System.out.println("�󔒋�؂��3�̐����ƂP�̕��������͂��Ă��������B");

// sc�ɓ��͂��󂯕t����
		Scanner sc = new Scanner(System.in);

// a.b.c�ɐ��l����́As�ɕ���������
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String s = sc.next();

// a.b.c�̍��v�l�ƕ�����s��W���o�͂��Ă���B
		System.out.println("�����̍��v��" + (a + b + c) + "�œ��͂��ꂽ�������" + s + "�ł��B");
	}
}


```