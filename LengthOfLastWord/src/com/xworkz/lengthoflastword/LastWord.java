package com.xworkz.lengthoflastword;

public class LastWord {
	
	
	public int lastWord(String ref) {
		int length = 0;
		ref = ref.trim();
		for(int i=ref.length()-1;i>=0;i--) {
			if(ref.charAt(i)==' ') {
				break;
			}else {
				length ++;
			}
		}
		return length;
				
	}
	public static void main(String[] args) {
		
		String input = "my name is kiran";
		LastWord lw = new LastWord();
		System.out.println("The length of last word is "+lw.lastWord(input));lw = new LastWord();
	}

}
