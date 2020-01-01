//Sorter.java
public class Sorter {
	public static <E> void swap(E[] a, int i, int j) {
		E t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static <E extends Comparable <E>> void sort (E[] a) {
		for(int i=0; i < a.length; i++) { 
			for(int j=0; j < i; j++) { 
				if(a[i].compareTo(a[j]) > 0) { 
					swap(a, i, j); 
				} 
			}
		}
	}
	
}
