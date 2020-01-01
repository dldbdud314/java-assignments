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
		
		System.out.print("�ο���>>");
		int numOfPpl = scanner.nextInt();
		String name = null;
		String tel = null;
		
		Phone[] p;
		p= new Phone[numOfPpl];
		
		for(int i = 0; i < numOfPpl; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			name = scanner.next();
			tel = scanner.next();
			
			p[i] = new Phone(name, tel); 
		}
		System.out.println("����Ǿ����ϴ�...");
		
		for(int i = 0; i < p.length; i++) {
			System.out.print("�˻��� �̸�>>");
			String findName = scanner.next();
			
			if(findName.equals(p[i].name))
				System.out.println(p[i].name+"�� ��ȣ�� "+p[i].tel+"�Դϴ�.");
			else if(findName.equals("�׸�"))
				break;
			else
				System.out.println(findName+"�� �����ϴ�.");
		}
		
		scanner.close();
	}

}
