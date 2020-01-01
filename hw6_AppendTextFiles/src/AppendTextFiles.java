import java.util.*;
import java.io.*;

public class AppendTextFiles {
	public static void main(String[] args) {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>> ");
		String f1 = scanner.nextLine();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>> ");
		String f2 = scanner.nextLine();
		
		int c1;
		int c2;
		File dest = new File("appended.txt");
		try {
			FileReader fr1 = new FileReader(f1);
			FileWriter fw1 = new FileWriter(dest);
			while((c1 = fr1.read()) != -1) { // ���� �ϳ� �а�
				fw1.write((char)c1); // ���� �ϳ� ����
			}
			FileReader fr2 = new FileReader(f2);
			FileWriter fw2 = new FileWriter(dest, true);
			while((c2 = fr2.read()) != -1) { // ���� �ϳ� �а�
				fw2.write((char)c2); // ���� �ϳ� ����
			}
			fr1.close(); fw1.close(); fr2.close(); fw2.close();
			System.out.print("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����߽��ϴ�.");
		}
		catch(IOException e) {
			System.out.println("���� ���� ����");
		}
		scanner.close();
	}
}
