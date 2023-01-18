package io.github.fusion;

import java.util.Random;

public class Main {
	
	public static void main(String args[]) {
		//Can set length to be any size
			generatePassword(12);
	}
	
	public static String generatePassword(int length) {
	    char[] characters = {'0','1','2','3','4','5','6','7','8','9',
	    'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
	    '!', '@', '#', '$', '%', '^', '&', '*', '-', '_', '+', '=', ':', ';', '"', '?', '.', '`', '~'};
	    Random random = new Random();
	    String password = "";
	    for (int i = 0; i < length; i++) {
	    	//Loops through desired character amount and chooses a random index to add to the password
	        int randint = random.nextInt(characters.length);
	        password += characters[randint];
	    }
	    System.out.print(password);
	    return password;
	}


}
