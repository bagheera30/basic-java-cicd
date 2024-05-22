package com.example;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		

		System.out.println("Current count: " + counter.getCount());


    }


}