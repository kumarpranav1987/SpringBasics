package com.livetechstudy.spring.dependency.injection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExample {
	private List<String> countryList;
	private Set<String> countrySet;
	private Map<Integer, String> countryMap;
	
	public List<String> getCountryList() {
		return countryList;
	}
	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}
	public Set<String> getCountrySet() {
		return countrySet;
	}
	public void setCountrySet(Set<String> countrySet) {
		this.countrySet = countrySet;
	}
	public Map<Integer, String> getCountryMap() {
		return countryMap;
	}
	public void setCountryMap(Map<Integer, String> countryMap) {
		this.countryMap = countryMap;
	}
	
}
