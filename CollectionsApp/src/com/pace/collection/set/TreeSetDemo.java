package com.pace.collection.set;
import java.util.TreeSet;
//here imported submodule name and class name need not to be same
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>citySet=new TreeSet<String>();
		citySet.add("Hydrabad");
		citySet.add("Pune");
		citySet.add("Banglore");
		citySet.add("HYDRABAD");
		for(String city:citySet) {
			System.out.println(city);
		}
		
	}

}
