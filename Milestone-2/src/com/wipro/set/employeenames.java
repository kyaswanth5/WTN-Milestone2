package com.wipro.set;
import java.util.HashSet;
import java.util.Iterator;
public class employeenames {
	public static void main(String[] args) {
		HashSet<String> group = new HashSet<>();

		group.add("yaswanth");
		group.add("chandu");
		group.add("sai");
		group.add("lakshmi");

		Iterator<String> it = group.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}
}
