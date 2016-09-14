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
		
		//if -else for replacing constants
		

        // Determine whether the first character in word is a vowel
        char firstChar = word.charAt(0); 
        String vowels = "aeiou";		
        int vowelIndex = vowels.indexOf(firstChar);
        
        
		}
        
        
        //Ending prompt
		
	}

}

