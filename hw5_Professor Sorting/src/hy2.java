import java.io.*;

public class hy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("c:\\windows\\system.ini ������ �о� ����մϴ�.");
			FileReader fr = new FileReader("c:\\windows\\system.ini");
			int c;
			int i=1;
			while((c=fr.read())!=-1) {
				if(i==1 || c=='\n') {
					System.out.print(i + ": ");
					i++;
				}
				System.out.print((char)c);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� ����");
		} catch (IOException r) {
			System.out.println("����� ����");
		}
	}
}
