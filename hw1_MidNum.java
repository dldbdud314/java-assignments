import java.util.Scanner;
public class MidNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("3���� ������ �Է��Ͻÿ�: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int max = a;
		int max2 = 0;
		if(max<b) {
			if (b>c) {
				max = b;
				max2 = (a>c)?a:c;
			}
			else {
				max = c;
				max2 = b;
			}
		}
		else if(max<c) {
			if(c>b) {
				max = c;
				max2 = (a>b)?a:b;
			}
			else {
				max = b;
				max2 = c; 
			}
		}
		System.out.println(a+", "+b+", "+c+" �� �߰� ũ���� ���� "+max2+"�Դϴ�.");

	scanner.close();
	}

}
