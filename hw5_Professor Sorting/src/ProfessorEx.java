//ProfessorEx.java
public class ProfessorEx {

	public static void main(String[] args) {
		Professor[] pf = {
				new Professor("영희", "교수"),
				new Professor("철수", "부교수"),
				new Professor("명수", "부교수"),
				new Professor("얌순", "조교수"),
				new Professor("순돌", "교수"),
				new Professor("정희", "조교수")
		};
		Sorter.sort(pf);
		for(int i = 0;i < pf.length; i++)
			System.out.println(pf[i]);		
	}

}