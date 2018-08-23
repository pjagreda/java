package com.test.maven.spring.beansList;

import java.util.HashMap;
import java.util.Map;

public class JungleMap {
	
	public JungleMap() {
		// TODO Auto-generated constructor stub
	}
	
	
	private Map<String,String> foods = new HashMap<String,String>();


	public Map<String, String> getFoods() {
		return foods;
	}


	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String, String> entry: foods.entrySet()) {
			sb.append(entry.getKey()+": "+entry.getValue()+"\n");
		}
		return sb.toString();
	}
	
	
	

}
