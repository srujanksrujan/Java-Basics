package com.practice;

public class HelloWorld {

	public static void main(String[] stringArry) {
		// TODO Auto-generated method stub
		System.out.println("Hello First Program");
		String nameString="Srujan";
		
		System.out.println("Hello "+nameString);
		
		if(stringArry != null && stringArry.length >0){
			System.out.println("This is my first argument value "+stringArry[0]);
		}
		
		if(stringArry != null && stringArry.length >1){
			System.out.println("This is my second argument value "+stringArry[1]);
		}
		
		long i=100;
		double salary = 10.245d;
		
		
		System.out.println("employee id: "+i);
		System.out.println("employee name: "+nameString);
		System.out.println("employee Salary: "+salary);
		
		boolean flag = i>1000;
		if(flag){
			System.out.println("I will go to Movie");
		}else{
			System.out.println("I will go to class");
		}
	}

}
