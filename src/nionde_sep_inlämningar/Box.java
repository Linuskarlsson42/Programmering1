package nionde_sep_inl�mningar;

import java.util.ArrayList;

public class Box {
	//array list som kan ta in ok�nt antal av primitiva datatyper
	
	//public Object[] a = new Object[i] samma som nedan fast odynamisk
	
	public ArrayList<Object> a = new ArrayList<Object>();
	
	public Box() {
		
	}
	
	//l�gger in den ok�nda primitiva datatyper i ArrayList
	public <E> void ass(E e) {
		a.add(e);
	}
	
}
