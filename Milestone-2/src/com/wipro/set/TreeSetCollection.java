package com.wipro.set;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetCollection {
	public static void main(String[] args) {
		TreeSet<String> group = new TreeSet<>();



		group.add("yaswanth");
		group.add("chandu");
		group.add("sai");
		group.add("lakshmi");

		Iterator<String> it = group.iterator();
		String query = "chandu";
		boolean result = false;

		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}

		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}
}
