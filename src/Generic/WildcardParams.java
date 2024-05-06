package Generic;

import java.util.ArrayList;

public class WildcardParams {
	public static void main(String[] args) {
		WildcardParams wcp = new WildcardParams();
		wcp.myMethod(new ArrayList<Thread>());
	}

	public void myMethod(ArrayList<? extends Thread> l) {
		l.add(null);
//		l.add("Duc"); //Error --> ? chi cho mac dinh la null
	}
}
