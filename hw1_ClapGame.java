import java.util.Scanner;
public class ClapGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99������ ������ �Է��Ͻÿ�: ");
		int arr[] = {3, 6, 9}; 
		int n = scanner.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(n%10==arr[i] && n/10==arr[i])
				System.out.print("�ڼ� ¦¦");
			else if(n%10==arr[i] ^ n/10==arr[i])
				System.out.print("�ڼ� ¦");
		}
		scanner.close();
	}

}
