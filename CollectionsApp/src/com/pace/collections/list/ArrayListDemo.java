package com.pace.collections.list;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here ArrayList is a collection of string objects
		ArrayList<String> cityList=new ArrayList<String>();//generic because of only string type
		cityList.add("hydrabad");
		cityList.add("Pune");
		cityList.add("Banglore");
		//to get size
		/*int listSize;
		listSize=cityList.size();
		
		System.out.println("City List:"+listSize);
		System.out.println(cityList.get(0));
		System.out.println(cityList.get(1));
		System.out.println(cityList.get(2));
		*/
		cityList.add("Delhi");
		System.out.println(cityList.get(3));
		for (int index=0;index<cityList.size();index++) {
			System.out.println(cityList.get(index));
		}
		//using for each loop
		//the first object(element) in the cityList is retrieved and stored in city variable and then its is printed below and then the next object is then retrived printed and so on
		for(String city:cityList) {
			System.out.println(city);
		}
				
		
	}

}
