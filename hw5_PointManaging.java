import java.util.*;
public class PointManaging {

	public static void main(String[] args) {
		HashMap <String, Integer> m = new HashMap <String, Integer>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("����Ʈ ���� ���α׷��Դϴ�.\n");
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>>");
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
			if(name.equals("�׸�")) break;
		}
		scanner.close();
	}

}
