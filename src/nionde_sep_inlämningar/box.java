package nionde_sep_inlämningar;

import java.util.ArrayList;

public class box {
	//array list som kan ta in okänt antal av primitiva datatyper
	
	//public Object[] a = new Object[i] samma som nedan fast odynamisk
	
	public ArrayList<Object> a = new ArrayList<Object>();
	
	public box() {
		
	}
	
	//lägger in den okända primitiva datatyper i ArrayList
	public <E> void ass(E e) {
		a.add(e);
	}
	
}
