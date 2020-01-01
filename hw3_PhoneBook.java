import java.util.Scanner;

class Phone {
	String name, tel;
	
	Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
}

public class PhoneBook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("인원수>>");
		int numOfPpl = scanner.nextInt();
		String name = null;
		String tel = null;
		
		Phone[] p;
		p= new Phone[numOfPpl];
		
		for(int i = 0; i < numOfPpl; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name = scanner.next();
			tel = scanner.next();
			
			p[i] = new Phone(name, tel); 
		}
		System.out.println("저장되었습니다...");
		
		for(int i = 0; i < p.length; i++) {
			System.out.print("검색할 이름>>");
			String findName = scanner.next();
			
			if(findName.equals(p[i].name))
				System.out.println(p[i].name+"의 번호는 "+p[i].tel+"입니다.");
			else if(findName.equals("그만"))
				break;
			else
				System.out.println(findName+"이 없습니다.");
		}
		
		scanner.close();
	}

}
