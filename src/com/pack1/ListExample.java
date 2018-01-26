package com.pack1;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("plants");
		list.add("water");
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
