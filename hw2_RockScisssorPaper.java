import java.util.Scanner;
public class RockScisssorPaper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};
		System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�.");
		
		while(true){
			System.out.print("���� ���� ��!>>");
			int n = (int)(Math.random()*3);
			String myChoice = scanner.next();
			if(myChoice.equals(str[0])){
				if(str[n].equals("����"))
					System.out.println("�����="+str[0]+", ��ǻ��=����, �����ϴ�.");
				else if(str[n].equals("����"))
					System.out.println("�����="+str[0]+", ��ǻ��=����, ��ǻ�Ͱ� �̰���ϴ�.");
				else
					System.out.println("�����="+str[0]+", ��ǻ��=��, ����ڰ� �̰���ϴ�.");
			}
			else if(myChoice.equals(str[1])) {
				if(str[n].equals("����"))
					System.out.println("�����="+str[1]+", ��ǻ��=����, ����ڰ� �̰���ϴ�.");
				else if(str[n].equals("����"))
					System.out.println("�����="+str[1]+", ��ǻ��=����, �����ϴ�.");
				else
					System.out.println("�����="+str[1]+", ��ǻ��=��, ��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if(myChoice.equals(str[2])){
				if(str[n].equals("����"))
					System.out.println("�����="+str[2]+", ��ǻ��=����, ��ǻ�Ͱ� �̰���ϴ�.");
				else if(str[n].equals("����"))
					System.out.println("�����="+str[2]+", ��ǻ��=����, ����ڰ� �̰���ϴ�.");
				else
					System.out.println("�����="+str[2]+", ��ǻ��=��, �����ϴ�.");
			}
			
			if(myChoice.equals("�׸�"))
				break;
		}
		System.out.print("������ �����մϴ�...");

	scanner.close();
	}

}
