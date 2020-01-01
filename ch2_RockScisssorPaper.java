import java.util.Scanner;
public class RockScisssorPaper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
		
		while(true){
			System.out.print("가위 바위 보!>>");
			int n = (int)(Math.random()*3);
			String myChoice = scanner.next();
			if(myChoice.equals(str[0])){
				if(str[n].equals("가위"))
					System.out.println("사용자="+str[0]+", 컴퓨터=가위, 비겼습니다.");
				else if(str[n].equals("바위"))
					System.out.println("사용자="+str[0]+", 컴퓨터=바위, 컴퓨터가 이겼습니다.");
				else
					System.out.println("사용자="+str[0]+", 컴퓨터=보, 사용자가 이겼습니다.");
			}
			else if(myChoice.equals(str[1])) {
				if(str[n].equals("가위"))
					System.out.println("사용자="+str[1]+", 컴퓨터=가위, 사용자가 이겼습니다.");
				else if(str[n].equals("바위"))
					System.out.println("사용자="+str[1]+", 컴퓨터=바위, 비겼습니다.");
				else
					System.out.println("사용자="+str[1]+", 컴퓨터=보, 컴퓨터가 이겼습니다.");
			}
			else if(myChoice.equals(str[2])){
				if(str[n].equals("가위"))
					System.out.println("사용자="+str[2]+", 컴퓨터=가위, 컴퓨터가 이겼습니다.");
				else if(str[n].equals("바위"))
					System.out.println("사용자="+str[2]+", 컴퓨터=바위, 사용자가 이겼습니다.");
				else
					System.out.println("사용자="+str[2]+", 컴퓨터=보, 비겼습니다.");
			}
			
			if(myChoice.equals("그만"))
				break;
		}
		System.out.print("게임을 종료합니다...");

	scanner.close();
	}

}
