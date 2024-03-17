import java.util.*;

public class easy {

	/*
		The function should return a boolean value reflecting is the input string is a palindrome or not. See the TODO comments.

		Note: The input string contains uppercase and lowercase letters and spaces, but no special characters.
        
        	Note: The boolean returned should not rely on upper/lowercase letters or spaces.
        	("racecar", "RacecAr", and "race car" should all return true)

		Input:
		@param: string --> String to determine if it is a Palindrome

		Output:
		A boolean value.
        	True: if the input string is a palindrome
        	False: if the input string is not a palindrome
	*/
	
    public static boolean isPalindrome(String str) {
            // Hint: Remove spaces and convert to lowercase for case-insensitive comparison
            
            // TODO: Check is the string is a palindrome.

            // TODO: return the result
            return true;
        }

	/*
	* It is unnecessary to edit the "main" method of each problem's provided code
	* skeleton. The main method is written for you in order to help you conform to
	* input and output formatting requirements.
	*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String inputString = scanner.nextLine();
        
        	// Function Call
        	System.out.println(isPalindrome(inputString));
        
        	scanner.close();
	}
}
