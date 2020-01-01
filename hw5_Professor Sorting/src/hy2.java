import java.io.*;

public class hy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
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
			System.out.println("파일을 찾을 수 없어");
		} catch (IOException r) {
			System.out.println("입출력 오류");
		}
	}
}
