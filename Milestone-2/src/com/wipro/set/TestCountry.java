package com.wipro.set;

public class TestCountry {
	public static void main(String[] args) {
		Country country = new Country();
		country.saveCountryNames("India");
		country.saveCountryNames("USA");
		country.saveCountryNames("Indonesia");
		country.saveCountryNames("UK");
		country.saveCountryNames("Germany");

		System.out.println(country.getCountry("Germany"));
		System.out.println(country.getCountry("China"));		
	}
}
