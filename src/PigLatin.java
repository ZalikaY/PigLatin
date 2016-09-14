import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		//Welcome message
		System.out.println("Welcome to the Pig Latin Translator!");
		
		System.out.println();
		
		StringBuffer str = new StringBuffer();
	
		
		String end = "y";
		
		
		//While loop
		while (end.equalsIgnoreCase("y")){
		
		Scanner trans = new Scanner(System.in);
		
		//User prompt
		System.out.println("Enter a line to be translated: ");
		String word= trans.nextLine();
		
		//Set word to lowercase
		word = word.toLowerCase();
		
		

        // Determine whether the first character in word is a vowel
        char firstChar = word.charAt(0); 
        String vowels = "aeiou";	
        
        //Index of the vowels
        int vowelIndex = vowels.indexOf(firstChar);
        boolean firstVowel = (vowelIndex >= 0); 


        //if -else for replacing consonants
        if (firstVowel) {
            System.out.println(word + "hay\"");
        }
        else {
        	
        	// first character is consonant, assuming it is a letter
            String restOfWord = word.substring(1); //substring is all but first character
            
            System.out.println(restOfWord + firstChar + "ay");
		}
		}
        
        //Ending prompt
		
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

