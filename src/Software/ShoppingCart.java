package Software;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<String> A = new ArrayList<String>();
    private int v=0;
	public int count() {
		return A.size();
		
	}

	public void add(String string) {
		A.add(string);
		
	}

	public int value() {
		for(int i=0;i<A.size();i++) {
			if(A.get(i).equals("Java Book")) {
				v+=127;
			}
			else if(A.get(i).equals("Web design Book")) {
				v+=100;
			}
		}
		return v;
	}


}
