package com.wipro.set;
import java.util.Iterator;
import java.util.TreeSet;

class TreeCountry {
	TreeSet<String> H1 = new TreeSet<>();
	//HashSet<String> H1 = new HashSet<>();

	public TreeSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}

	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();

		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}

		return null;
	}
}
public class Exp4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));	
	}
}
