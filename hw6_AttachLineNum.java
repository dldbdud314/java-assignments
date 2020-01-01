import java.util.Scanner;
import java.io.*;

public class AttachLineNum {
	public static void main(String[] args) {
		System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
		try {
		Scanner fScanner = new Scanner(new FileReader("c:\\windows\\system.ini"));
		int lineNumber = 1;
		while(fScanner.hasNext()) {
			String line = fScanner.nextLine();
			System.out.print("  "+lineNumber+": ");
			System.out.println(line);
			lineNumber++;
		}
		fScanner.close();
		}
		catch(FileNotFoundException e){
			System.out.println("c:\\windows\\system.ini을 찾지 못했습니다.");
		}
	}

}
