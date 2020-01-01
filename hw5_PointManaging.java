import java.util.*;
public class PointManaging {

	public static void main(String[] args) {
		HashMap <String, Integer> m = new HashMap <String, Integer>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("포인트 관리 프로그램입니다.\n");
		while(true) {
			System.out.print("이름과 포인트 입력>>");
			String name = scanner.next();
			Integer point = scanner.nextInt();
			if(m.containsKey(name))
				point += m.get(name);
			m.put(name, point);
			Set <String> keys = m.keySet();
			Iterator <String> it = keys.iterator();
			while(it.hasNext()) {
				String n = it.next();
				int p = m.get(n);
				System.out.print("("+n+", "+p+")");
			}
			System.out.println();
			if(name.equals("그만")) break;
		}
		scanner.close();
	}

}
