import java.util.*;
import java.io.*;

public class AppendTextFiles {
	public static void main(String[] args) {
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 파일 이름을 입력하세요>> ");
		String f1 = scanner.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요>> ");
		String f2 = scanner.nextLine();
		
		int c1;
		int c2;
		File dest = new File("appended.txt");
		try {
			FileReader fr1 = new FileReader(f1);
			FileWriter fw1 = new FileWriter(dest);
			while((c1 = fr1.read()) != -1) { // 문자 하나 읽고
				fw1.write((char)c1); // 문자 하나 쓰고
			}
			FileReader fr2 = new FileReader(f2);
			FileWriter fw2 = new FileWriter(dest, true);
			while((c2 = fr2.read()) != -1) { // 문자 하나 읽고
				fw2.write((char)c2); // 문자 하나 쓰고
			}
			fr1.close(); fw1.close(); fr2.close(); fw2.close();
			System.out.print("프로젝트 파일 밑에 appended.txt 파일에 저장했습니다.");
		}
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
		scanner.close();
	}
}
