//ProfessorEx.java
public class ProfessorEx {

	public static void main(String[] args) {
		Professor[] pf = {
				new Professor("����", "����"),
				new Professor("ö��", "�α���"),
				new Professor("���", "�α���"),
				new Professor("���", "������"),
				new Professor("����", "����"),
				new Professor("����", "������")
		};
		Sorter.sort(pf);
		for(int i = 0;i < pf.length; i++)
			System.out.println(pf[i]);		
	}

}