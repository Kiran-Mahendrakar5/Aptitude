package com.xworkz.collectionss.one.inter;

public class main {
	
	public static void main(String[] args) {
		                     //implementaing FunInterOne as two parameter  
		FunInterOne ref = (int x, int y) -> x + y;
		// It takes two integer parameters x and y and returns their sum x + y
		
		int result = ref.operation(5, 3); //accept input as paremter
        System.out.println("Result: " + result);//return a result value
        
        
//        ref  passing 5 and 3 as arguments. 
//        The lambda expression (int x, int y) -> x + y gets executed
//        and it returns the sum 5 + 3 which is 8
       
	}

}
