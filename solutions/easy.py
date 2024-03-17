"""
The function should return a boolean value reflecting is the input string is a palindrome or not.

Note: The input string contains uppercase and lowercase letters and spaces, but no special characters.

Note: The boolean returned should not rely on upper/lowercase letters or spaces.  
Ex: "racecar", "RacecAr", and "race car" should all return true.

Input:
@param: string --> String to determine if it is a Palindrome

Output:
A boolean value.
True: if the input string is a palindrome
False: if the input string is not a palindrome
"""

def isPalindrome(s):
    # Remove spaces and convert to lowercase for case-insensitive comparison
    s = ''.join(s.split()).lower()
    
    left, right = 0, len(s) - 1
    
    while left < right:
        if s[left] != s[right]:
            return False  # Not a palindrome
        left += 1
        right -= 1
    
    return True  # Palindrome

# It is unnecessary to edit the "main" function of each problem's provided code skeleton.
# The main function is written for you in order to help you conform to input and output formatting requirements.

def main():
    input_string = input("Enter a string: ")
    print(f"{isPalindrome(input_string)}")

main()
