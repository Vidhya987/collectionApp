package com.pace.collections.list;

import java.util.ArrayList;

public class TechListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CRUD operation
		//control+shift+o for direct  import of arraylist
		ArrayList<String>techList=new ArrayList<String>();
		//adding elements
		techList.add("Java");
		techList.add("Python");
		techList.add("Dot Net");
		for(String technology:techList) {
			System.out.println(technology);
		}
		//modify the value we use set method set(index,updated value)will be replaced by angular but not add to the list
		//method 2 to replace
		//String langStr=("Angular");
		//techList.set(2, langStr);
		
		techList.set(2, "Angular");
		System.out.println("TechList after updation:");
		for(String technology:techList) {
			System.out.println(technology);
		}
		
		//remove the object we have 2 methods 1.index as a peremeter
		//2.object as a perameter
		//techList.remove(1);
		techList.remove("Python");
		techList.remove("c");//doesnt given error 
		//cntrol+f to replace many names of same name and then find and replace will be written and then finad all and replace all
		//python is replaced by Pythonhere
		System.out.println("TecgList after delletion and Python:");
		for(String technology:techList) {
			System.out.println(technology);
		}
		//method overloading :same method name with different parameter
		
		//and clear also is there
	}

}
