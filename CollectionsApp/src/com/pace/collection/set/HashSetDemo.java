package com.pace.collection.set;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>citySet=new HashSet<String>();
		//hashset is unorderd  type and doesnot allows duplicates
		citySet.add("Hyderabad");
		citySet.add("Pune");
		citySet.add("Banglore");
		citySet.add("HYDRABAD");
		for(String city:citySet) {
			System.out.println(city);
		}
		//being a unordered collection in hashset,treeset we don't find a index based for loop in hashset,
		//beacuse we dont have a accessibilty of indices ,since we dont ahve get method with out indices
	}

}
