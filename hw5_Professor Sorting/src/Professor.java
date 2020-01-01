//Professor.java
public class Professor implements Comparable <Professor>{
	String name;
	String position;
	
	public Professor(String name, String position) {
		this.name = name;
		this.position = position;
	}
	public String toString() {
		return (position+": "+name);
	}
	public String getPos() {
		return position;
	}
	public int compareTo(Professor a) {
		if(position=="����"&&a.getPos()=="����")
			return 0;
		else if(position=="����"&&a.getPos()=="�α���")
			return 1;
		else if(position=="����"&&a.getPos()=="������")
			return 1;
		else if(position=="�α���"&&a.getPos()=="����")
			return -1;
		else if(position=="�α���"&&a.getPos()=="�α���")
			return 0;
		else if(position=="�α���"&&a.getPos()=="������")
			return 1;
		else if(position=="������"&&a.getPos()=="����")
			return -1;
		else if(position=="������"&&a.getPos()=="�α���")
			return -1;
		else if(position=="������"&&a.getPos()=="������")
			return 0;
		return 0;
	}
}
