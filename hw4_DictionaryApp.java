abstract class PairMap{
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	
	abstract String delete(String key);
	
	abstract int length();
}

class Dictionary extends PairMap{
	int count = 0;
	public Dictionary(int n) {
		keyArray = new String[n];
		valueArray = new String[n];
	}
	public String get(String key) {
		int i;
		for(i = 0; i < count; i++) {
			if(keyArray[i].equals(key))
				break;
		}
		return valueArray[i];
	}
	public void put(String key, String value) {
		keyArray[count] = key;
		valueArray[count] = value;
		
		for(int i = 0; i < count; i++) {
			if(keyArray[i].equals(key))
				valueArray[i] = value;
		}
		count++;
	}
	public String delete(String key) {
		int index = 0;
		for(int i = 0; i < count; i++) {
			if(keyArray[i].equals(key))
				index = i;
				break;
		}
		for(int j = index; j < count; j++) {
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		count--;
		return valueArray[index];
	}
	public int length() {
		return count;
	}
}

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
	}
}
