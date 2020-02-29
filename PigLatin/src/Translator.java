import java.util.Scanner;

public class Translator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //What does this line do? I see it all the time
		System.out.print("What word would you like to translate to Pig Latin?: ");
		String word = in.next();
		System.out.println("Original Word: " + word); // prints original word
		System.out.println("Translated Word: " + solve(word)); //Solves word by running through solve method
	}
	
	public static String solve(String word) {
		String temp = word.toLowerCase();
		
		char[] vowels = {'a','e','i','o','u'}; //stores all chars vowels into array.
		char first = temp.charAt(0); //gets the first letter of a word stored in temp using the charAt() method.
		
		for(int i = 0; i < vowels.length; i++) {
			if(first == vowels[i]) { //if first letter is equal to vowels array index
				return word + "yay"; //out puts string with word + way
			}
		}
		
		//EX: Dog = og using substring(1) method
		word = word.substring(1); //sets word equal to the same word but with oneless letter in the beginning
		
		word += first + "ay"; //EX: Dog -> og + d + ay = ogday
		
		return word; //returns final word value
	}
}


//SOURCE: https://github.com/edeng/Problems/blob/master/PigLatin.java
//IDEAS: https://www.dreamincode.net/forums/topic/78802-martyr2s-mega-project-ideas-list/
//https://www.reddit.com/r/learnprogramming/comments/2a9ygh/1000_beginner_programming_projects_xpost/
//https://github.com/karan/Projects