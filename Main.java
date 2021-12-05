package com.gmail.kutepov89.sergey;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Cat cat7 = new Cat("Garfild", 4);
		Cat cat1 = new Cat("Umka", 12);
		Cat cat2 = new Cat("Luska", 5);
		Cat cat3 = new Cat("Barsic", 8);
		Cat cat4 = new Cat("Timka", 5);
		Cat cat5 = new Cat("Kuzia", 2);
		Cat cat6 = new Cat("Lavashik", 7);
		
		Cat[] cats = new Cat[] { cat6, cat1, cat2, cat7, cat3, cat4, cat5 };
		
		for (Cat cat : cats) {
			System.out.println(cat);
		}
		
		System.out.println();
		
		Arrays.sort(cats);
		
		for (Cat cat : cats) {
			System.out.println(cat);
		}
	}

}